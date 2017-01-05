import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class photo {

	public static void main(String[] args) {
		String excelPath = PropertiesUtil.getInstance().getParam("excelPath");
		String photoPath = PropertiesUtil.getInstance().getParam("photoPath");
		
		
		 try {
			//读取excel文件
			FileInputStream instream = new FileInputStream(excelPath);
			ExcelUtil excelUtil = new ExcelUtil(); 
			Map<String,ArrayList<ArrayList<String>>> smap = excelUtil.readExcel(instream);//读excel数据，返回学生map，key是班级名称，value每一个班级对应的工作班的数据
			
			Map<String,ArrayList<String>> photoMap = getPhotoMap(smap);
			//读取照片文件
			Utils.changePhotoName(photoPath, photoMap);
			
			System.out.println("处理完成！");
		} catch (Exception e) {
			e.printStackTrace();
		}   
		  
		
	}
	
	
	private static Map<String,ArrayList<String>> getPhotoMap(Map<String,ArrayList<ArrayList<String>>> smap)
	{
		Map<String,ArrayList<String>> keyMap = new HashMap<String,ArrayList<String>>();
		for(String key : smap.keySet())//一个key代表一个班
		{
			ArrayList<ArrayList<String>> lists = smap.get(key);//获取班级对应的学生信息列表
			//遍历每一行数据，从第二行开始
		      for(int i = 1; i < lists.size(); i++)
		      {
		    	  ArrayList<String> values = lists.get(i);
		    	  if(null != values && values.size() >=2)
		    	  {
		    		  keyMap.put(values.get(2).replace(" ", ""), values);
		    	  }
		    	  
		      }
		}
		
		return keyMap;
	}
	
	
    
    
    
    
	
}
