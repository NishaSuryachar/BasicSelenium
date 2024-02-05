package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day26 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		WebElement faceBook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
        faceBook.click();
       WebElement account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
       if(account.isDisplayed())
       {
    	   System.out.println("you are in facebook login page");
       }
       else
       {
    	   System.out.println("you are not in facebook login page");
       }
       driver.close();
	}

}
