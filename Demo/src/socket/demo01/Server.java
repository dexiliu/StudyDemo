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
		System.out.println("����������...\n");
		Server server=new Server();
		server.init();
	}
	
	public void init(){
		try{
			ServerSocket serverSocket=new ServerSocket(PORT);
			while(true){
				//һ���ж��������ʾ��������ͻ��˻��������
				Socket client=serverSocket.accept();
				//�����������
				new HandlerThread(client);
			}
		}catch(Exception e){
			System.out.println("�������쳣:"+e.getMessage());
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
				//��ȡ�ͻ�������
				DataInputStream input=new DataInputStream(socket.getInputStream());
				String clientInputStr=input.readUTF();//����Ҫע��Ϳͻ����������д���������EOFException
				//����ͻ�������
				File file=new File("e:/3.pdf");
		        if(!file.exists())
		            file.createNewFile();
		        FileOutputStream out=new FileOutputStream(file,true);        
		        for(int i=0;i<10000;i++){
		            StringBuffer sb=new StringBuffer();
		            sb.append(clientInputStr);
		            out.write(sb.toString().getBytes("utf-8"));
		        }        
//				System.out.println("�ͻ��˷�����������:"+clientInputStr);
				//��ͻ��˻ظ���Ϣ
//				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
//				System.out.println("������:\t");
				//���ͼ��������һ��
//				String s=new BufferedReader(new InputStreamReader(System.in)).readLine();
//				out.writeUTF(s);
				
				out.close();
				input.close();
			}catch(Exception e){
				System.out.println("������ run �쳣: " + e.getMessage());
			}finally{
				if(socket!=null){
					try{
						socket.close();
					}catch(Exception e){
						socket=null;
						System.out.println("����� finally �쳣:" + e.getMessage());
					}
				}
			}
		}
	}
}
