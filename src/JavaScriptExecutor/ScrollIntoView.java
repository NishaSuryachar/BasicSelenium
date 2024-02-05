package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		WebElement account = driver.findElement(By.xpath("//h3[text()='My account']"));
		je.executeScript("arguments[0].scrollIntoView(true);",account );
	}
}
//here we use a method called scrollIntoView(true) for scroll upto that webelement
//first we need to downcast driver to JavascriptExecutor
//call method " executeScript("arguments[0].scrollIntoView(true);",account ); "
//inside we should write "arguments[0].scrollIntoView(true);"
//then mention the web element upto where i have to scroll