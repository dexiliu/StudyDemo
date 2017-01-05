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

public class JPGComposeLZFCZX {

		public static void compose() throws IOException{
			InputStream bgIS=null;
			InputStream stuIS=null;
			BufferedImage bgImage=null;
			BufferedImage stuImage=null;
			OutputStream out=null;
			
			try{
				bgIS=new FileInputStream("D:/附城中学/zhudu.jpg");
				stuIS=new FileInputStream("D:/附城中学/1.jpg");
				//220,275,320,440,90,185,900,50,265,1010
				//相差50
				bgImage=ImageIO.read(bgIS);//学生证模板
				stuImage=ImageIO.read(stuIS);//学生照片
				Graphics bg=null;
				bg=bgImage.getGraphics();
				bg.drawImage(stuImage, 220, 275, 320, 440, null);//学生证模板与学生照片合成
				bg.setColor(Color.BLACK); // 设置字体颜色
				bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
				bg.drawString("陈碧球", 235, 900);//三个字235，两个字285，四个字185
				bg.setFont(new Font("黑体", Font.PLAIN, 50));
				bg.drawString("2014C0063", 265, 1010);
				bg.dispose();
				
				out= new FileOutputStream("d:/附城中学/student.jpg");// 输出合成后的图片
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
