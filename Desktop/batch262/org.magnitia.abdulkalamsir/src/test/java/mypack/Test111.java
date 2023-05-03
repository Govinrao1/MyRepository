package mypack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test111
{
	public static void main(String[] args) throws Exception
	{
		//convert original file into zip file
		File fileToZip=new File("E:\\Model Resume Exp.doc");
        FileInputStream fis=new FileInputStream(fileToZip);
		File zipfile=new File("E:\\Model Resume Exp.zip");
		FileOutputStream fos=new FileOutputStream(zipfile);
        ZipOutputStream zipOut=new ZipOutputStream(fos);
        ZipEntry zipEntry=new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes=new byte[1024];
        int length;
        while((length=fis.read(bytes))>=0) 
        {
            zipOut.write(bytes, 0, length);
        }
        zipOut.close();
        fis.close();
        fos.close();
	}
}
