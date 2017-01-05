package filecompare;

import java.io.File;

public class demo02 {

	public static void main(String[] args) {
		File f1=null;
		File f2=null;
		File f3=null;
		File f4=null;
		String path1="D:/apache-tomcat-7.0.54 - 8090/webapps/school";      //获取路径
		String path2="E:/school"; 
		String path3="D:/家庭报告书.pdf";
		String path4="D:/杨文菲-家庭报告书.pdf";
		f1=new File(path1); 
		f2=new File(path2);
		f3=new File(path3);
		f4=new File(path4);
		int n=f1.compareTo(f2);
		int m=f3.compareTo(f4);
		System.out.println("m="+m);
		System.out.println("n="+n);
		//新建文件实例
		File[] list=f1.listFiles();        /* 此处获取文件夹下的所有文件 */
		for(int i=0;i<list.length;i++){
			System.out.println(list[i].getAbsolutePath());//打印全路径，可以更改为你自己需要的方法
			System.out.println(list[i].getName());
		}
		
	}
}
