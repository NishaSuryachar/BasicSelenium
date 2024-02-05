package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathButtonAss {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div[1]/a"));
		if(element.isDisplayed())
		{
			System.out.println("you are in demo web shop page");
			driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[3]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[4]/a/span[1]")).click();
		}
		else
		{
			System.out.println("you are not in demo web shop page");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
