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
				//���������ȡsocketͨ�����˿ں�33456������10�����ӳ�ʱ
				socket.connect(new InetSocketAddress("192.168.2.11", 33456),
						10 * 1000);
				//��ȡsocket�������
				dout = new DataOutputStream(socket.getOutputStream());
				//��ȡ�ļ�
				File file = new File("E:/��ͥ������.pdf");
				//���ļ��ŵ��ļ��������У�����ȡ
				fin = new FileInputStream(file);
				//�����ֽ�����
				sendByte = new byte[1024];
				//���ļ�����UTF���ֽڱ���д�뵽socket����������������˽���Ҳ����UTF���ֽڱ����ȡ
				dout.writeUTF(file.getName());
				//ѭ����ȡ�ļ�����Ķ���
				while ((length = fin.read(sendByte, 0, sendByte.length)) > 0) {
					//д�뵽socket�������
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
