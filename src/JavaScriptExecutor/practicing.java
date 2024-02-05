package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicing {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://skillrary.com/");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-1000);");
//		je.executeScript("window.scrollTo(0,1000);");
//      Thread.sleep(2000);
//		je.executeScript("window.scrollTo(0,-1000);");
	}
}
//some webpage have developed using javascript in that we can't use Webdriver method it won't work
//that that we go for a JavascriptExecutor 
//downcast our driver to JavascriptExecutor 
//which have a method called executeScript("window.scrollBy(0,1000);");
//we can scroll page to up and down
//to move down we have to mention x ,y axis
//inside method we have to write syntax like "je.executeScript("window.scrollBy(0,-1000);");"
//starting from 0 and move upto 1000 for scroll down
//starting from 0 and move upto -1000 for scroll up

// difference b/w scrollBy and scrollTo
//we have two method scrollBy and ScrollTo
//scrollBy will come down and not go to same place it will slightly go up
//scrollTo will come down and go to same place from where it scroll down