package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    WebElement double_click = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	    Actions a=new Actions(driver);
	    a.doubleClick(double_click).build().perform();
	 	 try
	    {
	    	double_click.isEnabled();
	    	System.out.println("script is unsuccessfull");
	    }
       catch(Exception e)
        {
	    	System.out.println("script is successfull");
        }
	    driver.close();
	 }
}
