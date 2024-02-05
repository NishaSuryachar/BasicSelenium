package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorIdClassEx {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();                           //for only cssselector we can use shortcut for classname and id
		driver.get("https://demowebshop.tricentis.com/");               //classname represented by #
		String given_url="https://demowebshop.tricentis.com/";           //id represented by .
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("You are in demo web shop page");
			driver.findElement(By.className("ico-login")).click();
			String given_LoginTitle="Demo Web Shop. Login";
			String current_LoginTitle=driver.getTitle();
			if(given_LoginTitle.equals(current_LoginTitle))
			{
				System.out.println("you are in login page");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#Email")).sendKeys("nishams1213@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#Password")).sendKeys("Nisha12345");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#RememberMe")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(" .button-1.login-button")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else
			{
				System.out.println("you are not in login page");
			}
		}
		else
		{
			System.out.println("You are not in demo web shop page");
		}
	}
}
