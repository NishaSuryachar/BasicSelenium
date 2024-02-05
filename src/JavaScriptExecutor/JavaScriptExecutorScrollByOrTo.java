package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScrollByOrTo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://skillrary.com/");
		JavascriptExecutor je=(JavascriptExecutor) driver;
//		je.executeScript("window.scrollTo(0,1000);");
//		Thread.sleep(2000);
//		je.executeScript("window.scrollTo(0,-1000);");
		je.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-1000);");
	}
}
