package photo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class JPGComposeFXZX {

	// 奋兴中学，上左边
	public static void compose_yxfx_shangzuobian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学3格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 800, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770
					- 125, image.getHeight() - 225 - 2300 + 20);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770
					- 100, image.getHeight() - 140 - 2300 + 10);
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

	// 奋兴中学，上中间
	public static void compose_yxfx_shangzhongjian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学3格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 10, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 105,
					image.getHeight() - 225 - 2300 + 20);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 80,
					image.getHeight() - 140 - 2300 + 10);
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

	// 奋兴中学，上右边
	public static void compose_yxfx_shangyoubian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学3格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 770, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 675,
					image.getHeight() - 225 - 2300 + 20);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 705,
					image.getHeight() - 140 - 2300 + 10);
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

	// 奋兴中学，上边
	public static void compose_yxfx_shang() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学6格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，上左边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 800, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770
					- 125, image.getHeight() - 225 - 2300 + 20);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770
					- 100, image.getHeight() - 140 - 2300 + 10);

			// 上中间
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 10, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 105,
					image.getHeight() - 225 - 2300 + 20);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 80,
					image.getHeight() - 140 - 2300 + 10);

			// 上右边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 770, 300 + 40, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 675,
					image.getHeight() - 225 - 2300 + 20);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 705,
					image.getHeight() - 140 - 2300 + 10);

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

	// 奋兴中学，中左边
	public static void compose_yxfx_zhongzuobian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学6格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 800, 300 + 40 + 1150, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770
					- 125, image.getHeight() - 225 - 2300 + 20 + 1150);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770
					- 100, image.getHeight() - 140 - 2300 + 10 + 1150);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/33.jpg");// 输出合成后的图片
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

	// 奋兴中学，中中间
	public static void compose_yxfx_zhongzhongjian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学6格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 10, 300 + 40 + 1150, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 105,
					image.getHeight() - 225 - 2300 + 20 + 1150);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 80,
					image.getHeight() - 140 - 2300 + 10 + 1150);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/33.jpg");// 输出合成后的图片
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

	// 奋兴中学，中右边
	public static void compose_yxfx_zhongyoubian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学6格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 770, 300 + 40 + 1150, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 675,
					image.getHeight() - 225 - 2300 + 20 + 1150);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 705,
					image.getHeight() - 140 - 2300 + 10 + 1150);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/33.jpg");// 输出合成后的图片
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

	// 奋兴中学，中间
	public static void compose_yxfx_zhong() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学6格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上，中左边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 800, 300 + 40 + 1150, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770
					- 125, image.getHeight() - 225 - 2300 + 20 + 1150);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770
					- 100, image.getHeight() - 140 - 2300 + 10 + 1150);

			// 中中间
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 10, 300 + 40 + 1150, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 105,
					image.getHeight() - 225 - 2300 + 20 + 1150);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 80,
					image.getHeight() - 140 - 2300 + 10 + 1150);

			// 中右边
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 770, 300 + 40 + 1150, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 675,
					image.getHeight() - 225 - 2300 + 20 + 1150);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 705,
					image.getHeight() - 140 - 2300 + 10 + 1150);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/33.jpg");// 输出合成后的图片
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

	// 奋兴中学，下左边
	public static void compose_yxfx_xiazuobian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学9格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 800, 300 + 40 + 1150 * 2, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 770
					- 125, image.getHeight() - 225 - 2300 + 20 + 1150 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 770
					- 100, image.getHeight() - 140 - 2300 + 10 + 1150 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/333.jpg");// 输出合成后的图片
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

	// 奋兴中学，下中间
	public static void compose_yxfx_xiazhongjian() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学9格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - 1171 - 165 - 10,
					300 + 40 + 1150 * 2, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) - 105,
					image.getHeight() - 225 - 2300 + 20 + 1150 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) - 80,
					image.getHeight() - 140 - 2300 + 10 + 1150 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/333.jpg");// 输出合成后的图片
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

	// 奋兴中学，下中间
	public static void compose_yxfx_xiayoubain() {
		String[] str = new String[] { "黄小翔", "20150101" };
		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学9格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 770, 300 + 40 + 1150 * 2, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2) + 675,
					image.getHeight() - 225 - 2300 + 20 + 1150 * 2);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2) + 705,
					image.getHeight() - 140 - 2300 + 10 + 1150 * 2);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/333.jpg");// 输出合成后的图片
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

	// 奋兴中学
	public static void compose_yxfx() {
		String[] str = new String[] { "麦婷婷", "20150101" };

		try {
			InputStream imagein = new FileInputStream("d:/奋兴中学/奋兴中学9格模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/奋兴中学/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 206, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 247, // 相差50，三247，二297，四197，五147
					955);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 265, 1030);

			// 上中间
			g.drawImage(image2, 996, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1037, // 相差50
					955);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 1055, 1030);

			// 上右边
			g.drawImage(image2, 1786, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置名字字体格式
			g.drawString(str[0], 1825, 955);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 1845, 1030);

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 206, 1490, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 247, 2105);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 265, 2180);

			// 中中间
			g.drawImage(image2, 996, 1490, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1037, 2105);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 1055, 2180);

			// 中右边
			g.drawImage(image2, 1786, 1490, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1825, 2105);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 1845, 2180);

			// 把照片合成到背景图上，下左边
			g.drawImage(image2, 206, 2640, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 247, 3255);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 265, 3330);

			// 下中间
			g.drawImage(image2, 996, 2640, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1037, 3255);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 1055, 3330);

			// 下右边
			g.drawImage(image2, 1786, 2640, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("方正大标宋_GBK", Font.PLAIN, 90));// 设置字体格式
			g.drawString(str[0], 1825, 3255);
			g.setFont(new Font("黑体", Font.PLAIN, 60));
			g.drawString(str[1], 1845, 3330);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/奋兴中学/333.jpg");// 输出合成后的图片
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
			bgIS=new FileInputStream("D:/奋兴中学/b.jpg");
			stuIS=new FileInputStream("D:/奋兴中学/222.jpg");
			//210,300,330,460,90,235,910,60,260,1000
			//相差50
			bgImage=ImageIO.read(bgIS);//学生证模板
			stuImage=ImageIO.read(stuIS);//学生照片
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 210, 300, 330, 460, null);//学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
			bg.drawString("司耀祖", 235, 910);//三个字235，两个字285，四个字185；五个字185，字体大小70
			bg.setFont(new Font("黑体", Font.PLAIN, 60));
			bg.drawString("20150109", 260, 1000);
			bg.dispose();
			
			out= new FileOutputStream("d:/奋兴中学/student.jpg");// 输出合成后的图片
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
