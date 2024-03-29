package PracticePg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionExample {

	public static void main(String[] args) 
	{
		String given_title="nopCommerce (@nopCommerce) / X";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String dws = driver.getWindowHandle();
		WebElement google = driver.findElement(By.xpath("//a[text()='Google+']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",google);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		Actions a=new Actions(driver);
		WebElement twitter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		
		WebElement google_plus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Google+']")));
	    a.moveToElement(google_plus).keyDown(Keys.SHIFT).click().build().perform();
		Set<String> child = driver.getWindowHandles();
		for (String str : child)
		{
			driver.switchTo().window(str);
			String current_title = driver.getTitle();
			if(given_title.equalsIgnoreCase(current_title))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Not now']"))).click();
			    driver.close();
			}
		driver.quit();
		}
	}	
}	