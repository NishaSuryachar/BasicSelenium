package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		WebElement gender = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].value='successfull';",gender);
	}
}
//here we pass the value to the hidden element without clicking it
