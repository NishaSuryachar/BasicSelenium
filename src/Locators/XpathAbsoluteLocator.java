package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAbsoluteLocator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/form/input[1]")).sendKeys("mobiles");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/form/input[2]")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
