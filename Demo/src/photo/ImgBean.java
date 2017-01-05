package photo;

import java.awt.*; 
import java.io.*; 
import java.awt.image.*; 
import com.sun.image.codec.jpeg.*; 
import javax.imageio.*; 

public class ImgBean{ 
public void ImgBean(){} 
public static void ImgYin(String s,String ImgName){ 
    byte[] bytes = null; 
    try{ 
        String str = s; 
        File _file = new File(ImgName); 
        Image src = ImageIO.read(_file); 
        int wideth=src.getWidth(null); 
        int height=src.getHeight(null); 
        BufferedImage image=new BufferedImage(wideth,height,BufferedImage.TYPE_INT_RGB); 
        Graphics g=image.createGraphics(); 
        g.drawImage(src,0,0,wideth,height,null); 
        g.setColor(Color.RED); 
        g.setFont(new Font("宋体",Font.PLAIN,50)); 

        g.drawString(str,wideth-440,height-673); 
        g.dispose(); 
        ByteArrayOutputStream out1 = new ByteArrayOutputStream(); 
        saveImage(image, out1); 
        bytes = out1.toByteArray(); 
        out1.close(); 
        FileOutputStream out2 = new FileOutputStream(ImgName); 
        out2.write(bytes); 
        out2.close(); 
    } 
    catch(Exception e){ 
        System.out.println(e); 
    } 
} 
public static void saveImage(BufferedImage img, OutputStream out1) throws Exception { 
    JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out1); 
    encoder.encode(img); 
} 

public static void main(String[] args){ 
    ImgYin("我要加的水印" , "d:/2.jpg"); 
} 
} 

