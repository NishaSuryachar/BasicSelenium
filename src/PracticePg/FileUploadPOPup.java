package PracticePg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPOPup
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		 driver.get("https://demowebshop.tricentis.com/");
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
	    WebElement element = driver.findElement(By.id("poll-block-1"));
	    File from = element.getScreenshotAs(OutputType.FILE);
	   File to = new File("C:\\Users\\hp\\Desktop\\Selenium\\Screenshots\\"+time+".png");
	   FileHandler.copy(from, to);
	  
	}
}
