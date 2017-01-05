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

	Document document = new Document();// 建立一个Document对象

	private static Font headfont;// 设置字体大小
	private static Font keyfont;// 设置字体大小
	private static Font textfont;// 设置字体大小
	private String[] subject = new String[] { "语文", "数学", "英语", "政治", "历史",
			"地理", "物理", "化学", "生物", "口语","体育"};
	private String[] str = new String[] { "期末", "总评" };
	private String REPORT = "2014-2015学年度第一学期业已结束。根据县教育局通知精神，结合本校实际情况，我校决定于2015年1月25日放寒假，下学期于2015年3月1日（正月十一）晚回校上自修，2日正式上课。现将贵子弟高二23班杨文菲同学本学期思想表现和学业成绩向您汇报。希望您在寒假期间教育子弟遵纪守法，遵守社会公德，注意安全，远离“黄、赌、毒”，积极参加有益的社会实践活动，并督促其按时回校上课。请嘱咐贵子弟回校时别忘了将您的寄语带回学校。";
	private String HEADER = "尊敬的学生家长：";
	private String TITLE = "家庭报告书";
	private String SCHOOL = "阳西县第一中学";
	private Date date = new Date();

	SimpleDateFormat time = new SimpleDateFormat("yyyy年MM月dd日");

	static {
		BaseFont bfChinese;
		try {
			bfChinese = BaseFont.createFont("C:/WINDOWS/Fonts/SIMSUN.TTC,1", BaseFont.IDENTITY_H,
					BaseFont.EMBEDDED);
			headfont = new Font(bfChinese, 10, Font.BOLD,
					new Color(238, 44, 44));// 设置字体大小
			keyfont = new Font(bfChinese, 9, Font.BOLD);// 设置字体大小
			textfont = new Font(bfChinese, 8, Font.BOLD);// 设置字体大小
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	int maxWidth = 500;

	/**
	 * 
	 * @param value
	 * @param font
	 *            字体
	 * @param align
	 *            字体位置，左、中、右
	 * @return
	 */
	public PdfPCell createCell(String value, com.lowagie.text.Font font,
			int align) {
		PdfPCell cell = new PdfPCell();
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(align);
		cell.setPhrase(new Phrase(value, font));
		cell.setMinimumHeight(20);//设置空格的高度
		return cell;
	}

	/**
	 * 合并成两列
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
	 * 合并成11列
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
	 * 合并成两行
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

	//创建一个colNumber列的表格
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
		// 1.新建document对象
		// 第一个参数是页面大小。接下来的参数分别是左、右、上和下页边距。
		Document document = new Document(PageSize.A4, 50, 50, 30, 30);
		// 2.建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中。
		// 创建 PdfWriter 对象 第一个参数是对文档对象的引用，第二个参数是文件的实际名称，在该名称中还会给出其输出路径。
		PdfWriter.getInstance(document, new FileOutputStream("e:\\家庭报告书.pdf"));
		// 3.打开文档
		document.open();
		// 4.向文档中添加内容
		// 通过 com.lowagie.text.Paragraph 来添加文本。可以用文本及其默认的字体、颜色、大小等等设置来创建一个默认段落
		Paragraph pt = new Paragraph(TITLE, headfont);//设置字体样式
		pt.setAlignment(1);// 设置文字居中 0靠左 1，居中 2，靠右
		document.add(pt);
		document.add(new Paragraph("\n"));
		pt = new Paragraph(HEADER, keyfont);
		pt.setAlignment(0);
		document.add(pt);
		pt = new Paragraph(REPORT, keyfont);
		pt.setFirstLineIndent(19);
		document.add(pt);
		
		pt=new Paragraph("此至",keyfont);
		pt.setFirstLineIndent(19);
		document.add(pt);
		pt=new Paragraph("敬礼",keyfont);
		document.add(pt);
		
		pt = new Paragraph(SCHOOL, keyfont);
		pt.setAlignment(2);
		document.add(pt);
//		pt = new Paragraph(time.format(date), textfont);
		pt = new Paragraph("2015年1月25",keyfont);
		pt.setAlignment(2);
		document.add(pt);

		// 学生成绩及评语
		PdfPTable table = createTable(14);
		table.addCell(createCell("附学业成绩及班主任评语", keyfont, Element.ALIGN_LEFT,
				14, false));

		table.addCell(createColspanCell("科目:", keyfont, Element.ALIGN_CENTER));
		for (int n = 0; n < subject.length; n++) {
			table.addCell(createCell(subject[n], keyfont, Element.ALIGN_CENTER));
		}
		table.addCell(createCell("全级排名", textfont, Element.ALIGN_CENTER));

//		table.addCell(createRowspanCell("成绩", keyfont));
		table.addCell(createColspanCell("期末成绩", keyfont, Element.ALIGN_CENTER));
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
		 * table.addCell(createCell("总评", keyfont, Element.ALIGN_CENTER));
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
		table.addCell(createColspanCell("班主任评语", keyfont, Element.ALIGN_CENTER));
		table.addCell(createColspanCell1("该生学习刻苦、认真，积极主动，乐于助人。", keyfont, Element.ALIGN_LEFT));

		table.addCell(createColspanCell("家长评语", keyfont, Element.ALIGN_CENTER));
		table.addCell(createColspanCell1("学习自觉，做家务主动", keyfont, Element.ALIGN_LEFT));

		document.add(table);
		// 5.关闭文档
		document.close();
	}
}
