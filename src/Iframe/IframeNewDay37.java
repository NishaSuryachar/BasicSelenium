package Iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class IframeNewDay37 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(':','-');
        TakesScreenshot ts= (TakesScreenshot) driver;
        File from = ts.getScreenshotAs(OutputType.FILE);
        File to = new File("E:\\screenshots\\"+time+".png");
        FileHandler.copy(from, to);
	}

}
