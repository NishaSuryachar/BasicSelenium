package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAssignment3 {

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
			driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[1]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[2]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[3]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[4]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[5]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[6]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[2]/ul/li[7]/a")).click();
		}
		else
		{
			System.out.println("you are not in demo web shop page");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
