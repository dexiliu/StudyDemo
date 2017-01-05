package socket.demo01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.*;

public class Server {

	public static final int PORT = 12345;
	public static void main(String[] args) {
		System.out.println("服务器启动...\n");
		Server server=new Server();
		server.init();
	}
	
	public void init(){
		try{
			ServerSocket serverSocket=new ServerSocket(PORT);
			while(true){
				//一旦有堵塞，则表示服务器与客户端获得了连接
				Socket client=serverSocket.accept();
				//处理这次连接
				new HandlerThread(client);
			}
		}catch(Exception e){
			System.out.println("服务器异常:"+e.getMessage());
		}
	}
	
	private class HandlerThread implements Runnable{
		private Socket socket;
		public HandlerThread(Socket client){
			socket=client;
			new Thread(this).start();
		}

		@Override
		public void run() {
			try{
				//读取客户端数据
				DataInputStream input=new DataInputStream(socket.getInputStream());
				String clientInputStr=input.readUTF();//这里要注意和客户端输出流的写方法则会抛EOFException
				//处理客户端数据
				File file=new File("e:/3.pdf");
		        if(!file.exists())
		            file.createNewFile();
		        FileOutputStream out=new FileOutputStream(file,true);        
		        for(int i=0;i<10000;i++){
		            StringBuffer sb=new StringBuffer();
		            sb.append(clientInputStr);
		            out.write(sb.toString().getBytes("utf-8"));
		        }        
//				System.out.println("客户端发过来的内容:"+clientInputStr);
				//向客户端回复信息
//				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
//				System.out.println("请输入:\t");
				//发送键盘输入的一行
//				String s=new BufferedReader(new InputStreamReader(System.in)).readLine();
//				out.writeUTF(s);
				
				out.close();
				input.close();
			}catch(Exception e){
				System.out.println("服务器 run 异常: " + e.getMessage());
			}finally{
				if(socket!=null){
					try{
						socket.close();
					}catch(Exception e){
						socket=null;
						System.out.println("服务端 finally 异常:" + e.getMessage());
					}
				}
			}
		}
	}
}
