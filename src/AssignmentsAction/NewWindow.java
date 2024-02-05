package AssignmentsAction;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.kalkifashion.com/in/");
		List<WebElement> products = driver.findElements(By.xpath("(//div[@id='desktop-nav'])[1]/div"));
		Actions a=new Actions(driver);
        for (WebElement web : products) 
        {
			a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
			Thread.sleep(1000);
		}
        driver.quit();
	}

}
