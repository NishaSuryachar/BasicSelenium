package SelectAndDeselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectStaleException {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(sort_by);
		List<WebElement> options = s.getOptions();
		int i=0;
		for(WebElement web:options)
		{
			sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
			s=new Select(sort_by);
		     s.selectByIndex(i++);
		     Thread.sleep(2000);
		}
	}
}
