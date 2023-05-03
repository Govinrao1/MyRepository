package mypack;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Test145
{
	public static void main(String[] args) throws Exception
	{
		//Open existing file in "READ" mode
		File f=new File("src/test/resources/datafiles/doc1.docx");
		FileInputStream is=new FileInputStream(f);
		XWPFDocument xdoc=new XWPFDocument(is);
		XWPFWordExtractor ex=new XWPFWordExtractor(xdoc);
		System.out.println(ex.getText());
		ex.close();
	}
}
