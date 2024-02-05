package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSenderAndReceiver
{
	@DataProvider(name="login")
  public Object[][] sender()
  {
	 Object[][] obj=new Object[3][2];
	 obj[0][0]="admin01@gmail.com";
	 obj[0][1]="admin01";
	 obj[1][0]="Admin02@gmail.com";
	 obj[1][1]="Admin02";
	 obj[2][0]="admin08@gmail.com";
	 obj[2][1]="admin2";
	 return obj;
  }
	@Test(dataProvider = "login")
	public void receiver(String email,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
//dataprovider it requires two methods sender and receiver
//sender method return type is two dimensional object  
//we have to create object for object class of two dimension ,object[3][2]
//in first [] we are mentioning how many times we are passing data  eg:[3] it will pass email,password for 3 times in different browser window
//and 2nd [] represents no of rows in our program we have only 2 rows email,password so [2] we mentioned
//[0][0]= it takes email      [0][1]=password  
//[1][0]=it takes email     [1][1]=password


