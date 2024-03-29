package PracticePg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RelativeXpathmock {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		//String given_text="Featured products";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(35));
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		driver.get("https://www.facebook.com/signup");
		WebElement element = driver.findElement(By.xpath("//div[@class='clearfix _58mh']"));
		File from = element.getScreenshotAs(OutputType.FILE);
		File too = new File("C:\\Users\\hp\\Desktop\\Selenium\\Screenshots\\"+time+".png");
		FileHandler.copy(from, too);
	}

}
