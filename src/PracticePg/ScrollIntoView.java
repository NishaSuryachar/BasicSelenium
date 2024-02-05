package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement recent = driver.findElement(By.xpath("//a[text()='Recently viewed products']"));
		js.executeScript("arguments[0].scrollIntoView(false);",recent);
	}

}
