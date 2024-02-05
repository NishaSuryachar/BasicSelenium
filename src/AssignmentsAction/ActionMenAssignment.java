package AssignmentsAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMenAssignment {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		driver.findElement(By.xpath("//a[text()='Suits']")).click();
		WebElement suits = driver.findElement(By.xpath("//span[text()='Men Suits']"));
		if(suits.isDisplayed())
		{
			System.out.println("you are in suits page");
		}
		else
		{
			System.out.println("you are not in suits page");
		}
		driver.close();
	}
}
