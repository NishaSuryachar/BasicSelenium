package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		// navigate to that particular web page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//pass data into search field using cssselector locator
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("earphones");
		Thread.sleep(2000);
		//here we are click search button using css selector locator
		driver.findElement(By.cssSelector("input[ value='Search']")).click();
     }
}

//cssselector locator=when we don't have a direct locator we go for a cssselector
//advantages of cssselector is we can use direct locators as well as indirect locator like type,value
//syntax:tagname[AN='AV']; ex: input[type='text'];