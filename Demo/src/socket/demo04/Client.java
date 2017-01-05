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
				//���������ȡsocketͨ�����˿ں�33456������10�����ӳ�ʱ
				socket.connect(new InetSocketAddress("192.168.2.122", 33456),
						10 * 1000);
				//��ȡsocket�������
				dout = new DataOutputStream(socket.getOutputStream());
				dout.writeUTF("�����������");
				
				dis = new DataInputStream(socket.getInputStream());
				String flag=dis.readUTF();
				System.out.println("�ͻ���flag="+flag);
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
