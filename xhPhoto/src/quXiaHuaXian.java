import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class quXiaHuaXian {

	public static void main(String[] args) {
	
		String photoPath = PropertiesUtil.getInstance().getParam("photoPath");
		
		
		 try {
			
			//读取照片文件
			Utils.quXiaHuaXian(photoPath);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		    		  keyMap.put(values.get(2), values);
		    	  }
		    	  
		      }
		}
		
		return keyMap;
	}
	
	
    
    
    
    
	
}
