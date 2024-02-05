package PracticePg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx extends BaseClass 
{
   @DataProvider(name="login")
   public Object[][] sender() throws EncryptedDocumentException, IOException
   {
	   
	   File file = new File("C:\\Users\\hp\\Desktop\\Selenium\\Login.xlsx");
	   FileInputStream fis=new FileInputStream(file);
	   Workbook wbf=WorkbookFactory.create(fis);
	   Sheet sheet = wbf.getSheet("shivappa");
	   int row = sheet.getPhysicalNumberOfRows();
	   int col = sheet.getRow(0).getPhysicalNumberOfCells();
	   Object[][] obj=new Object[row][col];
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<col;j++)
		   {
			   obj[i][j]=sheet.getRow(i).getCell(j).toString();
		   }
	   }
	   return obj;
   }
   @Test(dataProvider = "login")
   public void receiver(String email,String password)
   {
	   driver.get("https://demowebshop.tricentis.com/login");
	   driver.findElement(By.id("Email")).sendKeys(email);
	   driver.findElement(By.id("Password")).sendKeys(password);
	   driver.findElement(By.id("RememberMe")).click();
	   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
   }
}
