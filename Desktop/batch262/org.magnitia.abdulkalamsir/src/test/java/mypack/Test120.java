package mypack;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test120
{
	public static void main(String[] args) throws Exception
	{
		//Take new Excel file with a sheet
		File f=new File("src/test/resources/datafiles/Book2.xlsx");
		XSSFWorkbook wwb=new XSSFWorkbook(); 
		Sheet wsh;
		try
		{
			wsh=wwb.createSheet("Sheet1");
		}
		catch(Exception ex) //if already exist
		{
			wsh=wwb.getSheet("Sheet1");
		}
		//Creating font and style objects  
        Font font=wwb.createFont();  
        font.setFontHeightInPoints((short)60);  
        font.setFontName("Arial");  
        font.setItalic(true);  
        font.setColor(IndexedColors.BROWN.getIndex());
        CellStyle style=wwb.createCellStyle(); 
        style.setFont(font);  
        // Applying style to the cell  
        Cell cell=wsh.createRow(0).createCell(0); // Creating a cell  
        cell.setCellValue("Hello, All of you");  
        cell.setCellStyle(style);   
        wsh.autoSizeColumn(0);
        //Save excel file
      	FileOutputStream fo=new FileOutputStream(f); //WRITE mode(Appending)
      	wwb.write(fo);
      	wwb.close();
	}
}