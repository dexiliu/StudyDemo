package filecompare;

import java.io.File;

public class demo02 {

	public static void main(String[] args) {
		File f1=null;
		File f2=null;
		File f3=null;
		File f4=null;
		String path1="D:/apache-tomcat-7.0.54 - 8090/webapps/school";      //��ȡ·��
		String path2="E:/school"; 
		String path3="D:/��ͥ������.pdf";
		String path4="D:/���ķ�-��ͥ������.pdf";
		f1=new File(path1); 
		f2=new File(path2);
		f3=new File(path3);
		f4=new File(path4);
		int n=f1.compareTo(f2);
		int m=f3.compareTo(f4);
		System.out.println("m="+m);
		System.out.println("n="+n);
		//�½��ļ�ʵ��
		File[] list=f1.listFiles();        /* �˴���ȡ�ļ����µ������ļ� */
		for(int i=0;i<list.length;i++){
			System.out.println(list[i].getAbsolutePath());//��ӡȫ·�������Ը���Ϊ���Լ���Ҫ�ķ���
			System.out.println(list[i].getName());
		}
		
	}
}
