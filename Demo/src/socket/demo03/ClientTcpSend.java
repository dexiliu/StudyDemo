package socket.demo03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientTcpSend {

	public static void main(String[] args) {
		int length = 0;
		byte[] sendByte = null;
		Socket socket = null;
		DataOutputStream dout = null;
		FileInputStream fin = null;
		try {
			try {
				socket = new Socket();
				//向服务器获取socket通道，端口号33456，设置10秒连接超时
				socket.connect(new InetSocketAddress("192.168.2.11", 33456),
						10 * 1000);
				//获取socket的输出流
				dout = new DataOutputStream(socket.getOutputStream());
				//获取文件
				File file = new File("E:/家庭报告书.pdf");
				//把文件放到文件输入流中，供读取
				fin = new FileInputStream(file);
				//定义字节数组
				sendByte = new byte[1024];
				//把文件名以UTF的字节编码写入到socket的输出流，服务器端接收也是以UTF的字节编码读取
				dout.writeUTF(file.getName());
				//循环读取文件流里的东西
				while ((length = fin.read(sendByte, 0, sendByte.length)) > 0) {
					//写入到socket的输出流
					dout.write(sendByte, 0, length);
					dout.flush();
				}
			} catch (Exception e) {
				
			} finally {
				if (dout != null)
					dout.close();
				if (fin != null)
					fin.close();
				if (socket != null)
					socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
