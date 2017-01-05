import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class photo {

	public static void main(String[] args) {
		String excelPath = PropertiesUtil.getInstance().getParam("excelPath");
		String photoPath = PropertiesUtil.getInstance().getParam("photoPath");
		
		
		 try {
			//��ȡexcel�ļ�
			FileInputStream instream = new FileInputStream(excelPath);
			ExcelUtil excelUtil = new ExcelUtil(); 
			Map<String,ArrayList<ArrayList<String>>> smap = excelUtil.readExcel(instream);//��excel���ݣ�����ѧ��map��key�ǰ༶���ƣ�valueÿһ���༶��Ӧ�Ĺ����������
			
			Map<String,ArrayList<String>> photoMap = getPhotoMap(smap);
			//��ȡ��Ƭ�ļ�
			Utils.changePhotoName(photoPath, photoMap);
			
			System.out.println("������ɣ�");
		} catch (Exception e) {
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
		    		  keyMap.put(values.get(2).replace(" ", ""), values);
		    	  }
		    	  
		      }
		}
		
		return keyMap;
	}
	
	
    
    
    
    
	
}
