

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethodsPracticing
{
	
		@Test(priority = 3,invocationCount = 2,threadPoolSize = 2)
	   public void audi()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.audi.in/");
		  driver.close();
	   }
		
	   @Test(priority = 1)
	   public void redbus()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.redbus.in/");
		  driver.close();
	   }
	   @Test(priority = 2,dependsOnMethods = "ktm")
	   public void royalEnfield()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.royalenfield.com/");
		  driver.close();
	   }
	   @Test(priority = 5)
	   public void bike()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.bikewale.com/");
		  driver.close();
	   }
	   @Test(priority = 4)
	   public void ktm()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.ktmindia.com/");
		  driver.close();
	   }
}
