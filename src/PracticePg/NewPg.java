package PracticePg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPg {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
		WebElement id = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(id);
		driver.findElement(By.id("regEmail")).sendKeys("91234567780");
		//driver.switchTo().parentFrame();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("regUser"))).click();
		
		
//		
//		
//		
//		driver.findElement(By.xpath("//div[@data-selenium='checkOutText']")).click();
//		WebElement next = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
//		next.click();
//		next.click();
//		next.click();
//		next.click();
//		next.click();
//		next.click();
//		next.click();
//		next.click();
//		driver.findElement(By.xpath("//span[@data-selenium-date='2024-10-09']")).click();
//		
		
	}
}
