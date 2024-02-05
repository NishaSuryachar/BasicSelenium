package Iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		LocalDateTime time = LocalDateTime.now();
        String date = time.toString().replace(":", "-");
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement logo = driver.findElement(By.className("header"));
        File from = logo.getScreenshotAs(OutputType.FILE);
        File to = new File("E:\\QSPIDERS NOTES\\SELENIUM NOTES\\SCREENSHOTS\\"+date+".png");
        FileHandler.copy(from, to);
        
	}

}
