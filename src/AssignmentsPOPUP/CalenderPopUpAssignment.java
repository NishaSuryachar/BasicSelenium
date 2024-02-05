package AssignmentsPOPUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopUpAssignment {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.agoda.com/");
		WebElement no_thanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
		no_thanks.click();
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		driver.findElement(By.xpath("(//span[text()='25'])[1]")).click();
		try
		{
		    driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click();
		}
		catch(Exception e)
		{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-selenium='checkOutBox']"))).click();
            driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
            WebElement may_23 = driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']"));
           	for(int i=0;i<5;i++)
            {
           	    if(may_23.isDisplayed())
                {
           	    	driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click();
           	    	driver.close();
            	}
           	 driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
            }
        }
	}
}

            
//			WebElement next_month = 
//			next_month.click();
//			next_month.click();
//			next_month.click();
//			
//			WebElement may_23 = 
//		    WebElement arrow = 
//			arrow.click();
//			if(may_23.isDisplayed())
//			{
//				 driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click();
//			}
//			else
//			{
//				arrow.click();
//				
//			}
			
		