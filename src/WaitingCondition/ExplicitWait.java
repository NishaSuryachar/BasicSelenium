package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("loginBtn")));
		login.click();
		
		WebElement create_account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		create_account.click();
		
		driver.close();
		
	}

}
//it is applicable for particular step
//WebDriverWait is a class we created a object for that class then we used methods present in that class 
//visibilityOfElementLocated():To verify that whether the element is visible or not,if not visible have to waited until the duration we have given 
//if the web element finds or visible within certain sec ,it will not wait for remaining sec ,it will perform click action
//elementToBeClickable():To verify that whether the element is clickable or not,if not clickable have to waited until the duration we have given 
////if it finds the web element is clickable, within certain sec ,it will not wait for remaining sec ,it will perform click action