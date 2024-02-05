package AssignmentsAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionStudioAssignment {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement studio = driver.findElement(By.xpath("//a[text()='Studio']"));
		Actions action=new Actions(driver);
		action.moveToElement(studio).perform();
		driver.findElement(By.xpath("//span[text()='EXPLORE STUDIO']")).click();
		WebElement influencers = driver.findElement(By.xpath("(//div[@aria-label='medai_page_click'])[1]"));
		if(influencers.isDisplayed())
		{
			System.out.println("you are in Guide to Influencers page");
		}
		else
		{
			System.out.println("you are not in Guide to Influencers page");
		}
		driver.close();
	}

}
