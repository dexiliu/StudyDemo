package javaToPdf;

import java.awt.Color;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class JavaToPdfUtils {

	Document document = new Document();// ����һ��Document����

	private static Font headfont;// ���������С
	private static Font keyfont;// ���������С
	private static Font textfont;// ���������С
	private String[] subject = new String[] { "����", "��ѧ", "Ӣ��", "����", "��ʷ",
			"����", "����", "��ѧ", "����", "����","����"};
	private String[] str = new String[] { "��ĩ", "����" };
	private String REPORT = "2014-2015ѧ��ȵ�һѧ��ҵ�ѽ����������ؽ�����֪ͨ���񣬽�ϱ�Уʵ���������У������2015��1��25�շź��٣���ѧ����2015��3��1�գ�����ʮһ�����У�����ޣ�2����ʽ�ϿΡ��ֽ����ӵܸ߶�23�����ķ�ͬѧ��ѧ��˼����ֺ�ѧҵ�ɼ������㱨��ϣ�����ں����ڼ�����ӵ�����ط���������ṫ�£�ע�ⰲȫ��Զ�롰�ơ��ġ������������μ���������ʵ������������䰴ʱ��У�ϿΡ����������ӵܻ�Уʱ�����˽����ļ������ѧУ��";
	private String HEADER = "�𾴵�ѧ���ҳ���";
	private String TITLE = "��ͥ������";
	private String SCHOOL = "�����ص�һ��ѧ";
	private Date date = new Date();

	SimpleDateFormat time = new SimpleDateFormat("yyyy��MM��dd��");

	static {
		BaseFont bfChinese;
		try {
			bfChinese = BaseFont.createFont("C:/WINDOWS/Fonts/SIMSUN.TTC,1", BaseFont.IDENTITY_H,
					BaseFont.EMBEDDED);
			headfont = new Font(bfChinese, 10, Font.BOLD,
					new Color(238, 44, 44));// ���������С
			keyfont = new Font(bfChinese, 9, Font.BOLD);// ���������С
			textfont = new Font(bfChinese, 8, Font.BOLD);// ���������С
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	int maxWidth = 500;

	/**
	 * 
	 * @param value
	 * @param font
	 *            ����
	 * @param align
	 *            ����λ�ã����С���
	 * @return
	 */
	public PdfPCell createCell(String value, com.lowagie.text.Font font,
			int align) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(align);
		cell.setPhrase(new Phrase(value, font));
		cell.setMinimumHeight(20);//���ÿո�ĸ߶�
		return cell;
	}

	/**
	 * �ϲ�������
	 * @param value
	 * @param font
	 * @param align
	 * @return
	 */
	public PdfPCell createColspanCell(String value, com.lowagie.text.Font font,
			int align) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(align);
		cell.setPhrase(new Phrase(value, font));
		cell.setColspan(2);
		cell.setMinimumHeight(20);
		return cell;
	}

	/**
	 * �ϲ���11��
	 * @param value
	 * @param font
	 * @param align
	 * @return
	 */
	public PdfPCell createColspanCell1(String value,
			com.lowagie.text.Font font, int align) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(align);
		cell.setPhrase(new Phrase(value, font));
		cell.setColspan(12);
		cell.setMinimumHeight(20);
		return cell;
	}

	/**
	 * �ϲ�������
	 * @param value
	 * @param font
	 * @return
	 */
	public PdfPCell createRowspanCell(String value, com.lowagie.text.Font font) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setPhrase(new Phrase(value, font));
		cell.setRowspan(1);
		return cell;
	}

	public PdfPCell createCell(String value, com.lowagie.text.Font font,
			int align, int colspan, boolean boderFlag) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(align);
		cell.setColspan(colspan);
		cell.setPhrase(new Phrase(value, font));
		cell.setPadding(3.0f);
		if (!boderFlag) {
			cell.setBorder(0);
			cell.setPaddingTop(15.0f);
			cell.setPaddingBottom(8.0f);
		}
		return cell;
	}

	//����һ��colNumber�еı��
	public PdfPTable createTable(int colNumber) {
		PdfPTable table = new PdfPTable(colNumber);
		try {
			table.setTotalWidth(maxWidth);
			table.setLockedWidth(true);
			table.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.getDefaultCell().setBorder(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return table;
	}

	public void writePdf() throws Exception {
		// 1.�½�document����
		// ��һ��������ҳ���С���������Ĳ����ֱ������ҡ��Ϻ���ҳ�߾ࡣ
		Document document = new Document(PageSize.A4, 50, 50, 30, 30);
		// 2.����һ����д��(Writer)��document���������ͨ����д��(Writer)���Խ��ĵ�д�뵽�����С�
		// ���� PdfWriter ���� ��һ�������Ƕ��ĵ���������ã��ڶ����������ļ���ʵ�����ƣ��ڸ������л�����������·����
		PdfWriter.getInstance(document, new FileOutputStream("e:\\��ͥ������.pdf"));
		// 3.���ĵ�
		document.open();
		// 4.���ĵ����������
		// ͨ�� com.lowagie.text.Paragraph ������ı����������ı�����Ĭ�ϵ����塢��ɫ����С�ȵ�����������һ��Ĭ�϶���
		Paragraph pt = new Paragraph(TITLE, headfont);//����������ʽ
		pt.setAlignment(1);// �������־��� 0���� 1������ 2������
		document.add(pt);
		document.add(new Paragraph("\n"));
		pt = new Paragraph(HEADER, keyfont);
		pt.setAlignment(0);
		document.add(pt);
		pt = new Paragraph(REPORT, keyfont);
		pt.setFirstLineIndent(19);
		document.add(pt);
		
		pt=new Paragraph("����",keyfont);
		pt.setFirstLineIndent(19);
		document.add(pt);
		pt=new Paragraph("����",keyfont);
		document.add(pt);
		
		pt = new Paragraph(SCHOOL, keyfont);
		pt.setAlignment(2);
		document.add(pt);
//		pt = new Paragraph(time.format(date), textfont);
		pt = new Paragraph("2015��1��25",keyfont);
		pt.setAlignment(2);
		document.add(pt);

		// ѧ���ɼ�������
		PdfPTable table = createTable(14);
		table.addCell(createCell("��ѧҵ�ɼ�������������", keyfont, Element.ALIGN_LEFT,
				14, false));

		table.addCell(createColspanCell("��Ŀ:", keyfont, Element.ALIGN_CENTER));
		for (int n = 0; n < subject.length; n++) {
			table.addCell(createCell(subject[n], keyfont, Element.ALIGN_CENTER));
		}
		table.addCell(createCell("ȫ������", textfont, Element.ALIGN_CENTER));

//		table.addCell(createRowspanCell("�ɼ�", keyfont));
		table.addCell(createColspanCell("��ĩ�ɼ�", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("90", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("80", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("95", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("85", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("87", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("88", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("90", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("91", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("89", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("85", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("93", keyfont, Element.ALIGN_CENTER));
		table.addCell(createCell("90", keyfont, Element.ALIGN_CENTER));
		/*
		 * table.addCell(createCell("����", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("93", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("82", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("85", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("86", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("84", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("89", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("93", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("95", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("88", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("87", keyfont, Element.ALIGN_CENTER));
		 * table.addCell(createCell("90", keyfont, Element.ALIGN_CENTER));
		 */
		table.addCell(createColspanCell("����������", keyfont, Element.ALIGN_CENTER));
		table.addCell(createColspanCell1("����ѧϰ�̿ࡢ���棬�����������������ˡ�", keyfont, Element.ALIGN_LEFT));

		table.addCell(createColspanCell("�ҳ�����", keyfont, Element.ALIGN_CENTER));
		table.addCell(createColspanCell1("ѧϰ�Ծ�������������", keyfont, Element.ALIGN_LEFT));

		document.add(table);
		// 5.�ر��ĵ�
		document.close();
	}
}
