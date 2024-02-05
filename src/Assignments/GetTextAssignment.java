package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> icons = driver.findElements(By.xpath("//div[@class='header-links'] /ul/li/a"));
		for(WebElement web:icons)
		{
		   System.out.println(web.getText());
		   Thread.sleep(1000);
		}
		driver.close();
	}
}
