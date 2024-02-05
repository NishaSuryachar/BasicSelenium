package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseAssignment {
public static void main(String[] args) throws InterruptedException
{
		String given_url="https://shoppersstack.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.navigate().to("https://shoppersstack.com/");
		String current_url = driver.getCurrentUrl();
		if(given_url.contains(current_url))
		{
			Thread.sleep(2000);
		    System.out.println("you are in Shoppersstack page");
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='loginBtn']")));
	     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='loginBtn']"))).click();
	    	WebElement shopperLogin = driver.findElement(By.xpath("//button[text()='Shopper Login']"));
	    	if(shopperLogin.isDisplayed())
	    	{
	    		System.out.println("you are in shopper login page");
		        driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	        	WebElement signin = driver.findElement(By.id("signIn"));
	        	Actions a=new Actions(driver);
	        	a.moveToElement(signin).build().perform();
	        	Thread.sleep(2000);
        		signin.click();
	        	Thread.sleep(1000);
		        driver.navigate().back();
		        WebElement firstname = wait.until(ExpectedConditions.elementToBeClickable(By.id("First Name")));
		        if(firstname.isEnabled()){
		        	System.out.println("first name textfield is enabled you can enter characters");
		        }
	        	else {
			        System.out.println("first name is not enabled you can enter characters");
		        }
	        }
	    	else {
	    		System.out.println("you are not in shopper login page");
	    	}
		}
		else
		{
			System.out.println("you are not in Shoppersstack page");
		}
	}
}