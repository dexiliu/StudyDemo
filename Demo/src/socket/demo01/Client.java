package socket.demo01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static final String IP_ADDR="localhost";
	public static final int PORT=12345;
	
	public static void main(String[] args) {
		System.out.println("客户端启动...");
		System.out.println("当接收到服务器端字符为 \"OK\" 的时候, 客户端将终止\n");
		while(true){
			Socket socket=null;
			try{
				//创建一个流套接字并将其连接到指定主机上的指定端口号
				socket=new Socket(IP_ADDR,PORT);
				//读取服务器端数据
//				DataInputStream input=new DataInputStream(socket.getInputStream());
				//向服务器端发送数据
				DataOutputStream out=new DataOutputStream(socket.getOutputStream());
				
				File file=new File("e:/家庭报告书.pdf");
				if(!file.exists()||file.isDirectory())
					throw new FileNotFoundException();
				BufferedReader br=new BufferedReader(new FileReader(file));
				String temp=null;
				StringBuffer sb=new StringBuffer();
				temp=br.readLine();
				while(temp!=null){
					sb.append(temp+" ");
					temp=br.readLine();
				}
				out.writeUTF(sb.toString());
//				System.out.println("请输入:\t");
//				String str=new BufferedReader(new InputStreamReader(System.in)).readLine();
//				out.writeUTF(str);
				
//				String ret=input.readUTF();
//				System.out.println("服务器端返回过来的是: " + ret);
				//如接收到"OK"则断开连接
//				if("OK".equals(ret)){
//					System.out.println("客户端将关闭连接");
//					Thread.sleep(500);
//					break;
//				}
				
				out.close();
//				input.close();
			}catch(Exception e){
				System.out.println("客户端异常:" + e.getMessage());
			}finally{
				if(socket!=null){
					try{
						socket.close();
					}catch(IOException e){
						System.out.println("客户端 finally 异常:" + e.getMessage());;
					}
				}
			}
		}
	}
	
}
