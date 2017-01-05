
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PhotoUtil {

	//获取所有照片名称，并存入List列表里
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
	
	//复制照片到指定目录
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
     * 删除文件 
     * @param filePathAndName String 文件路径及名称 如c:/fqf.txt 
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
           System.out.println("删除文件操作出错"); 
           e.printStackTrace();

       }

   }

}
