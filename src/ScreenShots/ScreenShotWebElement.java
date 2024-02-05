package ScreenShots;

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

public class ScreenShotWebElement {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":","-");
		driver.get("https://demowebshop.tricentis.com/");
		WebElement prod = driver.findElement(By.className("top-menu"));
		File from = prod.getScreenshotAs(OutputType.FILE);
		File to = new File("E:\\QSPIDERS NOTES\\SELENIUM NOTES\\SCREENSHOTS\\"+"shruthi"+time+".png");
		FileHandler.copy(from, to);
	}
}
//to take the screenshot of webElement we have a method called getScreenshotAs() 
//to take the screenshot of webElement no need to downcasting, inside web element only we have getScreenshotAs() method
//first we find web element which we are going to take screenshot then store it through that element only we called method
//3 type output type there but, here we take file type
//we taken the screen shot then we stored it in the from container
//to paste that screenshot we have to mention the path to where we have to paste it 
//along with that we have to mention file name with extension eg:shivappa.png
//to paste that screenshot we have a method called copy() inside FileHandler class
//inside that we have to mention from ,to 
//here we gave the file name dynamically
//to give name dynamically we use today time and date 
//LocalDateTime.now() which gives todays time and date
//it gives with ": character" so compiler got confused about path so we have to replace : with - 
//to make that we called replace() present in string class using LocalDateTime object
//then store that inside container
//in the path we have to concatnate that container with path using concatinate operator
