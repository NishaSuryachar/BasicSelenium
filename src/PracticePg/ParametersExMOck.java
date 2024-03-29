package PracticePg;

import java.lang.annotation.Repeatable;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExMOck
{
	@Parameters("URL")
	@Test
	public void login(String url)
	{
	WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get(url);
	   driver.findElement(By.id("Email")).sendKeys("pallavi1901@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("Pallavi123@");
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   driver.close(); 
	}
	
}
