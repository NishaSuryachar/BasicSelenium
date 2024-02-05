package JavaScriptExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExcecutorScrollIntoViewArgument {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		List<WebElement> info = driver.findElements(By.xpath("//div[@class='column information']/ul/li"));
		je.executeScript("arguments[4].scrollIntoView(false);",info);

	}
}

