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

public class JPGComposeLTZX {


	public static void compose_ltzx() {
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
	
	public static void compose1() {

		try {
			InputStream imagein = new FileInputStream("d:/阳西一中/a.jpg");
			InputStream imagein1 = new FileInputStream("d:/阳西一中/stu.jpg");

			BufferedImage image = ImageIO.read(imagein);// 读取背景图
			BufferedImage image1 = ImageIO.read(imagein1);// 读取照片

			Graphics g = image.getGraphics();
			

			// 把照片合成到背景图上，上左边
			g.drawImage(image1, 20, 25, 750, 1125, null);

			// 把照片合成到背景图上，上中间
			g.drawImage(image1, 790, 25,  750, 1125, null);

			// 把照片合成到背景图上，上右边
			g.drawImage(image1, 1570, 25,  750, 1125, null);

			// 把照片合成到背景图上，中左边
			g.drawImage(image1, 20, 1165,  750, 1125, null);

			// 把照片合成到背景图上，中中间
			g.drawImage(image1, 790, 1165,  750, 1125, null);

			// 把照片合成到背景图上，中右边
			g.drawImage(image1, 1570, 1165,  750, 1125, null);

			// 把照片合成到背景图上，下左边
			g.drawImage(image1, 20, 2305,  750, 1125, null);

			// 把照片合成到背景图上，下中间
			g.drawImage(image1, 790, 2305,  750, 1125, null);

			// 把照片合成到背景图上，下右边
			g.drawImage(image1, 1570, 2305,  750, 1125, null);

			g.dispose();// 释放此图形的上下文以及它使用的所有系统资源
			OutputStream outImage = new FileOutputStream("d:/阳西一中/b.jpg");// 输出合成后的图片
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

	//合成学生证后再拼接到空白背景
	public static void composes() throws IOException{
		InputStream background=null;
		InputStream imagein1=null;
		InputStream imagein2=null;
		InputStream imagein3=null;
		InputStream stuPhoto=null;
		InputStream s222s=null;
		InputStream s333s=null;
		BufferedImage bgImage=null;
		BufferedImage image1=null;
		BufferedImage image2=null;
		BufferedImage image3=null;
		BufferedImage stuImage=null;
		BufferedImage s222Image=null;
		BufferedImage s333Image=null;
		OutputStream outImage=null;
		try {
			background = new FileInputStream("d:/阳西一中/a.jpg");
			imagein1 = new FileInputStream("d:/阳西一中/1.jpg");
			imagein2 = new FileInputStream("d:/阳西一中/1.jpg");
			imagein3 = new FileInputStream("d:/阳西一中/1.jpg");
			stuPhoto = new FileInputStream("d:/阳西一中/111.jpg");
			s222s = new FileInputStream("d:/阳西一中/222.jpg");
			s333s = new FileInputStream("d:/阳西一中/333.jpg");
			
			bgImage = ImageIO.read(background);
			image1 = ImageIO.read(imagein1);// 读取照片
			image2 = ImageIO.read(imagein2);// 读取照片
			image3 = ImageIO.read(imagein3);// 读取照片
			stuImage = ImageIO.read(stuPhoto);
			s222Image = ImageIO.read(s222s);
			s333Image = ImageIO.read(s333s);
			
			Graphics g1 = image1.getGraphics();
//			Graphics g2 = image2.getGraphics();
//			Graphics g3 = image3.getGraphics();
			
			g1.drawImage(stuImage, 230, 300, 330, 460, null);
			g1.setColor(Color.BLACK); // 设置字体颜色
			g1.setFont(new Font("黑体", Font.BOLD, 42));// 设置字体格式
			g1.drawString("何玉玉华", 320, 910);//三字350，两字380，四字350
			g1.setFont(new Font("黑体", Font.PLAIN, 32));
			g1.drawString("G441721199911165548", 280, 1000);
			g1.dispose();
			
			g1=image2.getGraphics();
			g1.drawImage(s222Image, 230, 300, 330, 460, null);
			g1.setColor(Color.BLACK); // 设置字体颜色
			g1.setFont(new Font("黑体", Font.BOLD, 42));// 设置字体格式
			g1.drawString("何玉华", 350, 910);
			g1.setFont(new Font("黑体", Font.PLAIN, 32));
			g1.drawString("G441721199911165548", 280, 1000);
			g1.dispose();
			
			g1=image3.getGraphics();
			g1.drawImage(s333Image, 230, 300, 330, 460, null);
			g1.setColor(Color.BLACK); // 设置字体颜色
			g1.setFont(new Font("黑体", Font.BOLD, 42));// 设置字体格式
			g1.drawString("何玉华", 350, 910);
			g1.setFont(new Font("黑体", Font.PLAIN, 32));
			g1.drawString("G441721199911165548", 280, 1000);
			g1.dispose();
			
			
			Graphics g = bgImage.getGraphics();
			// 把照片合成到背景图上，上左边
			g.drawImage(image1, 20, 25, 750, 1125, null);
			// 把照片合成到背景图上，上中间
			g.drawImage(image1, 790, 25, 750, 1125, null);

			// 把照片合成到背景图上，上右边
			g.drawImage(image1, 1570, 25, 750, 1125, null);

			// 把照片合成到背景图上，中左边
			g.drawImage(image2, 20, 1165, 750, 1125, null);

			// 把照片合成到背景图上，中中间
			g.drawImage(image2, 790, 1165, 750, 1125, null);

			// 把照片合成到背景图上，中右边
			g.drawImage(image2, 1570, 1165, 750, 1125, null);

			// 把照片合成到背景图上，下左边
			g.drawImage(image3, 20, 2305, 750, 1125, null);

			// 把照片合成到背景图上，下中间
			g.drawImage(image3, 790, 2305, 750, 1125, null);

			// 把照片合成到背景图上，下右边
			g.drawImage(image3, 1570, 2305, 750, 1125, null);
			g.dispose();
			
			outImage = new FileOutputStream("d:/阳西一中/student.jpg");// 输出合成后的图片
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(outImage);
			enc.encode(bgImage);
			
			System.out.println("finish!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=outImage){
				outImage.close();
			}
			if(null!=imagein1){
				imagein1.close();
			}
			if(null!=stuPhoto){
				stuPhoto.close();
			}
			if(null!=background){
				background.close();
			}
		}
	}
	
	public static void compose_loop() throws IOException{
		InputStream blankIS=null;
		InputStream bgIS=null;
		InputStream stuIS=null;
		BufferedImage blankImage=null;
		BufferedImage bgImage=null;
		BufferedImage stuImage=null;
		OutputStream out=null;
		int[] photoX=new int[]{20,790,1570,20,790,1570,20,790,1570};
		int[] photoY=new int[]{25,25,25,1165,1165,1165,2305,2305,2305};
		try{
			blankIS=new FileInputStream("d:/龙田中学/blank.jpg");
			blankImage=ImageIO.read(blankIS);
			Graphics blankBg=blankImage.getGraphics();
			Graphics bg=null;
			for(int i=0;i<9;i++){
				bgIS=new FileInputStream("d:/龙田中学/model.jpg");
				stuIS=new FileInputStream("d:/龙田中学/111.jpg");
				bgImage=ImageIO.read(bgIS);
				stuImage=ImageIO.read(stuIS);
				bg=bgImage.getGraphics();
				bg.drawImage(stuImage, 220, 300, 330, 460, null);//学生证模板与学生照片合成
				bg.setColor(Color.BLACK); // 设置字体颜色
				bg.setFont(new Font("黑体", Font.BOLD, 80));// 设置字体格式
				bg.drawString("黄冬梅", 260, 910);//三字260，两字300，四字220
				bg.setFont(new Font("黑体", Font.PLAIN, 50));
				bg.drawString("LTZX2015070439", 210, 1000);
				bg.dispose();
				//220,300,330,460,80,260,910,50,210,1000
				//相差40
				blankBg.drawImage(bgImage, photoX[i], photoY[i], 750, 1125, null);
			}
			blankBg.dispose();
			
			out=new FileOutputStream("d:/龙田中学/student.jpg");
			JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(out);
			enc.encode(blankImage);
			
			System.out.println("finish!!!");
		}catch(Exception e){
			
		}finally{
			if(null!=blankIS){
				blankIS.close();
			}
			if(null!=bgIS){
				bgIS.close();
			}
			if(null!=stuIS){
				stuIS.close();
			}
		}
	}
	
	public static void compose() throws IOException{
		InputStream bgIS=null;
		InputStream stuIS=null;
		BufferedImage bgImage=null;
		BufferedImage stuImage=null;
		OutputStream out=null;
		
		try{
			bgIS=new FileInputStream("D:/龙田中学/model.jpg");
			stuIS=new FileInputStream("D:/龙田中学/1.jpg");
			//210,300,330,450,90,235,900,60,165,990
			//相差50
			bgImage=ImageIO.read(bgIS);//学生证模板
			stuImage=ImageIO.read(stuIS);//学生照片
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 210, 300, 330, 450, null);//学生证模板与学生照片合成
			bg.setColor(Color.BLACK); // 设置字体颜色
			bg.setFont(new Font("黑体", Font.BOLD, 90));// 设置字体格式
			bg.drawString("陈梓惠", 235, 900);//三个字235，两个字285，四个字185；
			bg.setFont(new Font("黑体", Font.PLAIN, 60));
			bg.drawString("LTZX2014080121", 165, 990);
			bg.dispose();
			
			out= new FileOutputStream("d:/龙田中学/students.jpg");// 输出合成后的图片
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