package socket.demo04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
            final ServerSocket server = new ServerSocket(33456);
            Thread th = new Thread(new Runnable() {

                @Override
                public void run() {
                	DataInputStream din = null;
                	DataOutputStream dos=null;
                    while (true) {
                        try {
                           System.out.println("开始监听。。。");
                           //一直在监听客户端的连接请求
                           Socket socket = server.accept();
                           System.out.println("有链接");
                           //接收客户端传过来的文件
                           din = new DataInputStream(socket.getInputStream());
                           String flag=din.readUTF();
                           System.out.println("服务器端flag="+flag);
                           
                           dos = new DataOutputStream(socket.getOutputStream());
                           dos.writeUTF("已经成功接收！");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                }

            });
            th.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	

}
