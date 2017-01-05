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

public class JPGComposeLJZX {

		public static void compose() throws IOException{
			InputStream bgIS=null;
			InputStream stuIS=null;
			BufferedImage bgImage=null;
			BufferedImage stuImage=null;
			OutputStream out=null;
			
			try{
				bgIS=new FileInputStream("D:/临江中学/model.jpg");
				stuIS=new FileInputStream("D:/临江中学/1.jpg");
				//240,340,275,375,90,240,900,60,285,1010
				//相差50
				bgImage=ImageIO.read(bgIS);//学生证模板
				stuImage=ImageIO.read(stuIS);//学生照片
				Graphics bg=null;
				bg=bgImage.getGraphics();
				bg.drawImage(stuImage, 240, 340, 275, 375, null);//学生证模板与学生照片合成
				bg.setColor(Color.BLACK); // 设置字体颜色
				bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
				bg.drawString("周少敏", 240, 900);//三个字240，两个字290，四个字190
				bg.setFont(new Font("黑体", Font.PLAIN, 60));
				bg.drawString("LJQ4050", 285, 1010);
				bg.dispose();
				
				out= new FileOutputStream("d:/临江中学/student.jpg");// 输出合成后的图片
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
