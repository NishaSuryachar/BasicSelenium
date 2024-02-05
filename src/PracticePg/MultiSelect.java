package PracticePg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/hp/Downloads/demo-1%20(1).html");
		WebElement multi = driver.findElement(By.id("multiple_cars"));
	    Select s=new Select(multi);
	    List<WebElement> all = s.getOptions();
	    for (WebElement w : all)
	    {
			w.click();
			 Thread.sleep(1000);
		}
	    Thread.sleep(1000);
	    s.deselectAll();
	    
	    
	    
//        Thread.sleep(1000);
//        s.selectByIndex(1);
//        Thread.sleep(1000);
//        s.selectByValue("jgr");
//        Thread.sleep(1000);
//        s.selectByVisibleText("Land Rover");
//        Thread.sleep(1000);
//        s.deselectAll();
        
//        s.deselectByIndex(1);
//        Thread.sleep(1000);
//        s.deselectByValue("jgr");
//        Thread.sleep(1000);
//        s.deselectByVisibleText("Land Rover");
	}

}
