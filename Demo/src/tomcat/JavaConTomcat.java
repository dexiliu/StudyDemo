package tomcat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaConTomcat {

	public static void main(String[] args){
		try {
			start();
			System.out.println("tomcat启动成功！");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("tomcat启动失败！");
		}
	}

	public static void close() throws IOException{
		Process process=Runtime.getRuntime().exec("cmd /c  D:/apache-tomcat-7.0.54 - 8090/bin/shutdown.bat");
		final InputStream in=process.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		StringBuilder buf=new StringBuilder();
		String line=null;
		while((line=br.readLine())!=null){
			buf.append(line);
			System.out.println("输出结果为:"+buf);
		}
	}
	
	public static void start() throws IOException{
		Process process=Runtime.getRuntime().exec("cmd /c  D:/apache-tomcat-7.0.54 - 8090/bin/startup.bat");
		final InputStream in=process.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		StringBuilder buf=new StringBuilder();
		String line=null;
		while((line=br.readLine())!=null){
			buf.append(line);
			System.out.println("输出结果为:"+buf);
		}
		
	}
}
