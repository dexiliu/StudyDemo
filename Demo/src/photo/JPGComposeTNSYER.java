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

public class JPGComposeTNSYER {

	// 泰宁实验二小
	public static void compose_tnsz() {
		String[] str = new String[] { "左佳敏", "G350429224024" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁实验二小/泰宁实验小学9格.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁实验二小/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 232, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("式佳敏", 272, // 相差50
					940);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 222, 1035);

			// 把照片合成到背景图上，上中间
			g.drawImage(image2, 1007, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("左佳敏", 1047, // 相差50
					940);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 997, 1035);

			// 把照片合成到背景图上，上右边
			g.drawImage(image2, 1782, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1822, 940);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1772, 1035);

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 232, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 272, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 222, 2180);

			// 把照片合成到背景图上，中中间
			g.drawImage(image2, 1007, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1047, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 997, 2180);

			// 把照片合成到背景图上，中右边
			g.drawImage(image2, 1782, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1822, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1772, 2180);

			// 把照片合成到背景图上，下左边
			g.drawImage(image2, 232, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 272, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 222, 3325);

			// 把照片合成到背景图上，下中间
			g.drawImage(image2, 1007, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1047, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 997, 3325);

			// 把照片合成到背景图上，下右边
			g.drawImage(image2, 1782, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1822, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1772, 3325);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁实验二小/333.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(outImage);
			enc.encode(image);
			imagein.close();
			imagein2.close();
			outImage.close();
			System.out.println("compose finish");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void compose() throws IOException{
		InputStream bgIS=null;
		InputStream stuIS=null;
		BufferedImage bgImage=null;
		BufferedImage stuImage=null;
		OutputStream out=null;
		
		try{
			bgIS=new FileInputStream("D:/泰宁实验二小/model.jpg");
			stuIS=new FileInputStream("D:/泰宁实验二小/1.jpg");
			//210,300,330,460,90,235,910,50,215,1000
			//相差50
			bgImage=ImageIO.read(bgIS);//学生证模板
			stuImage=ImageIO.read(stuIS);//学生照片
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 210, 300, 330, 460, null);//学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
			bg.drawString("司同祖", 235, 910);//三个字235，两个字285，四个字185
			bg.setFont(new Font("黑体", Font.PLAIN, 50));
			bg.drawString("G350429224024", 215, 1000);
			bg.dispose();
			
			out= new FileOutputStream("d:/泰宁实验二小/student.jpg");// 输出合成后的图片
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
