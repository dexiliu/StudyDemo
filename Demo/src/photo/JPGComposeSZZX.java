package photo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class JPGComposeSZZX {

		public static void compose() throws IOException{
			InputStream bgIS=null;
			InputStream stuIS=null;
			BufferedImage bgImage=null;
			BufferedImage stuImage=null;
			OutputStream out=null;
			
			try{
				bgIS=new FileInputStream("D:/水寨中学/zou.jpg");
				stuIS=new FileInputStream("D:/水寨中学/1.jpg");
				//215,295,330,450,90,235,900,60,255,1000
				//相差50
				bgImage=ImageIO.read(bgIS);//学生证模板
				stuImage=ImageIO.read(stuIS);//学生照片
				Graphics bg=null;
				bg=bgImage.getGraphics();
				bg.drawImage(stuImage, 215, 295, 330, 450, null);//学生证模板与学生照片合成
				bg.setColor(Color.BLACK); // 设置字体颜色
				bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
				bg.drawString("蔡波波波", 185, 900);//三个字235，两个字285，四个字185
				bg.setFont(new Font("黑体", Font.PLAIN, 60));
				bg.drawString("14gz0419", 255, 1000);
				bg.dispose();
				
				out= new FileOutputStream("d:/水寨中学/student.jpg");// 输出合成后的图片
				JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(out);
				enc.encode(bgImage);
				
				System.out.println("finish!!!");
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(null!=bgIS){
					bgIS.close();
				}
				if(null!=stuIS){
					stuIS.close();
				}
				if(null!=out){
					out.close();
				}
			}
			
		}
	
	public static void main(String[] args) throws IOException {
		compose();
	}

}
