package socket.demo04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		DataOutputStream dout = null;
		DataInputStream dis=null;
		try {
			try {
				socket = new Socket();
				//向服务器获取socket通道，端口号33456，设置10秒连接超时
				socket.connect(new InetSocketAddress("192.168.2.122", 33456),
						10 * 1000);
				//获取socket的输出流
				dout = new DataOutputStream(socket.getOutputStream());
				dout.writeUTF("向服务器请求！");
				
				dis = new DataInputStream(socket.getInputStream());
				String flag=dis.readUTF();
				System.out.println("客户端flag="+flag);
			} catch (Exception e) {
				
			} finally {
				if (dout != null)
					dout.close();
				if (socket != null)
					socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
