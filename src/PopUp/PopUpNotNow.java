package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpNotNow {

	public static void main(String[] args) 
	{
		String given_twitterTitle="nopCommerce (@nopCommerce) / X";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		Actions a= new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).click().build().perform();
		a.keyDown(Keys.PAGE_DOWN).click().build().perform();
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
			String current_title=driver.getTitle();
			if(given_twitterTitle.contains(current_title))
			{
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Not now']")));
				driver.findElement(By.xpath("//span[text()='Not now']")).click();
				System.out.println("Script is successfull");
				driver.quit();
			}
			
		}
        
	}

}
