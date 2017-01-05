package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;


import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;

/**
 * 读取zip压缩文件中文本的内容
 * 
 */
public class ReadZip {
	public static void main(String args[]) throws UnsupportedEncodingException {
		ReadZip zip = new ReadZip();
//		zip.fileDownload();
		zip.unZip("d:/zngsgw.zip", "d:/apache-tomcat-7.0.54 - 8090/webapps");
//		System.gc();
//		DeleteFolder("d:/apache-tomcat-7.0.54 - 8090/webapps/zngsgw.zip");
	}

	@SuppressWarnings("unchecked")
	public void unZip(String unZipfile, String destFile) {// unZipfile需要解压的zip文件名
		FileOutputStream fileOut;
		File file;
		InputStream inputStream;
		ZipFile zipFile;
		byte[] buf = new byte[1024 * 4];
		try {
			// 生成一个zip的文件
			zipFile = new ZipFile(unZipfile);
			// 遍历zipFile中所有的实体，并把他们解压出来
			for (Enumeration<ZipEntry> entries = zipFile.getEntries(); entries
					.hasMoreElements();) {
				ZipEntry entry = entries.nextElement();
				// 生成他们解压后的一个文件
				file = new File(destFile + File.separator + entry.getName());
				if (entry.isDirectory()) {
					file.mkdirs();
				} else {
					// 如果指定文件的目录不存在,则创建之.
					File parent = file.getParentFile();
					if (!parent.exists()) {
						parent.mkdirs();
					}
					// 获取出该压缩实体的输入流
					inputStream = zipFile.getInputStream(entry);

					fileOut = new FileOutputStream(file);
					int length = 0;
					// 将实体写到本地文件中去
					while ((length = inputStream.read(buf)) > 0) {
						fileOut.write(buf, 0, length);
					}
					fileOut.flush();
					fileOut.close();
					inputStream.close();
				}
			}
			zipFile.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("解压完成！");
	}
	
	@SuppressWarnings("deprecation")
	public void fileDownload()throws UnsupportedEncodingException{
		
		File filePath=new File("d:/zngsgw.zip");//要下载的压缩文件
		File save=new File("D:/apache-tomcat-7.0.54 - 8090/webapps"+"/zngsgw.zip");//下载压缩文件后保存的路径
		
		FileOutputStream out=null;
		FileInputStream in=null;
		
		try{
			out=new FileOutputStream(save);
			in=new FileInputStream(filePath);
			
			byte[] b=new byte[1024];
			int i=0;
			
			while((i=in.read(b))>0){
				out.write(b);
				out.flush();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				in=null;
			}
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				out=null;
			}
		}
		System.out.println("下载完成！");
	}
	
	/**
	 * 文件删除
	 * @param sPath
	 * @return
	 */
	public static boolean DeleteFolder(String sPath) {  
	    boolean flag = false;  
	    File file = new File(sPath);  
	    // 判断目录或文件是否存在  
	    if (!file.exists()) {  // 不存在返回 false  
	        return flag;  
	    } else {  
	        // 判断是否为文件  
	        if (file.isFile()) {  // 为文件时调用删除文件方法  
	            return deleteFile(sPath);  
	        } else {  // 为目录时调用删除目录方法  
	            return deleteDirectory(sPath);  
	        }  
	    }  
	}  
	
	/** 
	 * 删除单个文件 
	 * @param   sPath    被删除文件的文件名 
	 * @return 单个文件删除成功返回true，否则返回false 
	 */  
	public static boolean deleteFile(String sPath) {  
	    boolean flag = false;  
	    File file = new File(sPath);  
	    // 路径为文件且不为空则进行删除  
	    if (file.isFile() && file.exists()) {  
	        file.delete();  
	        flag = true;  
	    }  
	    return flag;  
	} 
	
	/** 
	 * 删除目录（文件夹）以及目录下的文件 
	 * @param   sPath 被删除目录的文件路径 
	 * @return  目录删除成功返回true，否则返回false 
	 */  
	public static boolean deleteDirectory(String sPath) {  
	    //如果sPath不以文件分隔符结尾，自动添加文件分隔符  
	    if (!sPath.endsWith(File.separator)) {  
	        sPath = sPath + File.separator;  
	    }  
	    File dirFile = new File(sPath);  
	    //如果dir对应的文件不存在，或者不是一个目录，则退出  
	    if (!dirFile.exists() || !dirFile.isDirectory()) {  
	        return false;  
	    }  
	    boolean flag = true;  
	    //删除文件夹下的所有文件(包括子目录)  
	    File[] files = dirFile.listFiles();  
	    for (int i = 0; i < files.length; i++) {  
	        //删除子文件  
	        if (files[i].isFile()) {  
	            flag = deleteFile(files[i].getAbsolutePath());  
	            if (!flag) break;  
	        } //删除子目录  
	        else {  
	            flag = deleteDirectory(files[i].getAbsolutePath());  
	            if (!flag) break;  
	        }  
	    }  
	    if (!flag) return false;  
	    //删除当前目录  
	    if (dirFile.delete()) {  
	        return true;  
	    } else {  
	        return false;  
	    }  
	}  
}
