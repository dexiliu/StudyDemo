import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Utils {
	
	
	public static void changePhotoName(String path, Map<String,ArrayList<String>> photoMap)
	{
		File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){
            	if(getExtensionName(f.getName()).equals("JPG") || getExtensionName(f.getName()).equals("jpg"))
            	{
            		System.out.println(path + "\\" + f.getName());
            		String photoName = getFileNameNoEx(f.getName());
            		List<String> values = photoMap.get(photoName);
            		if(null != values && values.size() > 0)
            		{
            			String newName = values.get(0).toString().replace(" ", "") + values.get(1).toString().replace(" ", "") + ".jpg";
                		File newFile=new File(path + "/" + newName);
                		f.renameTo(newFile);
                		System.out.println(newFile.toString());
            		}
            		else
            		{
            			File newFile=new File(path + "/" + getFileNameNoEx(f.getName()).replace(" ", "") + ".jpg");
                		f.renameTo(newFile);
            			continue;
            		}
            		
            	}
                 
            }else if(f.isDirectory()){  
            	changePhotoName(f.getPath(), photoMap);  
            }  
        }  
	}

	 /** 
     * 遍历文件夹中的文件并显示 
     */  
    public static void showAllfile(String path){  
        File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){
            	System.out.println(getFileNameNoEx(f.getName())); 
            }else if(f.isDirectory()){  
            	showAllfile(f.getPath());  
            }  
        }  
          
    }
    
    /** 
     * 只显示大写的JPG文件 
     */  
    public static void showJPGfile(String path){  
        File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){
            	if(getExtensionName(f.getName()).equals("JPG"))
            	{
            		System.out.println(getFileNameNoEx(f.getName())); 
            	}
            	
            }else if(f.isDirectory()){  
            	showJPGfile(f.getPath());  
            }  
        }  
          
    }
    
    public static void quKongGe(String path)
    {  
        File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){
            	int kg = getFileNameNoEx(f.getName()).indexOf(" ");
            	if(kg >= 0)
            	{
            		System.out.println(path + "\\" + f.getName()); 
            		File newFile=new File(path + "/" + getFileNameNoEx(f.getName()).replace(" ", "") + ".jpg");
            		f.renameTo(newFile);
            		
            	}
                 
            }else if(f.isDirectory()){  
            	quKongGe(f.getPath());  
            }  
        }  
          
    }
    
    public static void quXiaHuaXian(String path)
    {  
        File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){
            	int kg = getFileNameNoEx(f.getName()).indexOf("_");
            	if(kg >= 0)
            	{
            		System.out.println(path + "\\" + f.getName()); 
            		File newFile=new File(path + "/" + f.getName().replace("_", "").replace(" ", ""));
            		f.renameTo(newFile);
            		
            	}
                 
            }else if(f.isDirectory()){  
            	quXiaHuaXian(f.getPath());  
            }  
        }  
          
    }
	
	 /** 
     * 改名字
     */  
    public static void renamefile(String path){  
        File file=new File(path);  
        File[] files=file.listFiles();  
        //System.out.println(files.length);  
          
        for (File f : files) {  
            if(f.isFile()){
            	if(getExtensionName(f.getName()).equals("JPG"))
            	{
            		System.out.println(path + "\\" + f.getName()); 
            		File newFile=new File(path + "/" + getFileNameNoEx(f.getName()) + ".jpg");
            		f.renameTo(newFile);
            		
            	}
                 
            }else if(f.isDirectory()){  
            	renamefile(f.getPath());  
            }  
        }  
          
    }
    
    public static String getExtensionName(String filename) {   
        if ((filename != null) && (filename.length() > 0)) {   
            int dot = filename.lastIndexOf('.');   
            if ((dot >-1) && (dot < (filename.length() - 1))) {   
                return filename.substring(dot + 1);   
            }   
        }   
        return filename;   
    }
    
    public static String getFileNameNoEx(String filename) {   
        if ((filename != null) && (filename.length() > 0)) {   
            int dot = filename.lastIndexOf('.');   
            if ((dot >-1) && (dot < (filename.length()))) {   
                return filename.substring(0, dot);   
            }   
        }   
        return filename;   
    }
}
