package filecompare;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo01 {

	public static void main(String[] args) {
		//文件名要用绝对路径
		//相对路径也可以，但是容易弄错
//		String fileName1 = "D:/apache-tomcat-7.0.54 - 8080/webapps/school";//写你需要判断的第一个文件的文件名
//		String fileName2 = "D:/apache-tomcat-7.0.54 - 8090/webapps/school";//写你需要判断的第二个文件的文件名
		
		String fileName1="e:/家庭报告书.pdf";
		String fileName2="f:/杨文菲-家庭报告书.pdf";
		
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		try {
			fis1 = new FileInputStream(fileName1);
			fis2 = new FileInputStream(fileName2);
			
			int len1 = fis1.available();
			int len2 = fis2.available();
			
			if (len1 == len2) {//长度相同，则比较具体内容
				//建立两个字节缓冲区
				byte[] data1 = new byte[len1];
				byte[] data2 = new byte[len2];
				
				//分别将两个文件的内容读入缓冲区
				fis1.read(data1);
				fis2.read(data2);
				
				//依次比较文件中的每一个字节
				for (int i=0; i<len1; i++) {
					//只要有一个字节不同，两个文件就不一样
					if (data1[i] != data2[i]) {
						System.out.println("文件内容不一样");
						return;
					}
				}
				
				System.out.println("两个文件完全相同");
			} else {
				//长度不一样，文件肯定不同
				System.out.println("文件内容不相同！");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {//关闭文件流，防止内存泄漏
			if (fis1 != null) {
				try {
					fis1.close();
				} catch (IOException e) {
					//忽略
					e.printStackTrace();
				}
			}
			if (fis2 != null) {
				try {
					fis2.close();
				} catch (IOException e) {
					//忽略
					e.printStackTrace();
				}
			}
		}
	}
}
