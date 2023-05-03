package mypack;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

public class Test127
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("src/test/resources/datafiles/mypdf.pdf");
		FileOutputStream fo=new FileOutputStream(f);
		//Add text into a new pdf file
		Document doc=new Document();
		PdfWriter.getInstance(doc,fo);
		doc.open();
		Font ft=FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		Chunk c= new Chunk("Hello friends, are you feeling sleepy?", ft);
		doc.add(c);
		doc.close();
	}
}
