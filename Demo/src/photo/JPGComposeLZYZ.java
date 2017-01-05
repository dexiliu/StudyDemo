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

public class JPGComposeLZYZ {

	// 雷州一中，上左边
	public static void compose_lzyz_shangzuobian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中3格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 750, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770,
					image.getHeight() - 225 - 2300);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770,
					image.getHeight() - 140 - 2300 + 10);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/3.jpg");// 输出合成后的图片
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

	// 雷州一中，上中间
	public static void compose_lzyz_shangzhongjian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中3格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2),
					image.getHeight() - 225 - 2300);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2),
					image.getHeight() - 140 - 2300 + 10);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/3.jpg");// 输出合成后的图片
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

	// 雷州一中，上右边
	public static void compose_lzyz_shangyoubian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中3格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25 + 780, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 780,
					image.getHeight() - 225 - 2300);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 780,
					image.getHeight() - 140 - 2300 + 10);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/3.jpg");// 输出合成后的图片
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

	// 雷州一中，上边
	public static void compose_lzyz_shang() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中3格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，上左边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 750, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770,
					image.getHeight() - 225 - 2300);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770,
					image.getHeight() - 140 - 2300 + 10);

			// 上中间
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2),
					image.getHeight() - 225 - 2300);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2),
					image.getHeight() - 140 - 2300 + 10);

			// 上右边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25 + 780, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 780,
					image.getHeight() - 225 - 2300);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 780,
					image.getHeight() - 140 - 2300 + 10);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/3.jpg");// 输出合成后的图片
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

	// 雷州一中，中左边
	public static void compose_lzyz_zhongzuobian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中6格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 750, 300 + 40 + 1145, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770,
					image.getHeight() - 225 - 2300 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770,
					image.getHeight() - 140 - 2300 + 10 + 1145);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/33.jpg");// 输出合成后的图片
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

	// 雷州一中，中中间
	public static void compose_lzyz_zhongzhongjian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中6格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25, 300 + 40 + 1145, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2),
					image.getHeight() - 225 - 2300 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2),
					image.getHeight() - 140 - 2300 + 10 + 1145);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/33.jpg");// 输出合成后的图片
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

	// 雷州一中，中右边
	public static void compose_lzyz_zhongyoubian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中6格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25 + 780, 300 + 40 + 1145, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 780,
					image.getHeight() - 225 - 2300 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 780,
					image.getHeight() - 140 - 2300 + 10 + 1145);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/33.jpg");// 输出合成后的图片
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

	// 雷州一中，中间
	public static void compose_lzyz_zhong() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中6格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，中左边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 750, 300 + 40 + 1145, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770,
					image.getHeight() - 225 - 2300 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770,
					image.getHeight() - 140 - 2300 + 10 + 1145);

			// 中中间
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25, 300 + 40 + 1145, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2),
					image.getHeight() - 225 - 2300 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2),
					image.getHeight() - 140 - 2300 + 10 + 1145);

			// 中右边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25 + 780, 300 + 40 + 1145, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 780,
					image.getHeight() - 225 - 2300 + 1145);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 780,
					image.getHeight() - 140 - 2300 + 10 + 1145);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/33.jpg");// 输出合成后的图片
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

	// 雷州一中，下左边
	public static void compose_lzyz_xiazuobian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中9格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 750, 300 + 40 + 1145 * 2, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770,
					image.getHeight() - 225 - 2300 + 1145 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770,
					image.getHeight() - 140 - 2300 + 10 + 1145 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/333.jpg");// 输出合成后的图片
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

	// 雷州一中，下中间
	public static void compose_lzyz_xiazhongjian() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中9格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25, 300 + 40 + 1145 * 2, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2),
					image.getHeight() - 225 - 2300 + 1145 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2),
					image.getHeight() - 140 - 2300 + 10 + 1145 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/333.jpg");// 输出合成后的图片
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

	// 雷州一中，下中间
	public static void compose_lzyz_xiayoubain() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中9格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 25 + 780, 300 + 40 + 1145 * 2, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 780,
					image.getHeight() - 225 - 2300 + 1145 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 780,
					image.getHeight() - 140 - 2300 + 10 + 1145 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/333.jpg");// 输出合成后的图片
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

	// 雷州一中
	public static void compose_lzyz() {
		String[] str = new String[] { "黄小翔", "G440882199908084488" };

		try {
			InputStream imagein = new FileInputStream("d:/雷州一中/雷州一中9格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/雷州一中/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 226, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString("英地语", 362, // 相差20
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 297, 1030);

			// 上中间
			g.drawImage(image2, 1001, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString("芈芈芈", 1132, // 相差20
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1077, 1030);

			// 上右边
			g.drawImage(image2, 1781, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1912, 935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 1030);

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 226, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 362, 2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 297, 2175);

			// 中中间
			g.drawImage(image2, 1001, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1132, 2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1077, 2175);

			// 中右边
			g.drawImage(image2, 1781, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1912, 2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 2175);

			// 把照片合成到背景图上，下左边
			g.drawImage(image2, 226, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 362, 3230);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 297, 3325);

			// 下中间
			g.drawImage(image2, 1001, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1132, 3230);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1077, 3325);

			// 下右边
			g.drawImage(image2, 1781, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1912, 3230);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 3325);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/雷州一中/333.jpg");// 输出合成后的图片
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
			bgIS=new FileInputStream("D:/雷州一中/a.jpg");
			stuIS=new FileInputStream("D:/雷州一中/d.jpg");
			//210,300,330,460,42,355,910,32,285,1000
			//相差30
			bgImage=ImageIO.read(bgIS);//学生证模板
			stuImage=ImageIO.read(stuIS);//学生照片
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 210, 300, 330, 460, null);//学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 42));// 设置字体格式
			bg.drawString("司怀祖", 355, 910);//三个字355，两个字385，四个字325
			bg.setFont(new Font("黑体", Font.PLAIN, 32));
			bg.drawString("G440882199908084488", 285, 1000);
			bg.dispose();
			
			out= new FileOutputStream("d:/雷州一中/student.jpg");// 输出合成后的图片
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
