

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

    
    
    private StringBuffer errorMessage;  //����Excel�ļ�ʱ�����Ĵ�����Ϣ�����ڴ洢����Ԫ���λ����Ϣ�ʹ���ԭ��
    
    /**
     * ����Excel�ļ���������Ԫ�����ݣ��������ά����
     * @param fileInputStream
     * @return String���͵Ķ�ά����
     * @throws Exception 
     */
    public Map<String, ArrayList<ArrayList<String>>> readExcel(FileInputStream fileInputStream) throws Exception {

        //��������ʼ��һ������������
        Workbook wb = null;
        //�洢�������Excel�е����ݵĶ�ά����
        Map<String, ArrayList<ArrayList<String>>> map = new HashMap<String, ArrayList<ArrayList<String>>>();

        try {
            //����Excel����������
            wb = WorkbookFactory.create(fileInputStream);
            
            int num = wb.getNumberOfSheets();//��ȡ������ĸ���
            
            for(int i = 0 ; i < num ; i++)
            {
            	//��ù������еĵ�һ��������
                Sheet sheet = wb.getSheetAt(i);
                //��ȡ�����������
                String sn = sheet.getSheetName();
                FormulaEvaluator  evaluator = wb.getCreationHelper().createFormulaEvaluator();
                //����readRows���������н���������������
                ArrayList<ArrayList<String>> list = readRows(sheet, evaluator); 
                
                map.put(sn, list);//�Ž�map��
            }
            

            //����Excel�ļ������󣬹ر�������
            fileInputStream.close();
        }catch(IOException e){
            throw (new Exception("����ʧ�ܣ������³��ԣ�"));
        } catch (InvalidFormatException e) {
            throw (new Exception("�ļ���ʽ���Ϸ���"));
        } catch(Exception e){
            throw (new Exception("�ļ����Ͳ��Ϸ���"));
        }

        return map;
    }

    /**
     * ���н����������е�����
     * @param sheet
     * @return ��������������ɵĶ�ά����
     * @throws Exception
     */
    private ArrayList<ArrayList<String>> readRows(Sheet sheet, FormulaEvaluator evaluator) {

        //��������ʼ��String���͵Ķ�ά���飬���ڴ洢������Ĺ������е�����
        ArrayList<ArrayList<String>> list= new ArrayList<ArrayList<String>>();

        //��øù����������
        int rows = sheet.getPhysicalNumberOfRows();
        int rowIndex = 0;        //ÿ������
        int notnullRowIndex = 0; //�ǿ�������
        while (notnullRowIndex < rows) {
            //���������е�ÿ����Ԫ��
            Row row = sheet.getRow(rowIndex);
            rowIndex++;
            System.out.println(rowIndex);
            if (row != null) {
                //��ÿ�н�������һά������뵽list��
                list.add(readCells(row, evaluator));
                notnullRowIndex++;
            }
        }
        return list;
    }   

    /**
     * �����������е�һ������
     * @param row
     * @return ���н������һά����
     * @throws Exception
     */
    private ArrayList<String> readCells(Row row, FormulaEvaluator evaluator) {

        //��ñ������е�Ԫ��
        int cells  = row.getPhysicalNumberOfCells();
        int cellIndex = 0;         //��Ԫ������
        int notnullCellIndex = 0;  //�ǿյ�Ԫ������

        //��������ʼ��һ��һά���飬���ڴ洢���н����������
        ArrayList<String> rowlist = new ArrayList<String>();

        //����������еĵ�Ԫ��
        while(notnullCellIndex < cells) {

            //ȡ��һ����Ԫ��
            Cell cell = row.getCell(cellIndex);
            
            
            cellIndex++;
            if (cell != null) {
                String value = null;

                //���ݵ�Ԫ�����ݵ����ͷֱ���
                switch (cell.getCellType()) {                                   
                case Cell.CELL_TYPE_FORMULA:
                	CellValue tcell = evaluator.evaluate(cell);
                	double iCellValue = tcell.getNumberValue();
                	value = iCellValue + "";
                    break; 
                case Cell.CELL_TYPE_NUMERIC:{

                    //���õ�Ԫ������Ϊ��ֵ���ͣ����ж��Ƿ�Ϊ��������
                    if(cell.getCellStyle().getDataFormatString().equals("yyyy\"��\"m\"�� \";@") || HSSFDateUtil.isCellDateFormatted(cell)){                            
                        try{
                            //��ת�������쳣�����¼�µ�Ԫ���λ�ã����������еĶ�ȡ
                            value = String.valueOf(DateUtil.dateToString(cell.getDateCellValue(), "yyyy-MM-dd"));
                        }catch(Exception e){
                            errorMessage.append(row.getRowNum()+"��"+notnullCellIndex+"��"+"���ڸ�ʽ����;");
                            return null;
                        }

                    }else{
                        try {
                            //����������ת��Ϊ�ַ������ͣ���Ϊ�����������ݣ���ȥ����С����������
                            value = doubleToStr(cell.getNumericCellValue());
                        }catch(Exception e){
                            //��ת�������쳣�����¼�µ�Ԫ���λ�ã����������еĶ�ȡ
                            errorMessage.append(row.getRowNum()+"��"+notnullCellIndex+"��"+"���ָ�ʽ����;");
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
                    //����Ԫ�����ݵĸ�ʽ�볣�����Ͳ��������¼�µ�Ԫ��λ�ã����������еĶ�ȡ������������һ��
                    errorMessage.append(row.getRowNum()+"��"+notnullCellIndex+"��"+"��ʽ�볣�����Ͳ���;");
                    return null;
                }  
                }   
                notnullCellIndex++;
                //���õ�Ԫ������ݴ���һά����
                rowlist.add(value); 
                System.out.println(value);
            }
        } 
        return rowlist;
    }


    
    
    /**
     * ���ݴ����list���ļ�������Excel�ļ�
     * ���浽target/temp�ļ����У�������Ϻ�ɾ����ʱ�ļ�
     * ���������ݵ���Ч��
     * ��
     * @param list
     */
    public HSSFWorkbook writeExcel(ArrayList<ArrayList<String>> list,HSSFDataValidation dataValidation){
        // ȡ�ù���  
        //ʵ��������������
        HSSFWorkbook wb = new HSSFWorkbook();  
        //����һ��������
        HSSFSheet sheet = wb.createSheet();  
        //���õ�Ԫ��ĸ�ʽ
        sheet.addValidationData(dataValidation);
        HSSFCellStyle style = wb.createCellStyle();
        style.setFillPattern(HSSFCellStyle.NO_FILL);
        
        for(int i = 0;i < list.size();i++){
            //����һ��
            HSSFRow row = sheet.createRow(i);
            
            ArrayList<String> rowlist = list.get(i);
            for(int j = 0;j < rowlist.size();j++){
                //����һ����Ԫ�񣬲����������е��������õ�Ԫ��
                HSSFCell cell = row.createCell(j);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellStyle(style);
                cell.setCellValue(rowlist.get(j));
            }
        }
        
        return wb;
    }
    /**
     * �����������Ч��
     * ��
     * @param firstRow ��ʼ��
     * @param firstCol ��ֹ��
     * @param endRow   ��ʼ��
     * @param endCol   ��ֹ�� 
     * @return
     */
    public  HSSFDataValidation setDataValidationView(short firstRow,short firstCol,short endRow, short endCol){  
        //����constraint����   
        DVConstraint constraint=DVConstraint.createCustomFormulaConstraint("B1");  
        //�ĸ������ֱ��ǣ���ʼ�С���ֹ�С���ʼ�С���ֹ��   
        CellRangeAddressList regions=new CellRangeAddressList(firstRow,firstCol,endRow,endCol);  
        //������Ч�Զ���   
        HSSFDataValidation data_validation_view = new HSSFDataValidation(regions, constraint);  
         
        return data_validation_view;  
    } 
    /**
     * �����������Ч��
     * ��
     * @param firstRow ��ʼ��
     * @param firstCol ��ֹ��
     * @param endRow   ��ʼ��
     * @param endCol   ��ֹ�� 
     * @return
     */
    public static HSSFDataValidation setDataValidationList(short firstRow,short firstCol,short endRow, short endCol){  
        //���������б������   
        String[] textlist={"��","��"};  
         
        //���������б�����   
        DVConstraint constraint=DVConstraint.createExplicitListConstraint(textlist);  
        //����������Ч�Լ������ĸ���Ԫ���ϡ�   
         
        //�ĸ������ֱ��ǣ���ʼ�С���ֹ�С���ʼ�С���ֹ��   
        CellRangeAddressList regions=new CellRangeAddressList(firstRow,firstCol,endRow,endCol);  
        //������Ч�Զ���   
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
    
    

	//��ȡexcel������ѧ������
	public static ArrayList<ArrayList<String>> readExcel(String filePath) {
		ArrayList<ArrayList<String>> arrList=new ArrayList<ArrayList<String>>();
		String cellStr = "";
		boolean isE2007 = false; // �ж��Ƿ���excel2007��ʽ
		if (filePath.endsWith("xlsx"))
			isE2007 = true;
		try {
			InputStream input = new FileInputStream(filePath); // ����������
			Workbook wb = null;
			// �����ļ���ʽ(2003����2007)����ʼ��
			if (isE2007)
				wb = new XSSFWorkbook(input);//2007
			else
				wb = new HSSFWorkbook(input);//2003
			int num = wb.getNumberOfSheets();// ��ȡ������ĸ���
			for (int i = 0; i < num; i++) {
				ArrayList<String> list = new ArrayList<String>();
				// ��ù������еĵ�i+1��������
				Sheet sheet = wb.getSheetAt(i);
				String sheetName=sheet.getSheetName();
				list.add(sheetName);
				Iterator<Row> rows = sheet.rowIterator(); // ��õ�һ�����ĵ�����
				while (rows.hasNext()) {
					Row row = rows.next(); // ���������
					Iterator<Cell> cells = row.cellIterator(); // ��õ�һ�еĵ�����
					while (cells.hasNext()) {
						Cell cell = cells.next();
						switch (cell.getCellType()) { // ����cell�е���������ȡ����
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
				list.remove(1);//�ѱ�ͷȥ��
				arrList.add(list);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return arrList;
	}
	
	/**
	 * doublelתString���ͣ�������ת�ɷǿ�ѧ������
	 * ���ÿ�ѧ��������ʾ����
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

