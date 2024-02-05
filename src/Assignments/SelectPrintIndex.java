package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPrintIndex {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		WebElement item = driver.findElement(By.xpath("//option[contains(text(),'Price: Low to High')]"));
		if(item.isDisplayed())
		{
			System.out.println("Price: Low to High is displayed");
			Select s=new Select(sort_by);
			List<WebElement> option = s.getOptions();
			Thread.sleep(1000);
			System.out.println(option.indexOf(item));
		 }
		else
		{
			System.out.println("Price: Low to High is not displayed");
		}
		driver.close();
	}
 }
