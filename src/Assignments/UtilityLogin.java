package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityLogin {

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
			driver.findElement(By.className("ico-login")).click();
			WebElement login = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(login.isDisplayed())
			{
				System.out.println("you are in Welcome Please Sign In page");
				driver.findElement(By.id("Email")).sendKeys("Nishams1212@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.id("Password")).sendKeys("Nisha12345");
				Thread.sleep(1000);
				driver.findElement(By.id("RememberMe")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
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
