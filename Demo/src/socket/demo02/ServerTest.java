package socket.demo02;

import java.io.BufferedInputStream;  
import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.File;  
import java.io.FileInputStream;  
import java.net.ServerSocket;  
import java.net.Socket;  
  
/** 
 * 1.�������� 
 *  ��������ͻ��˷����ļ�
 *  
 */  
public class ServerTest {  
      
    int port = 8821;  
  
    void start() {  
          
        Socket socket = null;  
          
        try {  
              
            ServerSocket serverSocket = new ServerSocket(port);  
              
            while (true) {  
                // ѡ����д�����ļ�  
                String filePath = "E:/��ͥ������.pdf";  
                  
                File fi = new File(filePath);  
  
                System.out.println("File Name��" + fi.getName() + ";\tFile Size()��" + (int) fi.length() + "bytes");  
  
                // public Socket accept() throws  
                // IOException���������ܵ����׽��ֵ����ӡ��˷����ڽ�������֮ǰһֱ������  
  
                  
                System.out.println("�ȴ��ͻ������ӣ����Ӷ˿ڣ�" + port);  
                socket = serverSocket.accept();  
                  
                System.out.println("����socket����");  
                  
                DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));  
                  
                dis.readByte();  
  
                DataInputStream fis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));  
                  
                DataOutputStream ps = new DataOutputStream(socket.getOutputStream());  
                  
                // ���ļ��������ȴ����ͻ��ˡ�����Ҫ������������ƽ̨�������������Ĵ�������Ҫ�ӹ���������Բμ�Think In Java  
                // 4th�����ֳɵĴ��롣  
                ps.writeUTF(fi.getName());  
                ps.flush();  
                ps.writeLong((long) fi.length());  
                ps.flush();  
  
                int bufferSize = 8192;  
                byte[] buf = new byte[bufferSize];  
  
                while (true) {  
                      
                    int read = 0;  
                    if (fis != null) {  
                        read = fis.read(buf);  
                    }  
  
                    if (read == -1) {  
                        break;  
                    }  
                    ps.write(buf, 0, read);  
                }  
                  
                ps.flush();  
                // ע��ر�socket����Ŷ����Ȼ�ͻ��˻�ȴ�server�����ݹ�����  
                // ֱ��socket��ʱ���������ݲ�������  
                fis.close();  
                socket.close();  
                  
                System.out.println("�ļ��������\n");  
            }  
  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    public static void main(String arg[]) {  
        new ServerTest().start();  
    }  
}  
