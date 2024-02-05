package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethods
{
	
		@Test(priority = 0)
	   public void audi()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.audi.in/");
		  driver.close();
	   }
		//invocationCount it says how many times you want to execute particular method
		//threadPoolSize it says how many browser you want to execute particular method
	   @Test(priority = 1,invocationCount = 2,threadPoolSize = 2)
	   public void redbus()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.redbus.in/");
		  driver.close();
	   }
	   @Test(priority = 2)
	   public void royalEnfield()
	   {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.royalenfield.com/");
		  driver.close();
	   }
	   @Test(priority = 3)
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
