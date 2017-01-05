package socket.demo03;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcpListener implements Runnable {

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        try {
            final ServerSocket server = new ServerSocket(33456);
            Thread th = new Thread(new Runnable() {

                @Override
                public void run() {
                    while (true) {
                        try {
                           System.out.println("��ʼ����������");
                           //һֱ�ڼ����ͻ��˵���������
                           Socket socket = server.accept();
                           System.out.println("������");
                           //���տͻ��˴��������ļ�
                           receiveFile(socket);
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

    public static void receiveFile(Socket socket) throws IOException {
        byte[] inputByte = null;
        int length = 0;
        DataInputStream din = null;
        FileOutputStream fout = null;
        try {
        	//��ȡsocket����������׼�������������������
            din = new DataInputStream(socket.getInputStream());
            //���ļ��ŵ��ļ������
            fout = new FileOutputStream(new File("d:\\"+din.readUTF()));
            inputByte = new byte[1024];
            System.out.println("��ʼ��������...");
            while (true) {
                if (din != null) {
                	//���ļ������ݴ浽inputByte[]�ֽ�������
                    length = din.read(inputByte, 0, inputByte.length);
                }
                if (length == -1) {
                    break;
                }
                System.out.println(length);
                //���ļ�����д�뵽�ļ������
                fout.write(inputByte, 0, length);
                fout.flush();
            }
            System.out.println("��ɽ���");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null)
                fout.close();
            if (din != null)
                din.close();
            if (socket != null)
                socket.close();
        }
    }

}
