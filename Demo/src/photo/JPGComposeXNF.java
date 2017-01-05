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

public class JPGComposeXNF {

	// 新南方，上左边
	public static void compose_xnf_shangzuobian() {
		String[] str = new String[] { "陈小东", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/新南方/新南方学校3格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/新南方/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();
			// 把照片合成到背景图上
			g.drawImage(image2, 222, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 392, // 1950，三个字的参数；1930，两个字参数
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 307, 1030);
			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/新南方/3.jpg");// 输出合成后的图片
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

	// 新南方，上
	public static void compose_xnf_shangzhongjian() {
		String[] str = new String[] { "陈小东", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/新南方/新南方学校3格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/新南方/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 222, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 392, // 1950，三个字的参数；1930，两个字参数
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 307, 1030);

			// 把照片合成到背景图上，上中间
			g.drawImage(image2, 997, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1167, // 1950，三个字的参数；1930，两个字参数
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1082, 1030);

			// 把照片合成到背景图上，上右边
			g.drawImage(image2, 1772, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1942, // 1950，三个字的参数；1930，两个字参数
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 1030);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/新南方/3.jpg");// 输出合成后的图片
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

	// 新南方，中
	public static void compose_xnf_zhongzuo() {
		String[] str = new String[] { "陈小东", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/新南方/新南方学校6格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/新南方/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 222, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 392, // 1950，三个字的参数；1930，两个字参数
					2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 307, 1030 + 1145);

			// 把照片合成到背景图上，中中间
			g.drawImage(image2, 997, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1167, // 1950，三个字的参数；1930，两个字参数
					2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1082, 2175);

			// 把照片合成到背景图上，中右边
			g.drawImage(image2, 1772, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1942, // 1950，三个字的参数；1930，两个字参数
					2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 2175);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/新南方/33.jpg");// 输出合成后的图片
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

	// 新南方，下
	public static void compose_xnf_xiazuobian() {
		String[] str = new String[] { "陈小东", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/新南方/新南方学校9格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/新南方/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，下左边
			g.drawImage(image2, 222, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 392, // 1950，三个字的参数；1930，两个字参数
					3225);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 307, 3320);

			// 把照片合成到背景图上，下中间
			g.drawImage(image2, 997, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1167, // 1950，三个字的参数；1930，两个字参数
					3225);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1082, 3320);

			// 把照片合成到背景图上，下右边
			g.drawImage(image2, 1772, 340 + 1145 * 2, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1942, // 1950，三个字的参数；1930，两个字参数
					3225);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 3320);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/新南方/333.jpg");// 输出合成后的图片
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

	// 新南方
	public static void compose_xnf() {
		String[] str = new String[] { "陈小东", "G440882199908084488" };
		try {
			InputStream imagein = new FileInputStream("d:/新南方/新南方学校9格学生卡模板.jpg");// 背景
			InputStream imagein2 = new FileInputStream("d:/新南方/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image2 = ImageIO.read(imagein2);// 读取照片
			Graphics g = image.getGraphics();

			// 把照片合成到背景图上，上左边
			g.drawImage(image2, 222, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString("小一东", 392, // 相差20
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 307, 1030);

			// 把照片合成到背景图上，上中间
			g.drawImage(image2, 997, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString("陈小东", 1167, // 相差20
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1082, 1030);

			// 把照片合成到背景图上，上右边
			g.drawImage(image2, 1772, 340, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1942, // 1950，三个字的参数；1930，两个字参数
					935);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 1030);

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 222, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 392, // 1950，三个字的参数；1930，两个字参数
					2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 307, 2175);

			// 把照片合成到背景图上，中中间
			g.drawImage(image2, 997, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1167, // 1950，三个字的参数；1930，两个字参数
					2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1082, 2175);

			// 把照片合成到背景图上，中右边
			g.drawImage(image2, 1772, 1485, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1942, // 1950，三个字的参数；1930，两个字参数
					2080);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 2175);

			// 把照片合成到背景图上，下左边
			g.drawImage(image2, 222, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 392, // 1950，三个字的参数；1930，两个字参数
					3225);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 307, 3320);

			// 把照片合成到背景图上，下中间
			g.drawImage(image2, 997, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1167, //
					3225);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1082, 3320);

			// 把照片合成到背景图上，下右边
			g.drawImage(image2, 1772, 2630, 350, 520, null);
			g.setColor(Color.BLACK); // 设置字体颜色
			g.setFont(new Font("黑体", Font.PLAIN, 42));// 设置字体格式
			g.drawString(str[0], 1942, //
					3225);
			g.setFont(new Font("黑体", Font.PLAIN, 32));
			g.drawString(str[1], 1857, 3320);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/新南方/3.jpg");// 输出合成后的图片
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
			bgIS=new FileInputStream("D:/新南方/model.jpg");
			stuIS=new FileInputStream("D:/新南方/1.jpg");
			//210,300,330,460,42,355,910,32,285,1000
			//相差20
			bgImage=ImageIO.read(bgIS);//学生证模板
			stuImage=ImageIO.read(stuIS);//学生照片
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 210, 300, 330, 460, null);//学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 42));// 设置字体格式
			bg.drawString("司同祖", 355, 910);//三个字355，两个字375，四个字335
			bg.setFont(new Font("黑体", Font.PLAIN, 32));
			bg.drawString("G440882199908084488", 285, 1000);
			bg.dispose();
			
			out= new FileOutputStream("d:/新南方/student.jpg");// 输出合成后的图片
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
