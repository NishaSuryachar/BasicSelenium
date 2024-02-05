package PracticePg;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New {

	public static void main(String[] args) throws InterruptedException 
	{
		String given="nopCommerce (@nopCommerce) / X";
		String given_url="https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		WebElement google = driver.findElement(By.xpath("//a[text()='Google+']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Google+']")));
		a.moveToElement(google).keyDown(Keys.SHIFT).click().build().perform();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String str : child) 
		{
			driver.switchTo().window(str);
			String current = driver.getTitle();
			if(given.contains(current))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Not now']")));
				driver.findElement(By.xpath("//span[text()='Not now']")).click();
				driver.close();
				Thread.sleep(3000);
				driver.quit();
			}
			String current_url = driver.getCurrentUrl();
			System.out.println(current_url);
			if(given_url.contains(current_url))
			{
				driver.close();
			}
			
		}
		
	}

}
