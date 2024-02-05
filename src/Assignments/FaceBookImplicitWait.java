package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookImplicitWait {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nisha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M S");
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		if(signup.isDisplayed())
		{
			System.out.println("you are in facebook page");
		}
		else
		{
			System.out.println("you are not in facebook page");
		}
		driver.close();
	}

}
