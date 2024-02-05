package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args)
	{
		String given_url="https://omayo.blogspot.com/";
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Dropdown']")));
		dropdown.click();
		
		WebElement facebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://facebook.com']")));
		facebook.click();
		driver.navigate().back();
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in omayo blogspot page");
		}
		else
		{
			System.out.println("you are not in omayo blogspot page");
		}
		driver.close();
	}

}
