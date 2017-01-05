package filecompare;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo01 {

	public static void main(String[] args) {
		//�ļ���Ҫ�þ���·��
		//���·��Ҳ���ԣ���������Ū��
//		String fileName1 = "D:/apache-tomcat-7.0.54 - 8080/webapps/school";//д����Ҫ�жϵĵ�һ���ļ����ļ���
//		String fileName2 = "D:/apache-tomcat-7.0.54 - 8090/webapps/school";//д����Ҫ�жϵĵڶ����ļ����ļ���
		
		String fileName1="e:/��ͥ������.pdf";
		String fileName2="f:/���ķ�-��ͥ������.pdf";
		
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		try {
			fis1 = new FileInputStream(fileName1);
			fis2 = new FileInputStream(fileName2);
			
			int len1 = fis1.available();
			int len2 = fis2.available();
			
			if (len1 == len2) {//������ͬ����ȽϾ�������
				//���������ֽڻ�����
				byte[] data1 = new byte[len1];
				byte[] data2 = new byte[len2];
				
				//�ֱ������ļ������ݶ��뻺����
				fis1.read(data1);
				fis2.read(data2);
				
				//���αȽ��ļ��е�ÿһ���ֽ�
				for (int i=0; i<len1; i++) {
					//ֻҪ��һ���ֽڲ�ͬ�������ļ��Ͳ�һ��
					if (data1[i] != data2[i]) {
						System.out.println("�ļ����ݲ�һ��");
						return;
					}
				}
				
				System.out.println("�����ļ���ȫ��ͬ");
			} else {
				//���Ȳ�һ�����ļ��϶���ͬ
				System.out.println("�ļ����ݲ���ͬ��");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {//�ر��ļ�������ֹ�ڴ�й©
			if (fis1 != null) {
				try {
					fis1.close();
				} catch (IOException e) {
					//����
					e.printStackTrace();
				}
			}
			if (fis2 != null) {
				try {
					fis2.close();
				} catch (IOException e) {
					//����
					e.printStackTrace();
				}
			}
		}
	}
}
