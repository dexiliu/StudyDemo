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

public class JPGComposeZJTT {

	// 浙江天台中学，学号15位
	public static void compose_zjtt() {
		String[] str = new String[] { "左佳敏", "G44088219994488" };
		try {
			InputStream imagein = new FileInputStream("d:/浙江天台/天台9格.jpg");
			InputStream imagein2 = new FileInputStream("d:/浙江天台/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 242, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("左佳敏", 282, // 2060,三个字的参数；2010，两个字的参数；242，四个字的参数
					950);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 172, 1035);

			// 把照片合成到背景图上，上中间
			g.drawImage(image2, 1017, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("左佳敏", 1047, // 1295,三个字的参数；1335，四个字的参数
					950);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 957, 1035);

			// 把照片合成到背景图上，上右边
			g.drawImage(image2, 1792, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832, 950);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1742, 1035);

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 242, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 282, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 172, 2180);

			// 把照片合成到背景图上，中中间
			g.drawImage(image2, 1017, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1047, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 957, 2180);

			// 把照片合成到背景图上，中右边
			g.drawImage(image2, 1792, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1742, 2180);

			// 把照片合成到背景图上，下左边
			g.drawImage(image2, 242, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 282, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 172, 3325);

			// 把照片合成到背景图上，下中间
			g.drawImage(image2, 1017, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1047, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 957, 3325);

			// 把照片合成到背景图上，下右边
			g.drawImage(image2, 1792, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1742, 3325);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/浙江天台/333.jpg");// 输出合成后的图片
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

	// 浙江天台中学，学号19位
		public static void compose_zjtt_a() {
			String[] str = new String[] { "左佳敏", "G440882199901014488" };
			try {
				InputStream imagein = new FileInputStream("d:/浙江天台/天台9格.jpg");
				InputStream imagein2 = new FileInputStream("d:/浙江天台/1.jpg");

				BufferedImage image = ImageIO.read(imagein);// 读取背景图
				BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
				Graphics g = image.getGraphics();

				// 把照片合成到背景图上，上左边
				g.drawImage(image2, 242, 320, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString("左佳敏", 282, // 2060,三个字的参数；2010，两个字的参数；242，四个字的参数
						950);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 132, 1035);

				// 把照片合成到背景图上，上中间
				g.drawImage(image2, 1017, 320, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString("左佳敏", 1047, // 1295,三个字的参数；1335，四个字的参数
						950);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 912, 1035);

				// 把照片合成到背景图上，上右边
				g.drawImage(image2, 1792, 320, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString(str[0], 1832, 950);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 1695, 1035);

				// 把照片合成到背景图上，中左边
				g.drawImage(image2, 242, 1465, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString(str[0], 282, 2085);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 132, 2180);

				// 把照片合成到背景图上，中中间
				g.drawImage(image2, 1017, 1465, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString(str[0], 1047, 2085);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 912, 2180);

				// 把照片合成到背景图上，中右边
				g.drawImage(image2, 1792, 1465, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString(str[0], 1832, 2085);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 1695, 2180);

				// 把照片合成到背景图上，下左边
				g.drawImage(image2, 242, 2610, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString(str[0], 282, 3230);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 132, 3325);

				// 把照片合成到背景图上，下中间
				g.drawImage(image2, 1017, 2610, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString(str[0], 1047, 3230);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 912, 3325);

				// 把照片合成到背景图上，下右边
				g.drawImage(image2, 1792, 2610, 350, 470, null);
				g.setColor(Color.BLACK); // 设置字体颜色
				g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
				g.drawString(str[0], 1832, 3230);
				g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
				g.drawString(str[1], 1695, 3325);

				g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
				OutputStream outImage = new FileOutputStream("d:/浙江天台/333.jpg");// 输出合成后的图片
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
				bgIS=new FileInputStream("D:/浙江天台/a.jpg");
				stuIS=new FileInputStream("D:/浙江天台/1.jpg");
				//210,300,330,460,90,233,910,50,135,1000
				//相差50
				bgImage=ImageIO.read(bgIS);//学生证模板
				stuImage=ImageIO.read(stuIS);//学生照片
				Graphics bg=null;
				bg=bgImage.getGraphics();
				bg.drawImage(stuImage, 210, 300, 330, 460, null);//学生证模板与学生照片合成
				bg.setColor(Color.BLACK); // 设置字体颜色
				bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
				bg.drawString("司同祖", 233, 910);//三个字233，两个字283，四个字183
				bg.setFont(new Font("黑体", Font.PLAIN, 50));
				bg.drawString("G440882199908084488", 135, 1000);
				bg.dispose();
				
				out= new FileOutputStream("d:/浙江天台/student.jpg");// 输出合成后的图片
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
