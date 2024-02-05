package AssignmentsPOPUP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(right_click).build().perform();
		a.contextClick(right_click).build().perform();
		List<WebElement> options= driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		options.remove(5);
		for (WebElement web : options)
	    {
	       a.contextClick(right_click).build().perform();
	       web.click();
		   Thread.sleep(1000);
		   Alert al = driver.switchTo().alert();
		   al.accept();
	    }
		driver.close();
	}
}
