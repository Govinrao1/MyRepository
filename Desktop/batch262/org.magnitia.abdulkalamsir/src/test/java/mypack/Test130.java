package mypack;

import java.io.File;
import java.io.FileInputStream;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Test130
{
	public static void main(String[] args) throws Exception
	{
		//Open an existing PDF file in READ mode
		File f=new File("E:\\example-user-stories.pdf");
		FileInputStream fi=new FileInputStream(f);
		PdfReader pr=new PdfReader(fi);
		//Get text of 11th page
        String x=PdfTextExtractor.getTextFromPage(pr,11);
        System.out.println(x);
        pr.close();
	}
}
