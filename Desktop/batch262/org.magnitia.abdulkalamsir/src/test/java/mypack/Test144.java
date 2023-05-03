package mypack;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Test144
{
	public static void main(String[] args) throws Exception
	{
		//Take new Word document in "WRITE" mode
		File f=new File("src/test/resources/datafiles/doc1.docx");
		FileOutputStream fo=new FileOutputStream(f);
		XWPFDocument doc=new XWPFDocument();  
        XWPFParagraph para=doc.createParagraph();  
        XWPFRun run=para.createRun();  
        run.setText("Hello all, Mary christmas.");  
        doc.write(fo); 
        doc.close();
        fo.close();
	}
}
