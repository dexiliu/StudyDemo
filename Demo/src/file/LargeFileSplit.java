package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class LargeFileSplit {
    public static void main(String[] args) throws Exception {
        filesplit("e:/zngsgw", 5000);
    }
     
    public static void filesplit(String path, int linesPerFile) throws Exception {
       if(path == null)
          throw new Exception("...");
     
       File file = new File(path);
       if(!file.exists())
          throw new Exception("...");
        
       InputStreamReader in = new InputStreamReader(new FileInputStream(file));
       BufferedReader reader = new BufferedReader(in);
       String originalFilePath = file.getAbsolutePath();    // 原始文件路径
       OutputStreamWriter out = null;
       BufferedWriter writer = null;
       int currentLineNum = -1;   // 当前第几行，从0开始
       String currentLine = null;
       while((currentLine = reader.readLine()) != null) {
           currentLineNum++;
           if(currentLineNum % linesPerFile == 0) {
               if(out != null) {
                   out.flush();
                   out.close();
                   writer.close();
               }
                
               out = new OutputStreamWriter(
                       new FileOutputStream(originalFilePath + " " + (currentLineNum / linesPerFile) + ".txt"));
               writer = new BufferedWriter(out);
           }
           out.write(currentLine + "\r\n");
       }
        
       if(out != null) {
           out.flush();
           out.close();
           writer.close();
       }
        
       reader.close();
    }
}