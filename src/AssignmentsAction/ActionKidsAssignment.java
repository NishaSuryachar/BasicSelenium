package AssignmentsAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKidsAssignment {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
        WebElement kids = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
        Actions action=new Actions(driver);
        action.moveToElement(kids).perform();
        driver.findElement(By.xpath("(//a[text()='Jeans'])[3]")).click();
        WebElement Kidswear = driver.findElement(By.xpath("//span[text()='Kids Wear Online Store']"));
        if(Kidswear.isDisplayed())
        {
        	System.out.println("you are in Kids Wear Online Store page");
        }
        else
        {
        	System.out.println("you are not in Kids Wear Online Store page");
        }
        driver.close();
	}
}
