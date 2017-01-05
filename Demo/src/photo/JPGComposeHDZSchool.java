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

public class JPGComposeHDZSchool {

	//一至六年级
	public static void compose() throws IOException {
		InputStream bgIS = null;
		InputStream stuIS = null;
		BufferedImage bgImage = null;
		BufferedImage stuImage = null;
		OutputStream out = null;

		try {
			bgIS = new FileInputStream("D:/河东小学/model.jpg");
			stuIS = new FileInputStream("D:/河东小学/1.jpg");
			// 215,280,325,450,90,235,900,60,200,990
			// 相差50
			bgImage = ImageIO.read(bgIS);// 学生证模板
			stuImage = ImageIO.read(stuIS);// 学生照片
			Graphics bg = null;
			bg = bgImage.getGraphics();
			bg.drawImage(stuImage, 215, 280, 325, 450, null);// 学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
			bg.drawString("李润杰", 235, 900);// 三个字235，两个字285，四个字185
			bg.setFont(new Font("黑体", Font.PLAIN, 60));
			bg.drawString("whhdyx110126", 200, 990);
			bg.dispose();

			out = new FileOutputStream("d:/河东小学/student.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(out);
			enc.encode(bgImage);

			System.out.println("finish!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != bgIS) {
				bgIS.close();
			}
			if (null != stuIS) {
				stuIS.close();
			}
			if (null != out) {
				out.close();
			}
		}

	}
	
	//学前班
	public static void xqb(){
		InputStream bgIS = null;
		InputStream stuIS = null;
		BufferedImage bgImage = null;
		BufferedImage stuImage = null;
		OutputStream out = null;

		try {
			bgIS = new FileInputStream("D:/河东小学/model.jpg");
			stuIS = new FileInputStream("D:/河东小学/1.jpg");
			// 215,280,325,450,90,235,900,60,200,990
			// 相差50
			bgImage = ImageIO.read(bgIS);// 学生证模板
			stuImage = ImageIO.read(stuIS);// 学生照片
			Graphics bg = null;
			bg = bgImage.getGraphics();
			bg.drawImage(stuImage, 215, 280, 325, 450, null);// 学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
			bg.drawString("李润杰", 235, 900);// 三个字235，两个字285，四个字185
			bg.setFont(new Font("黑体", Font.PLAIN, 60));
			bg.drawString("whhdyx005", 240, 990);
			bg.dispose();

			out = new FileOutputStream("d:/河东小学/123456.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(out);
			enc.encode(bgImage);

			System.out.println("finish!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != bgIS) {
				try {
					bgIS.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != stuIS) {
				try {
					stuIS.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		xqb();
	}

}
