package PracticePg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMock 
{
	@DataProvider(name="Register")
  public Object[][] sender() throws EncryptedDocumentException, IOException
  {
	  
	  File file = new File("C:\\Users\\hp\\Desktop\\Selenium\\Login.xlsx");
	  FileInputStream fis=new FileInputStream(file);
	  Workbook wb=WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet("Sheet1");
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
	@Test(dataProvider = "Register")
  public void receiver(String email,String password)
  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		POMMOck pm=new POMMOck(driver);
		pm.Email(email);
		pm.Password(password);
		pm.RememberMe();
		pm.Login();
  }
}
