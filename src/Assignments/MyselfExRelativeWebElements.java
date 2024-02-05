package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyselfExRelativeWebElements {
    public static WebDriver driver;
    static String[] name= {"Nisha","M S","Nishams1903@gmail.com","Nisha12345","Nisha12345"};
   // static String[] pass= {};
	public static void chromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void closeBrowser()
	{
		driver.close();
	}
	public static void openDWS() throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in Demo web shop home page");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a [@class='ico-register']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='gender-female']")).click();
			Thread.sleep(1000);
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inputs']/input"));
			int i=0;
			for(WebElement web:elements)
			{
				web.sendKeys(name[i++]);
				Thread.sleep(1000);
			}
		}
		else
		{
			System.out.println("you are not in Demo web shop home page");
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		chromeBrowser();
		openDWS();
		closeBrowser();
	}

}
