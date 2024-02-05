package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityDigitalDownload {

	public static WebDriver driver;
	public static void ChromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void FirefoxBrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void EdgeBrowser()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void closeBrowser()
	{
		driver.close();
	}
	public static void openDWS() throws InterruptedException
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement picture = driver.findElement(By.cssSelector("div[class='picture']"));
		if(picture.isDisplayed())
		{
			System.out.println("You are in fiction page");
			driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
			WebElement digital = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(digital.isDisplayed())
			{
				System.out.println("you are in digital downloads page");
				List<WebElement> Add_to_cart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for(WebElement web:Add_to_cart)
				{
					web.click();
					Thread.sleep(1000);
				}
			}
			else
			{
				System.out.println("you are not in digital downloads page");
			}
		}
		else
		{
			System.out.println("You are not in fiction page");
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeBrowser();
		openDWS();
		closeBrowser();

	}

}
