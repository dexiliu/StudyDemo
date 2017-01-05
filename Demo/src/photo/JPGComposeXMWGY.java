package photo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class JPGComposeXMWGY {

	// 厦门外国语
	public static void compose_xmwgy() {
		String[] str = new String[] { "左佳敏", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/厦门外国语/外国语9格.jpg");
			InputStream imagein2 = new FileInputStream("d:/厦门外国语/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 232, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("左佳敏", 282, // 2060,三个字的参数；2010，两个字的参数；232，四个字的参数
					950);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 122, 1035);

			// 把照片合成到背景图上，上中间
			g.drawImage(image2, 1017, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("左佳敏", 1047, // 1295,三个字的参数；1335，四个字的参数
					950);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 897, 1035);

			// 把照片合成到背景图上，上右边
			g.drawImage(image2, 1792, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832, 950);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1672, 1035);

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 232, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 282, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 122, 2180);

			// 把照片合成到背景图上，中中间
			g.drawImage(image2, 1017, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1047, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 897, 2180);

			// 把照片合成到背景图上，中右边
			g.drawImage(image2, 1792, 1465, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832, 2085);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1672, 2180);

			// 把照片合成到背景图上，下左边
			g.drawImage(image2, 232, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 282, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 122, 3325);

			// 把照片合成到背景图上，下中间
			g.drawImage(image2, 1017, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1047, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 897, 3325);

			// 把照片合成到背景图上，下右边
			g.drawImage(image2, 1792, 2610, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832, 3230);
			g.setFont(new Font("微软雅黑", Font.PLAIN, 50));
			g.drawString(str[1], 1672, 3325);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/厦门外国语/333.jpg");// 输出合成后的图片
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

	public static void main(String[] args) {
		compose_xmwgy();
	}

}
