package Listenners;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenners.StartListners.class)
public class LoginDWSListners
{
	@Test
	public void login() throws IOException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Nishams1902@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nisha1234");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Users\\hp\\Desktop\\Selenium\\Screenshots\\Nisha.png");
	FileHandler.copy(from, to);
	driver.close();
	}
}
	
