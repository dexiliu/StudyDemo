package javaToPdf;

public class PDFReport {

	public static void main(String[] args) throws Exception {
		JavaToPdfUtils pdf=new JavaToPdfUtils();
		pdf.writePdf();
		System.out.println("finish!");
	}
}
