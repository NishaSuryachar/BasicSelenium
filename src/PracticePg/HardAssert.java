package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert 
{
	@Test
	  public void login()
	  {
		String given="https://demowebshop.tricentis.com/login";
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://demowebshop.tricentis.com/login");
	   String current = driver.getCurrentUrl();
	   SoftAssert softy=new SoftAssert();
	   //softy.assertNotEquals(given, current);
	   Assert.assertNotEquals(given, current);
	   driver.findElement(By.id("Email")).sendKeys("pallavi1901@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("Pallavi123@");
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   driver.close();  
	   softy.assertAll();
      }
}