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
			
			//��ȡ��Ƭ�ļ�
			Utils.quXiaHuaXian(photoPath);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		  
		
	}
	
	
	private static Map<String,ArrayList<String>> getPhotoMap(Map<String,ArrayList<ArrayList<String>>> smap)
	{
		Map<String,ArrayList<String>> keyMap = new HashMap<String,ArrayList<String>>();
		for(String key : smap.keySet())//һ��key����һ����
		{
			ArrayList<ArrayList<String>> lists = smap.get(key);//��ȡ�༶��Ӧ��ѧ����Ϣ�б�
			//����ÿһ�����ݣ��ӵڶ��п�ʼ
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
