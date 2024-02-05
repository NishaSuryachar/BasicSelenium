package TestNG;

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

public class DataProviderWithExcelLoop extends BaseClass
{
	@DataProvider(name="login")
   public Object[][] sender() throws EncryptedDocumentException, IOException
   {
	   Object[][] obj=new Object[3][2];
	   File file = new File("C:\\Users\\hp\\Desktop\\Selenium\\login.xlsx");
	   FileInputStream fis = new FileInputStream(file);
	   Workbook wbf=WorkbookFactory.create(fis);
	   Sheet sheet = wbf.getSheet("Sheet1");
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<2;j++)
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
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
