package partie6;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Exercice62 {

	public static void main(String[] args) {
		Document Doc = new Document();
		Doc.addAuthor("moi");
		Doc.addCreationDate();
		Doc.addTitle("first doc");
		try { // Exception 
			FileOutputStream fos = new FileOutputStream("Fichier.pdf");
			PdfWriter writer = PdfWriter.getInstance(Doc, fos);
			Doc.open();
			Doc.add(new Paragraph("Para 1"));
			Doc.close();
		}catch (DocumentException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
