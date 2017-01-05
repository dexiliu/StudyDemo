package fileupload;

import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.MalformedURLException;  
  
public class ReadWriteFile {  
    /** 
     *
     * 
     * 
     */  
    public static void main(String[] args) throws IOException {  
        //������   
        InputStream in = new FileInputStream("e:/��ͥ������.pdf");  
        //�����  
        OutputStream out = new FileOutputStream("e:/1.pdf", true);  
  
        try {  
            byte[] buffer = new byte[1024];  
            while (true) {  
                int byteRead = in.read(buffer);  
                if (byteRead == -1)  
                    break;  
                out.write(buffer, 0, byteRead);  
            }  
        }  
  
        catch (MalformedURLException ex) {  
            System.err.println(args[0] + " is not a URL Java understands.");  
        } finally {  
            if (in != null)  
                in.close();  
            if (out != null) {  
                out.close();  
            }  
        }  
    }  
}  
