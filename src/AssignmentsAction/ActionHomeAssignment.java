package AssignmentsAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionHomeAssignment {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement home = driver.findElement(By.xpath("(//a[contains(text(),'Home & Living')])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(home).perform();
		driver.findElement(By.xpath("//a[@href='/ceilinglamp']")).click();
	    WebElement ceilinglamp = driver.findElement(By.xpath("//span[text()='Ceilinglamp']"));
	    if(ceilinglamp.isDisplayed())
	    {
	    	System.out.println("you are in ceilinglamp page");
	    }
	    else
	    {
	    	System.out.println("you are in not ceilinglamp page");
	    }
	    driver.close();

	}

}
