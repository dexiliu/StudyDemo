package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import demo.demo;


public class CopyFile {

	public static void main(String[] args) throws IOException {
		CopyFile d = new CopyFile();
		Class c = d.getClass();
		System.out.println(c.getName());
		String clazz = Thread.currentThread().getStackTrace()[1].getClassName();
		System.out.println(clazz);
		String method = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(method);
	}
	
	//�ƶ��ļ�
	public static void remove(){
		try{
			File file=new File("D:\\studentPhotos\\findphotos\\find\\Ҷ����G350583200102197129.jpg");
			boolean b=file.renameTo(new File("D:\\studentPhotos\\findphotos\\all\\"+file.getName()));
			System.out.println(b);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void copy() throws IOException{
		try {
			FileInputStream input=new FileInputStream("D:\\studentPhotos\\findphotos\\all\\ׯ����G350628200011193043.jpg");
			FileOutputStream output=new FileOutputStream("D:\\studentPhotos\\findphotos\\find\\ׯ����G350628200011193043.jpg");
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

}
