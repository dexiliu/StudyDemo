import java.io.File;
import java.util.ArrayList;

/**
 * 生命名照片，规则是照片名称必须有学生姓名和其他字符
 * @author Administrator
 *
 */

public class RenamePhoto {

	final static String excel = PropertiesUtil.getInstance().getParam("excel");//表格的路径
	final static String src = PropertiesUtil.getInstance().getParam("allPhoto");//照片的源路径
	
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> arrList=ExcelUtil.readExcel(excel);//获取excel表格里的学生姓名，例如：[xxx,xxx][xxx,xxx]
		File[] files=getFileName(src);
		
		for(ArrayList<String> list:arrList){//循环各子工作表
			list.remove(0);
			for(int i=0;i<list.size();i++){//循环excel表格里的行数量大小
				for(int j=0;j<files.length;j++){//照片的数量大小
					String name=files[j].toString();
					if(name.indexOf(list.get(i))>0){
						files[j].renameTo(new File(files[j].getParent()+File.separator+list.get(i)+".jpg"));
					}
				}
			}
		}
	}
	
	public static File[] getFileName(String src){
		File file=new File(src);
		File[] files=file.listFiles();
		return files;
	}

}
