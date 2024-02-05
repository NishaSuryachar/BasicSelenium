package AssignmentsAction;

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

public class NotNow {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(140));
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		Actions a= new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).click().build().perform();
		a.keyDown(Keys.PAGE_DOWN).click().build().perform();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		 a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		 Set<String> child = driver.getWindowHandles();
		 child.remove(parent);
		 for (String str : child) 
		 {
			 driver.switchTo().window(str);
	    }
		 Thread.sleep(2000);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Not now']")));
		 driver.findElement(By.xpath("//span[text()='Not now']")).click();
		 driver.quit();
	}

}
