package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		Actions a=new Actions(driver);
		for (WebElement web : products)
		{
			a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
