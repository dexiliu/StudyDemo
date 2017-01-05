package demo;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Map;

public class FilterExcel {

	private static String path="d:/studentPhotos/photo.xlsx";
	public static void main(String[] args) throws Exception {
		ExcelUtil excelUtil=new ExcelUtil();
		FileInputStream fis=new FileInputStream(path);
		Map<String,ArrayList<ArrayList<String>>> map = excelUtil.readExcel(fis);//¶ÁexcelÊý¾Ý
		for(String key:map.keySet()){
			ArrayList<ArrayList<String>> lists = map.get(key);
		}
	}

	
}
