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

public class JPGComposeYXYZ {

	// 奋兴中学
	public static void fxzx_compose() {
		String[] str = new String[] { "黄嘉琪", "20160216" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/2.jpg");
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/13.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 177,
					300, 377, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 77 / 2),
					image.getHeight() - 220);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 23 / 2),
					image.getHeight() - 140);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/3.jpg");// 输出合成后的图片
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

	// 泰宁一中
	public static void tnyz_compose() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/1.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/2.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2),
					image.getHeight() - 200);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2),
					image.getHeight() - 115);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/3.jpg");// 输出合成后的图片
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

	// 阳西一中
	public static void yxyz_compose() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/1.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/2.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2),
					image.getHeight() - 228);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2),
					image.getHeight() - 140);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/3.jpg");// 输出合成后的图片
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

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 阳西一中，上左边
	public static void compose_yxyz_shangzuobian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/33.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/11.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 935,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/3.jpg");// 输出合成后的图片
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

	// 阳西一中，上中间
	public static void compose_yxyz_shangzhongjian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板3.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2), 882);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2), 970);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/33.jpg");// 输出合成后的图片
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

	// 阳西一中，上右边
	public static void compose_yxyz_shangyoubian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板3.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/33.jpg");// 输出合成后的图片
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

	// 阳西一中，上边
	public static void compose_yxyz_shang() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板3.jpg");
			InputStream imagein1 = new FileInputStream("d:/阳西一中/1.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/11.jpg");
			InputStream imagein3 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image1 = ImageIO.read(imagein1);// 读取照片
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			BufferedImage image3 = ImageIO.read(imagein3);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，左边
			g.drawImage(image1, image.getWidth() - image.getWidth() / 2 - 935,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970);

			// 把照片合成到背景图上，中间
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 0,
					882);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 0,
					970);

			// 把照片合成到背景图上，右边
			g.drawImage(image3, image.getWidth() - image.getWidth() / 2
					- (-615), 320, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2)
					- (-785), 882);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2)
					- (-780), 970);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/3.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(outImage);
			enc.encode(image);
			imagein.close();
			imagein1.close();
			imagein2.close();
			imagein3.close();
			outImage.close();
			System.out.println("compose finish");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 阳西一中，中左边
	public static void compose_yxyz_zhongzuobian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板6.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 320 + 1140, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/2.jpg");// 输出合成后的图片
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

	// 阳西一中，中中间
	public static void compose_yxyz_zhongzhongjian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板6.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					1460, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/2.jpg");// 输出合成后的图片
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

	// 阳西一中，中右边
	public static void compose_yxyz_zhongyoubian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板6.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 1460, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/2.jpg");// 输出合成后的图片
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

	// 阳西一中，中间
	public static void compose_yxyz_zhong() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板6.jpg");
			InputStream imagein4 = new FileInputStream("d:/阳西一中/111.jpg");
			InputStream imagein5 = new FileInputStream("d:/阳西一中/11.jpg");
			InputStream imagein6 = new FileInputStream("d:/阳西一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image4 = ImageIO.read(imagein4);// 读取照片
			BufferedImage image5 = ImageIO.read(imagein5);// 读取照片
			BufferedImage image6 = ImageIO.read(imagein6);// 读取照片

			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，左边
			g.drawImage(image4, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 1460, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140);

			// 把照片合成到背景图上，中间
			g.drawImage(image5, image.getWidth() - image.getWidth() / 2 - 165,
					1460, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140);

			// 把照片合成到背景图上，右边
			g.drawImage(image6, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 1460, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/2.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(outImage);
			enc.encode(image);
			imagein.close();
			imagein4.close();
			imagein5.close();
			imagein6.close();
			outImage.close();
			System.out.println("compose finish");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 阳西一中,下左边
	public static void compose_yxyz_xiazuobian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板9.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/22.jpg");// 输出合成后的图片
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

	// 阳西一中，下中间
	public static void compose_yxyz_xiazhongjian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板9.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/22.jpg");// 输出合成后的图片
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

	// 阳西一中，下中间
	public static void compose_yxyz_xiaxiabian() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板9.jpg");
			InputStream imagein2 = new FileInputStream("d:/阳西一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/22.jpg");// 输出合成后的图片
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

	// 阳西一中，下边
	public static void compose_yxyz_xia() {
		String[] str = new String[] { "何王华", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板9.jpg");
			InputStream imagein7 = new FileInputStream("d:/阳西一中/111.jpg");
			InputStream imagein8 = new FileInputStream("d:/阳西一中/11.jpg");
			InputStream imagein9 = new FileInputStream("d:/阳西一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image7 = ImageIO.read(imagein7);// 读取照片
			BufferedImage image8 = ImageIO.read(imagein8);// 读取照片
			BufferedImage image9 = ImageIO.read(imagein9);// 读取照片

			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，下左边
			g.drawImage(image7, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140 * 2);

			// 把照片合成到背景图上，下中间
			g.drawImage(image8, image.getWidth() - image.getWidth() / 2 - 165,
					320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140 * 2);

			// 把照片合成到背景图上，下右边
			g.drawImage(image9, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 40));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140 * 2);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/22.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(outImage);
			enc.encode(image);
			imagein.close();
			imagein7.close();
			imagein8.close();
			imagein9.close();
			outImage.close();
			System.out.println("compose finish");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 阳西一中
	public static void compose_yxyz() {
		String[] str = new String[] { "何王华", "G441721199911165548" };

		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/阳西一中学生卡模板9.jpg");
			InputStream imagein1 = new FileInputStream("d:/阳西一中/2.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image1 = ImageIO.read(imagein1);// 读取照片

			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image1, 236, 300, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString("陈敏儿", 287, // 三个字287，相差40
					882);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 262-90, 970);

			// 把照片合成到背景图上，上中间
			g.drawImage(image1, 1006, 300, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString("芈芈芈芈芈",1057-40-40, // 三个字1057，相差40
					882);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1032-90, 970);

			// 把照片合成到背景图上，上右边
			g.drawImage(image1, 1786, 300, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString(str[0], 1907-65, 882);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1812-90, 970);

			// 把照片合成到背景图上，中左边
			g.drawImage(image1, 236, 1440, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString(str[0], 352-65, 2022);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 262-90, 2110);

			// 把照片合成到背景图上，中中间
			g.drawImage(image1, 1006, 1440, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString(str[0], 1122-65, 2022);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1032-90, 2110);

			// 把照片合成到背景图上，中右边
			g.drawImage(image1, 1786, 1440, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString(str[0], 1907-65, 2022);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1812-90, 2110);

			// 把照片合成到背景图上，下左边
			g.drawImage(image1, 236, 2580, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString(str[0], 352-65, 3162);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 262-90, 3250);

			g.drawImage(image1, 1006, 2580, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString(str[0], 1122-65, 3162);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1032-90, 3250);

			g.drawImage(image1, 1786, 2580, 350, 500, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			g.drawString(str[0], 1907-65, 3162);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1812-90, 3250);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/666666.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(outImage);
			enc.encode(image);
			imagein.close();
			imagein1.close();
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
			bgIS=new FileInputStream("D:/阳西一中/model.jpg");
			stuIS=new FileInputStream("D:/阳西一中/111.jpg");
			//220,300,330,460,80,260,850,50,140,940
			//相差40
			bgImage=ImageIO.read(bgIS);//学生证模板
			stuImage=ImageIO.read(stuIS);//学生照片
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 220, 300, 330, 460, null);//学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
			bg.drawString("吴同在", 260, 850);//三个字260，两个字300，四个字220
			bg.setFont(new Font("黑体", Font.PLAIN, 50));
			bg.drawString("G441721199911165548", 140, 940);
			bg.dispose();
			
			out= new FileOutputStream("d:/阳西一中/student.jpg");// 输出合成后的图片
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