package PracticePg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWebpage 
{
   public static void main(String[] args) throws IOException, InterruptedException
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   LocalDateTime date = LocalDateTime.now();
	   String time = date.toString().replace(":", "-");
	   System.out.println(time);
	   driver.get("https://demowebshop.tricentis.com/login");
	   driver.findElement(By.id("Email")).sendKeys("pallavi1901@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("Pallavi123");
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File from = ts.getScreenshotAs(OutputType.FILE);
	   File to = new File("C:\\Users\\hp\\Desktop\\Selenium\\Screenshots\\"+"shivappa"+time+".png");
	   FileHandler.copy(from, to);
	   driver.findElement(By.xpath("//input[@value='Register']")).click();
	  //Thread.sleep(1000);
	   driver.findElement(By.name("register-button")).click();
	   //Thread.sleep(2000);
	   File fromm = ts.getScreenshotAs(OutputType.FILE);
	  File too = new File("C:\\Users\\hp\\Desktop\\Selenium\\Screenshots\\"+"parvatiamma"+time+".png");
	  FileHandler.copy(fromm, too);
   }
}
