package AssignmentsAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickAssignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(right_click).build().perform();
		Thread.sleep(1000);
		a1.contextClick(right_click).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		try 
		{
			WebElement double_click = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
			double_click.isEnabled();
			System.out.println("script is unsuccessfull");
		} 
		catch (Exception e) 
		{
			System.out.println("script is successfull");
		}
		driver.close();
	}
}
