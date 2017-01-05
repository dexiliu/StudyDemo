package socket.demo02;

import java.io.BufferedInputStream;  
import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.File;  
import java.io.FileInputStream;  
import java.net.ServerSocket;  
import java.net.Socket;  
  
/** 
 * 1.服务器端 
 *  服务器向客户端发送文件
 *  
 */  
public class ServerTest {  
      
    int port = 8821;  
  
    void start() {  
          
        Socket socket = null;  
          
        try {  
              
            ServerSocket serverSocket = new ServerSocket(port);  
              
            while (true) {  
                // 选择进行传输的文件  
                String filePath = "E:/家庭报告书.pdf";  
                  
                File fi = new File(filePath);  
  
                System.out.println("File Name：" + fi.getName() + ";\tFile Size()：" + (int) fi.length() + "bytes");  
  
                // public Socket accept() throws  
                // IOException侦听并接受到此套接字的连接。此方法在进行连接之前一直阻塞。  
  
                  
                System.out.println("等待客户端连接，连接端口：" + port);  
                socket = serverSocket.accept();  
                  
                System.out.println("建立socket链接");  
                  
                DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));  
                  
                dis.readByte();  
  
                DataInputStream fis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));  
                  
                DataOutputStream ps = new DataOutputStream(socket.getOutputStream());  
                  
                // 将文件名及长度传给客户端。这里要真正适用所有平台，例如中文名的处理，还需要加工，具体可以参见Think In Java  
                // 4th里有现成的代码。  
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
                // 注意关闭socket链接哦，不然客户端会等待server的数据过来，  
                // 直到socket超时，导致数据不完整。  
                fis.close();  
                socket.close();  
                  
                System.out.println("文件传输完成\n");  
            }  
  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    public static void main(String arg[]) {  
        new ServerTest().start();  
    }  
}  
