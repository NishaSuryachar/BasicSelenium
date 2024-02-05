package AssignmentsAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBeautyAssignment {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(beauty).perform();
		driver.findElement(By.xpath("//a[text()='Sunscreen']")).click();
		WebElement sunscreen = driver.findElement(By.xpath("//span[text()='Sunscreen']"));
		if(sunscreen.isDisplayed())
		{
			System.out.println("you are in sunscreen page");
		}
		else
		{
			System.out.println("you are not in sunscreen page");
		}
		driver.close();
	}

}
