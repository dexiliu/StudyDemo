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
                           System.out.println("��ʼ����������");
                           //һֱ�ڼ����ͻ��˵���������
                           Socket socket = server.accept();
                           System.out.println("������");
                           //���տͻ��˴��������ļ�
                           din = new DataInputStream(socket.getInputStream());
                           String flag=din.readUTF();
                           System.out.println("��������flag="+flag);
                           
                           dos = new DataOutputStream(socket.getOutputStream());
                           dos.writeUTF("�Ѿ��ɹ����գ�");
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
