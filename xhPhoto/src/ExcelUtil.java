

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationConstraint.OperatorType;
import org.apache.poi.ss.usermodel.DataValidationConstraint.ValidationType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtil {

    
    
    private StringBuffer errorMessage;  //解析Excel文件时遇到的错误信息，用于存储错误单元格的位置信息和错误原因
    
    /**
     * 读入Excel文件，解析单元格内容，并存入二维数组
     * @param fileInputStream
     * @return String类型的二维数组
     * @throws Exception 
     */
    public Map<String, ArrayList<ArrayList<String>>> readExcel(FileInputStream fileInputStream) throws Exception {

        //声明并初始化一个工作薄对象
        Workbook wb = null;
        //存储解析后的Excel中的内容的二维数组
        Map<String, ArrayList<ArrayList<String>>> map = new HashMap<String, ArrayList<ArrayList<String>>>();

        try {
            //生成Excel工作薄对象
            wb = WorkbookFactory.create(fileInputStream);
            
            int num = wb.getNumberOfSheets();//获取工作表的个数
            
            for(int i = 0 ; i < num ; i++)
            {
            	//获得工作薄中的第一个工作表
                Sheet sheet = wb.getSheetAt(i);
                //获取工作表的名称
                String sn = sheet.getSheetName();
                FormulaEvaluator  evaluator = wb.getCreationHelper().createFormulaEvaluator();
                //调用readRows方法，逐行解析工作表中内容
                ArrayList<ArrayList<String>> list = readRows(sheet, evaluator); 
                
                map.put(sn, list);//放进map中
            }
            

            //解析Excel文件结束后，关闭输入流
            fileInputStream.close();
        }catch(IOException e){
            throw (new Exception("导入失败，请重新尝试！"));
        } catch (InvalidFormatException e) {
            throw (new Exception("文件格式不合法！"));
        } catch(Exception e){
            throw (new Exception("文件类型不合法！"));
        }

        return map;
    }

    /**
     * 逐行解析工作表中的内容
     * @param sheet
     * @return 解析工作表后生成的二维数组
     * @throws Exception
     */
    private ArrayList<ArrayList<String>> readRows(Sheet sheet, FormulaEvaluator evaluator) {

        //声明并初始化String类型的二维数组，用于存储解析后的工作表中的内容
        ArrayList<ArrayList<String>> list= new ArrayList<ArrayList<String>>();

        //获得该工作表的行数
        int rows = sheet.getPhysicalNumberOfRows();
        int rowIndex = 0;        //每行索引
        int notnullRowIndex = 0; //非空行索引
        while (notnullRowIndex < rows) {
            //解析该行中的每个单元格
            Row row = sheet.getRow(rowIndex);
            rowIndex++;
            System.out.println(rowIndex);
            if (row != null) {
                //将每行解析出的一维数组加入到list中
                list.add(readCells(row, evaluator));
                notnullRowIndex++;
            }
        }
        return list;
    }   

    /**
     * 解析工作表中的一行数据
     * @param row
     * @return 本行解析后的一维数组
     * @throws Exception
     */
    private ArrayList<String> readCells(Row row, FormulaEvaluator evaluator) {

        //获得本行所有单元格
        int cells  = row.getPhysicalNumberOfCells();
        int cellIndex = 0;         //单元格索引
        int notnullCellIndex = 0;  //非空单元格索引

        //声明并初始化一个一维数组，用于存储改行解析后的数据
        ArrayList<String> rowlist = new ArrayList<String>();

        //逐个解析该行的单元格
        while(notnullCellIndex < cells) {

            //取得一个单元格
            Cell cell = row.getCell(cellIndex);
            
            
            cellIndex++;
            if (cell != null) {
                String value = null;

                //根据单元格内容的类型分别处理
                switch (cell.getCellType()) {                                   
                case Cell.CELL_TYPE_FORMULA:
                	CellValue tcell = evaluator.evaluate(cell);
                	double iCellValue = tcell.getNumberValue();
                	value = iCellValue + "";
                    break; 
                case Cell.CELL_TYPE_NUMERIC:{

                    //若该单元格内容为数值类型，则判断是否为日期类型
                    if(cell.getCellStyle().getDataFormatString().equals("yyyy\"年\"m\"月 \";@") || HSSFDateUtil.isCellDateFormatted(cell)){                            
                        try{
                            //若转换发生异常，则记录下单元格的位置，并跳过该行的读取
                            value = String.valueOf(DateUtil.dateToString(cell.getDateCellValue(), "yyyy-MM-dd"));
                        }catch(Exception e){
                            errorMessage.append(row.getRowNum()+"行"+notnullCellIndex+"列"+"日期格式错误;");
                            return null;
                        }

                    }else{
                        try {
                            //将数字类型转换为字符串类型，若为浮点类型数据，则去除掉小数点后的内容
                            value = doubleToStr(cell.getNumericCellValue());
                        }catch(Exception e){
                            //若转换发生异常，则记录下单元格的位置，并跳过该行的读取
                            errorMessage.append(row.getRowNum()+"行"+notnullCellIndex+"列"+"数字格式错误;");
                            return null;
                        }
                    }
                    break; 
                }
                case Cell.CELL_TYPE_STRING:   
                    value = cell.getStringCellValue().replaceAll(" ", "");   
                    break;                
                case Cell.CELL_TYPE_BLANK:   
                    value = "";                            
                    break;
                default: {
                    //若单元格内容的格式与常规类型不符，则记录下单元格位置，并跳过该行的读取，继续解析下一行
                    errorMessage.append(row.getRowNum()+"行"+notnullCellIndex+"列"+"格式与常规类型不符;");
                    return null;
                }  
                }   
                notnullCellIndex++;
                //将该单元格的内容存入一维数组
                rowlist.add(value); 
                System.out.println(value);
            }
        } 
        return rowlist;
    }


    
    
    /**
     * 根据传入的list和文件名生成Excel文件
     * 保存到target/temp文件夹中，下载完毕后删除临时文件
     * 并设置数据的有效性
     * 崔
     * @param list
     */
    public HSSFWorkbook writeExcel(ArrayList<ArrayList<String>> list,HSSFDataValidation dataValidation){
        // 取得规则  
        //实例化工作薄对象
        HSSFWorkbook wb = new HSSFWorkbook();  
        //创建一个工作表
        HSSFSheet sheet = wb.createSheet();  
        //设置单元格的格式
        sheet.addValidationData(dataValidation);
        HSSFCellStyle style = wb.createCellStyle();
        style.setFillPattern(HSSFCellStyle.NO_FILL);
        
        for(int i = 0;i < list.size();i++){
            //创建一行
            HSSFRow row = sheet.createRow(i);
            
            ArrayList<String> rowlist = list.get(i);
            for(int j = 0;j < rowlist.size();j++){
                //创建一个单元格，并根据数组中的内容填充该单元格
                HSSFCell cell = row.createCell(j);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellStyle(style);
                cell.setCellValue(rowlist.get(j));
            }
        }
        
        return wb;
    }
    /**
     * 设置舒服的有效性
     * 崔
     * @param firstRow 起始行
     * @param firstCol 终止行
     * @param endRow   起始列
     * @param endCol   终止列 
     * @return
     */
    public  HSSFDataValidation setDataValidationView(short firstRow,short firstCol,short endRow, short endCol){  
        //构造constraint对象   
        DVConstraint constraint=DVConstraint.createCustomFormulaConstraint("B1");  
        //四个参数分别是：起始行、终止行、起始列、终止列   
        CellRangeAddressList regions=new CellRangeAddressList(firstRow,firstCol,endRow,endCol);  
        //数据有效性对象   
        HSSFDataValidation data_validation_view = new HSSFDataValidation(regions, constraint);  
         
        return data_validation_view;  
    } 
    /**
     * 设置舒服的有效性
     * 崔
     * @param firstRow 起始行
     * @param firstCol 终止行
     * @param endRow   起始列
     * @param endCol   终止列 
     * @return
     */
    public static HSSFDataValidation setDataValidationList(short firstRow,short firstCol,short endRow, short endCol){  
        //设置下拉列表的内容   
        String[] textlist={"是","否"};  
         
        //加载下拉列表内容   
        DVConstraint constraint=DVConstraint.createExplicitListConstraint(textlist);  
        //设置数据有效性加载在哪个单元格上。   
         
        //四个参数分别是：起始行、终止行、起始列、终止列   
        CellRangeAddressList regions=new CellRangeAddressList(firstRow,firstCol,endRow,endCol);  
        //数据有效性对象   
        HSSFDataValidation data_validation_list = new HSSFDataValidation(regions, constraint);  
         
        return data_validation_list;  
    }  
    public static DataValidation setValidate(XSSFSheet sheet, short beginRow,  
            short beginCol, short endRow, short endCol) {  
        XSSFDataValidationHelper helper = new XSSFDataValidationHelper(sheet);  
        DataValidationConstraint constraint = helper.createNumericConstraint(  
                ValidationType.INTEGER, OperatorType.BETWEEN, "1", "100");  
        CellRangeAddressList regions = new CellRangeAddressList(beginRow,  
                beginCol, endRow, endCol);  
        return helper.createValidation(constraint, regions);  
    }  
    public StringBuffer getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(StringBuffer errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    

	//获取excel表格里的学生名字
	public static ArrayList<ArrayList<String>> readExcel(String filePath) {
		ArrayList<ArrayList<String>> arrList=new ArrayList<ArrayList<String>>();
		String cellStr = "";
		boolean isE2007 = false; // 判断是否是excel2007格式
		if (filePath.endsWith("xlsx"))
			isE2007 = true;
		try {
			InputStream input = new FileInputStream(filePath); // 建立输入流
			Workbook wb = null;
			// 根据文件格式(2003或者2007)来初始化
			if (isE2007)
				wb = new XSSFWorkbook(input);//2007
			else
				wb = new HSSFWorkbook(input);//2003
			int num = wb.getNumberOfSheets();// 获取工作表的个数
			for (int i = 0; i < num; i++) {
				ArrayList<String> list = new ArrayList<String>();
				// 获得工作薄中的第i+1个工作表
				Sheet sheet = wb.getSheetAt(i);
				String sheetName=sheet.getSheetName();
				list.add(sheetName);
				Iterator<Row> rows = sheet.rowIterator(); // 获得第一个表单的迭代器
				while (rows.hasNext()) {
					Row row = rows.next(); // 获得行数据
					Iterator<Cell> cells = row.cellIterator(); // 获得第一行的迭代器
					while (cells.hasNext()) {
						Cell cell = cells.next();
						switch (cell.getCellType()) { // 根据cell中的类型来获取数据
						case HSSFCell.CELL_TYPE_NUMERIC:
							cellStr = cell.getNumericCellValue() + "";
							break;
						case HSSFCell.CELL_TYPE_STRING:
							cellStr = cell.getStringCellValue();
							break;
						case HSSFCell.CELL_TYPE_BOOLEAN:
							cellStr = String
									.valueOf(cell.getBooleanCellValue());
							break;
						case HSSFCell.CELL_TYPE_FORMULA:
							break;
						default:
							System.out.println("unsuported sell type");
							break;
						}
						list.add(cellStr);
					}
				}
				list.remove(1);//把表头去掉
				arrList.add(list);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return arrList;
	}
	
	/**
	 * doublel转String类型，长数字转成非科学计数法
	 * 不用科学计数法显示数字
	 * @param d
	 * @return
	 */
	public static String doubleToStr(double d)
	{
		java.text.NumberFormat nf = java.text.NumberFormat.getInstance();   
		nf.setGroupingUsed(false);  
		return nf.format(d).replace(" ", "");   
	}
}

