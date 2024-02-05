package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorASS1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String given_url="https://demowebshop.tricentis.com/";
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("You are in demo web shop page");
			driver.findElement(By.className("ico-register")).click();
			String given_registerTitle="Demo Web Shop. Register";
			String current_registerTitle=driver.getTitle();
			if(given_registerTitle.equals(current_registerTitle))
			{
				System.out.println("You are in register page");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[value='F']")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(" input[id='FirstName']")).sendKeys("Nisha");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("M S");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("nishams1213@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(" input[id='Password']")).sendKeys("Nisha12345");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("Nisha12345");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[value='Register']")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else
			{
				System.out.println("You are not in register page");
			}
		}
		else
		{
			System.out.println("You are not in demo web shop page");
		}
	}

}
