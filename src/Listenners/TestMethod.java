package Listenners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenners.StartListners.class)
public class TestMethod
{
	@Test
	public void login()
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://demowebshop.tricentis.com/login");
	   driver.findElement(By.id("Email")).sendKeys("pallavi1901@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("Pallavi123@");
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   //intentionally failing to see ontestfailure
	   Assert.fail();
	   driver.close();  
	}
}
