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

public class JPGComposeTNYZ {

	// 泰宁一中，上左边
	public static void compose_tnyz_shangzuobian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中3格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，上左边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 780, 320, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) - 790,
					940);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) - 790,
					1035);
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

	// 泰宁一中，上中间
	public static void compose_tnyz_shangzhongjian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中3格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，上中间
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2),
					940);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2),
					1035);
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

	// 泰宁一中，上右边
	public static void compose_tnyz_shangyoubian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中3格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，上右边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) + 790,
					940);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) + 790,
					1035);
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

	// 泰宁一中，中左边
	public static void compose_tnyz_zhongzuobian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中6格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 780, 320 + 1145, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) - 790,
					940 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) - 790,
					1035 + 1145);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/33.jpg");// 输出合成后的图片
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

	// 泰宁一中，中中间
	public static void compose_tnyz_zhongzhongjian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中6格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320 + 1145, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2),
					940 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2),
					1035 + 1145);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/33.jpg");// 输出合成后的图片
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

	// 泰宁一中，中右边
	public static void compose_tnyz_zhongyoubian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中6格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上,中间右
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320 + 1145, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) + 790,
					940 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) + 790,
					1035 + 1145);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/33.jpg");// 输出合成后的图片
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

	// 泰宁一中，中间
	public static void compose_tnyz_zhongjian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中6格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，中间左
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 780, 320 + 1145, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) - 790,
					940 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) - 790,
					1035 + 1145);

			// 把照片合成到背景图上，中间中
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320 + 1145, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2),
					940 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2),
					1035 + 1145);

			// 把照片合成到背景图上，中间右
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320 + 1145, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) + 790,
					940 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) + 790,
					1035 + 1145);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/33.jpg");// 输出合成后的图片
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

	// 泰宁一中，下左边
	public static void compose_tnyz_xiazuobian() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中9格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 780, 320 + 1145 * 2, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) - 790,
					940 + 1145 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) - 790,
					1035 + 1145 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/333.jpg");// 输出合成后的图片
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

	// 泰宁一中，下
	public static void compose_tnyz_xia() {
		String[] str = new String[] { "范崇林", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中9格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，中间左
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 780, 320 + 1145 * 2, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) - 790,
					940 + 1145 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) - 790,
					1035 + 1145 * 2);

			// 把照片合成到背景图上，中间中
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320 + 1145 * 2, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2),
					940 + 1145 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2),
					1035 + 1145 * 2);

			// 把照片合成到背景图上，中间右
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320 + 1145 * 2, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2) + 790,
					940 + 1145 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2) + 790,
					1035 + 1145 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/333.jpg");// 输出合成后的图片
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
	public static void compose_tnyz() {
		String[] str = new String[] { "毛彩玲", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/泰宁一中/泰宁一中9格学生卡模板.jpg");
			InputStream imagein2 = new FileInputStream("d:/泰宁一中/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 226, 320, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("司毛玲", 262, //相差50
					940);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 152,
					1035);

			// 把照片合成到背景图上，上中间
			g.drawImage(image2, 1006, 320, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString("芈芈芈", 1042, //相差50
					940);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 942,
					1035);

			// 把照片合成到背景图上，上右边
			g.drawImage(image2, 1786, 320, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832,
					940);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1732,
					1035);

			// 把照片合成到背景图上，中间左
			g.drawImage(image2, 226, 1465, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 252,
					2085);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 152,
					2180);

			// 把照片合成到背景图上，中间中
			g.drawImage(image2, 1006, 1465, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1042,
					2085);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 942,
					2180);

			// 把照片合成到背景图上，中间右
			g.drawImage(image2, 1786, 1465, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832,
					2085);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1732,
					2180);

			// 把照片合成到背景图上，下边左
			g.drawImage(image2, 226, 2610, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 252,
					3230);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 152,
					3325);

			// 把照片合成到背景图上，下边中
			g.drawImage(image2, 1006, 2610, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1042,
					3230);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 942,
					3325);

			// 把照片合成到背景图上，下边右
			g.drawImage(image2, 1786, 2610, 350, 450, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1832,
					3230);
			g.setFont(new Font("黑体", Font.PLAIN, 50));
			g.drawString(str[1], 1732,
					3325);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/泰宁一中/333.jpg");// 输出合成后的图片
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
			bgIS=new FileInputStream("D:/泰宁一中/a.jpg");
			stuIS=new FileInputStream("D:/泰宁一中/1.jpg");
			//210,300,330,460,90,235,910,50,140,1000
			//相差50
			bgImage=ImageIO.read(bgIS);//学生证模板
			stuImage=ImageIO.read(stuIS);//学生照片
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 210, 300, 330, 460, null);//学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
			bg.drawString("司同祖", 235, 910);//三个字235，两个字285，四个字180
			bg.setFont(new Font("黑体", Font.PLAIN, 50));
			bg.drawString("L35042919981225001X", 140, 1000);
			bg.dispose();
			
			out= new FileOutputStream("d:/泰宁一中/student.jpg");// 输出合成后的图片
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
