package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	   FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\Practice.xlsx");
	   Workbook wb=WorkbookFactory.create(fis);
	   wb.getSheet("Sheet1").createRow(0).createCell(0).setCellValue("PleaseSaveMe");
	   FileOutputStream  fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Selenium\\Login.xlsx");
	   wb.write(fos);
	   wb.close();
	   
	   FileInputStream fis2=new FileInputStream("C:\\Users\\hp\\Desktop\\Selenium\\Login.xlsx");
	   String value = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	   System.out.println(value);
	   
	 }

}
