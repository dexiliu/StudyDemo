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

	// ������ѧ
	public static void fxzx_compose() {
		String[] str = new String[] { "�Ƽ���", "20160216" };
		try {
			InputStream imagein = new FileInputStream("d:/������ѧ/2.jpg");
			InputStream imagein2 = new FileInputStream("d:/������ѧ/13.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 177,
					300, 377, 520, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("���������_GBK", Font.PLAIN, 90));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 77 / 2),
					image.getHeight() - 220);
			g.setFont(new Font("����", Font.PLAIN, 60));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 23 / 2),
					image.getHeight() - 140);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/������ѧ/3.jpg");// ����ϳɺ��ͼƬ
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

	// ̩��һ��
	public static void tnyz_compose() {
		String[] str = new String[] { "������", "L35042919981225001X" };
		try {
			InputStream imagein = new FileInputStream("d:/̩��һ��/1.jpg");
			InputStream imagein2 = new FileInputStream("d:/̩��һ��/2.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 450, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("���������_GBK", Font.PLAIN, 90));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 79 / 2),
					image.getHeight() - 200);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 24 / 2),
					image.getHeight() - 115);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/̩��һ��/3.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ��
	public static void yxyz_compose() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/1.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/2.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 23 / 2),
					image.getHeight() - 228);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 10 / 2),
					image.getHeight() - 140);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/3.jpg");// ����ϳɺ��ͼƬ
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
	// ����һ�У������
	public static void compose_yxyz_shangzuobian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/33.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/11.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 935,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/3.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У����м�
	public static void compose_yxyz_shangzhongjian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��3.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2), 882);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2), 970);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/33.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У����ұ�
	public static void compose_yxyz_shangyoubian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��3.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/33.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У��ϱ�
	public static void compose_yxyz_shang() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��3.jpg");
			InputStream imagein1 = new FileInputStream("d:/����һ��/1.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/11.jpg");
			InputStream imagein3 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image1 = ImageIO.read(imagein1);// ��ȡ��Ƭ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			BufferedImage image3 = ImageIO.read(imagein3);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();

			// ����Ƭ�ϳɵ�����ͼ�ϣ����
			g.drawImage(image1, image.getWidth() - image.getWidth() / 2 - 935,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970);

			// ����Ƭ�ϳɵ�����ͼ�ϣ��м�
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 0,
					882);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 0,
					970);

			// ����Ƭ�ϳɵ�����ͼ�ϣ��ұ�
			g.drawImage(image3, image.getWidth() - image.getWidth() / 2
					- (-615), 320, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2)
					- (-785), 882);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2)
					- (-780), 970);

			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/3.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У������
	public static void compose_yxyz_zhongzuobian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��6.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 320 + 1140, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/2.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У����м�
	public static void compose_yxyz_zhongzhongjian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��6.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					1460, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/2.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У����ұ�
	public static void compose_yxyz_zhongyoubian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��6.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 1460, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/2.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У��м�
	public static void compose_yxyz_zhong() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��6.jpg");
			InputStream imagein4 = new FileInputStream("d:/����һ��/111.jpg");
			InputStream imagein5 = new FileInputStream("d:/����һ��/11.jpg");
			InputStream imagein6 = new FileInputStream("d:/����һ��/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image4 = ImageIO.read(imagein4);// ��ȡ��Ƭ
			BufferedImage image5 = ImageIO.read(imagein5);// ��ȡ��Ƭ
			BufferedImage image6 = ImageIO.read(imagein6);// ��ȡ��Ƭ

			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ�ϣ����
			g.drawImage(image4, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 1460, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140);

			// ����Ƭ�ϳɵ�����ͼ�ϣ��м�
			g.drawImage(image5, image.getWidth() - image.getWidth() / 2 - 165,
					1460, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140);

			// ����Ƭ�ϳɵ�����ͼ�ϣ��ұ�
			g.drawImage(image6, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 1460, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140);

			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/2.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ��,�����
	public static void compose_yxyz_xiazuobian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��9.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140 * 2);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140 * 2);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/22.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У����м�
	public static void compose_yxyz_xiazhongjian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��9.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165,
					320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140 * 2);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140 * 2);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/22.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У����м�
	public static void compose_yxyz_xiaxiabian() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��9.jpg");
			InputStream imagein2 = new FileInputStream("d:/����һ��/111.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image2 = ImageIO.read(imagein2);// ��ȡ��Ƭ
			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ��
			g.drawImage(image2, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140 * 2);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140 * 2);
			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/22.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ�У��±�
	public static void compose_yxyz_xia() {
		String[] str = new String[] { "������", "G441721199911165548" };
		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��9.jpg");
			InputStream imagein7 = new FileInputStream("d:/����һ��/111.jpg");
			InputStream imagein8 = new FileInputStream("d:/����һ��/11.jpg");
			InputStream imagein9 = new FileInputStream("d:/����һ��/1.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image7 = ImageIO.read(imagein7);// ��ȡ��Ƭ
			BufferedImage image8 = ImageIO.read(imagein8);// ��ȡ��Ƭ
			BufferedImage image9 = ImageIO.read(imagein9);// ��ȡ��Ƭ

			Graphics g = image.getGraphics();
			// ����Ƭ�ϳɵ�����ͼ�ϣ������
			g.drawImage(image7, image.getWidth() - image.getWidth() / 2 - 165
					- 770, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) - 770,
					882 + 1140 * 2);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) - 770,
					970 + 1140 * 2);

			// ����Ƭ�ϳɵ�����ͼ�ϣ����м�
			g.drawImage(image8, image.getWidth() - image.getWidth() / 2 - 165,
					320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2),
					882 + 1140 * 2);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2),
					970 + 1140 * 2);

			// ����Ƭ�ϳɵ�����ͼ�ϣ����ұ�
			g.drawImage(image9, image.getWidth() - image.getWidth() / 2 - 165
					+ 780, 320 + 1140 * 2, 350, 470, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 40));// ���������ʽ
			g.drawString(str[0], image.getWidth()
					- (image.getWidth() / 2 + str[0].length() * 38 / 2) + 785,
					882 + 1140 * 2);
			g.setFont(new Font("����", Font.PLAIN, 32));
			g.drawString(str[1], image.getWidth()
					- (image.getWidth() / 2 + str[1].length() * 15 / 2) + 780,
					970 + 1140 * 2);

			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/22.jpg");// ����ϳɺ��ͼƬ
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

	// ����һ��
	public static void compose_yxyz() {
		String[] str = new String[] { "������", "G441721199911165548" };

		try {
			InputStream imagein = new FileInputStream("d:/����һ��/����һ��ѧ����ģ��9.jpg");
			InputStream imagein1 = new FileInputStream("d:/����һ��/2.jpg");

			BufferedImage image = ImageIO.read(imagein);// ��ȡ����ͼ
			BufferedImage image1 = ImageIO.read(imagein1);// ��ȡ��Ƭ

			Graphics g = image.getGraphics();

			// ����Ƭ�ϳɵ�����ͼ�ϣ������
			g.drawImage(image1, 236, 300, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString("������", 287, // ������287�����40
					882);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 262-90, 970);

			// ����Ƭ�ϳɵ�����ͼ�ϣ����м�
			g.drawImage(image1, 1006, 300, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString("����������",1057-40-40, // ������1057�����40
					882);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 1032-90, 970);

			// ����Ƭ�ϳɵ�����ͼ�ϣ����ұ�
			g.drawImage(image1, 1786, 300, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString(str[0], 1907-65, 882);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 1812-90, 970);

			// ����Ƭ�ϳɵ�����ͼ�ϣ������
			g.drawImage(image1, 236, 1440, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString(str[0], 352-65, 2022);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 262-90, 2110);

			// ����Ƭ�ϳɵ�����ͼ�ϣ����м�
			g.drawImage(image1, 1006, 1440, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString(str[0], 1122-65, 2022);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 1032-90, 2110);

			// ����Ƭ�ϳɵ�����ͼ�ϣ����ұ�
			g.drawImage(image1, 1786, 1440, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString(str[0], 1907-65, 2022);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 1812-90, 2110);

			// ����Ƭ�ϳɵ�����ͼ�ϣ������
			g.drawImage(image1, 236, 2580, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString(str[0], 352-65, 3162);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 262-90, 3250);

			g.drawImage(image1, 1006, 2580, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString(str[0], 1122-65, 3162);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 1032-90, 3250);

			g.drawImage(image1, 1786, 2580, 350, 500, null);
			g.setColor(Color.BLACK); // ����������ɫ
			g.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			g.drawString(str[0], 1907-65, 3162);
			g.setFont(new Font("����", Font.PLAIN, 50));
			g.drawString(str[1], 1812-90, 3250);

			g.dispose();// �ͷŴ�ͼ�ε��������Լ���ʹ�õ�����ϵͳ��Դ
			OutputStream outImage = new FileOutputStream("d:/����һ��/666666.jpg");// ����ϳɺ��ͼƬ
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
			bgIS=new FileInputStream("D:/����һ��/model.jpg");
			stuIS=new FileInputStream("D:/����һ��/111.jpg");
			//220,300,330,460,80,260,850,50,140,940
			//���40
			bgImage=ImageIO.read(bgIS);//ѧ��֤ģ��
			stuImage=ImageIO.read(stuIS);//ѧ����Ƭ
			Graphics bg=null;
			bg=bgImage.getGraphics();
			bg.drawImage(stuImage, 220, 300, 330, 460, null);//ѧ��֤ģ����ѧ����Ƭ�ϳ�
			bg.setColor(Color.BLACK); // ����������ɫ
			bg.setFont(new Font("����", Font.BOLD, 80));// ���������ʽ
			bg.drawString("��ͬ��", 260, 850);//������260��������300���ĸ���220
			bg.setFont(new Font("����", Font.PLAIN, 50));
			bg.drawString("G441721199911165548", 140, 940);
			bg.dispose();
			
			out= new FileOutputStream("d:/����һ��/student.jpg");// ����ϳɺ��ͼƬ
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