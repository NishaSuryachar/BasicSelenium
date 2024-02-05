package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathContainMethod {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in Demo web Shop home page");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Books')][1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Computers')][1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Electronics')][1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')][1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Jewelry')][1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')][1]")).click();
		}
		else
		{
			System.out.println("you are not in Demo web Shop home page");
		}
		driver.close();
		
	}

}
