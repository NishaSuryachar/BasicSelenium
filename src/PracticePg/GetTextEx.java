package PracticePg;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextEx {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		WebElement order_by = driver.findElement(By.name("products-orderby"));
        Select s=new Select(order_by);
        List<WebElement> options = s.getOptions();
        int i=0;
        for (WebElement web : options)
        {
        	order_by = driver.findElement(By.name("products-orderby"));
        	s=new Select(order_by);
			s.selectByIndex(i++);
			Thread.sleep(1000);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(35));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
		}
	}

}
