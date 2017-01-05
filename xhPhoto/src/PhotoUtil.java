
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PhotoUtil {

	//��ȡ������Ƭ���ƣ�������List�б���
	public static ArrayList<Map<String,String>> getMap(String src){
		
		ArrayList<Map<String,String>> lists = new ArrayList<Map<String,String>>();
		File file=new File(src);
		File[] list=file.listFiles();
		for(int i=0;i<list.length;i++){
			Map<String,String> map=new HashMap<String,String>();
			map.put("name", list[i].getName());
			map.put("path", list[i].toString());
			lists.add(map);
		}
		return lists;
	}
	
	//������Ƭ��ָ��Ŀ¼
	public static void copy(String src,String dest) throws IOException{
		try {
			FileInputStream input=new FileInputStream(src);
			FileOutputStream output=new FileOutputStream(dest);
			byte[] b=new byte[1024];
			int len;
			while((len=input.read(b))!=-1){
				output.write(b, 0, len);
			}
			output.flush();
			output.close();
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	 /** 
     * ɾ���ļ� 
     * @param filePathAndName String �ļ�·�������� ��c:/fqf.txt 
     * @param fileContent String 
     * @return boolean 
     */ 
   public static void delFile(String filePathAndName) { 
       try { 
           String filePath = filePathAndName; 
           filePath = filePath.toString(); 
           java.io.File myDelFile = new java.io.File(filePath); 
           myDelFile.delete();

       } 
       catch (Exception e) { 
           System.out.println("ɾ���ļ���������"); 
           e.printStackTrace();

       }

   }

}
