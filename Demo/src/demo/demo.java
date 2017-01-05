package demo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class demo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String clazz = Thread.currentThread().getStackTrace()[1].getClassName().replace(".", ",");
		String[] cla=clazz.split(",");
		for(String str:cla){
			System.out.println(str);
		}
		System.out.println(clazz);
		String method = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(method);
		System.out.println("===================");
		suan();
	}
	
	public static void suan(){
		String clazz = Thread.currentThread().getStackTrace()[1].getClassName().replace(".", ",");
		String[] cla=clazz.split(",");
		for(String str:cla){
			System.out.println(str);
		}
		System.out.println(clazz);
		String method = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(method);
	}
	
	public static boolean string_list(String str,List<String> list){
		boolean flag=false;
		for(String str1:list){
			if(!str.equals(str1)){
				continue;
			}else{
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public static void exec(String cmd){
		try{
			ProcessBuilder builder=new ProcessBuilder();
			builder.command(cmd);
			builder.redirectErrorStream(true);
			Process proc=builder.start();
			BufferedReader stdout=new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line=null;
			while((line=stdout.readLine())!=null){
				System.out.println(line);
			}
			proc.waitFor();
			stdout.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	 public static void unzip(String zipFilePath, String targetPath)
	             throws IOException {
	         OutputStream os = null;
	         InputStream is = null;
	         ZipFile zipFile = null;
	         try {
	             zipFile = new ZipFile(zipFilePath,Charset.forName("gbk"));
	             String directoryPath = "";
	             if (null == targetPath || "".equals(targetPath)) {
	                 directoryPath = zipFilePath.substring(0, zipFilePath
	                        .lastIndexOf("."));
	             } else {
	                 directoryPath = targetPath;
	             }
	             Enumeration entryEnum = zipFile.entries();
	             if (null != entryEnum) {
	                 ZipEntry zipEntry = null;
	                 while (entryEnum.hasMoreElements()) {
	                     zipEntry = (ZipEntry) entryEnum.nextElement();
	                    if (zipEntry.isDirectory()) {
	                        directoryPath = directoryPath + File.separator
	                                 + zipEntry.getName();
	                         System.out.println(directoryPath);
	                         continue;
	                     }
	                     if (zipEntry.getSize() > 0) {
	                         // �ļ�
	                         File targetFile = buildFile(directoryPath
	                                 + File.separator + zipEntry.getName(), false);
	                         os = new BufferedOutputStream(new FileOutputStream(
	                                 targetFile));
	                         is = zipFile.getInputStream(zipEntry);
	                         byte[] buffer = new byte[4096];
	                         int readLen = 0;
	                         while ((readLen = is.read(buffer, 0, 4096)) >= 0) {
	                            os.write(buffer, 0, readLen);
	                         }
	 
	                         os.flush();
	                         os.close();
	                    } else {
	                         // ��Ŀ¼
	                        buildFile(directoryPath + File.separator
	                                + zipEntry.getName(), true);
	                    }
	                 }
	             }
	         } catch (IOException ex) {
	             throw ex;
	        } finally {
	             if(null != zipFile){
	                 zipFile = null;
	             }
	           if (null != is) {
	                 is.close();
	            }
	             if (null != os) {
	                os.close();
	             }
	         }
	     }

	 public static File buildFile(String fileName, boolean isDirectory) {
	        File target = new File(fileName);
	        if (isDirectory) {
	            target.mkdirs();
	        } else {
	            if (!target.getParentFile().exists()) {
	                target.getParentFile().mkdirs();
	                target = new File(target.getAbsolutePath());
	            }
	        }
	        return target;
	    } 
}
