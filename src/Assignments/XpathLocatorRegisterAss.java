package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorRegisterAss {

	public static void main(String[] args) throws InterruptedException
    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		WebElement register = driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div/h1"));
		if(register.isDisplayed())
		{
			System.out.println("you are in register page");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div[2]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Nisha");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("M S");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("Nishams1902@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("Nisha12345");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("Nisha12345");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
		}
		else
		{
			System.out.println("you are not in register page");
		}
		Thread.sleep(1000);
		driver.close();
	}
}
