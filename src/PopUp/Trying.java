package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trying {

	public static void main(String[] args) 
	{
		//open the browser
	     WebDriver driver=new ChromeDriver();
	     //maximize
	     driver.manage().window().maximize();
	     //implicit wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     //enter into web page
	     driver.get("https://demowebshop.tricentis.com/");
	     //getting window handle which is in hexadecimal address
	     String dws = driver.getWindowHandle();
	     //printing it
	     System.out.println(dws);
	     //creating object for action class
	     Actions a=new Actions(driver);
	     //moving the cursor to the book web element and click that book web element using keyboard actions to open in new window
	     a.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"))).keyDown(Keys.SHIFT).click().build().perform();
	     // getting window handle which is in hexadecimal address,set contains parent and child handles
	     Set<String> child = driver.getWindowHandles();
	     //printing it
	     System.out.println(child);
	     //remove parent from set
	     child.remove(dws);
	     //print the set to check whether set contains only child window
	     System.out.println(child);
	     //iterate set to switch to child window to close particularly child window
	     for (String str : child) 
	     {
	    	 driver.switchTo().window(str);
	   	}
	     //closing child window
	     driver.close();
	    }
}
//close()= we use to close parent window
//quit()=used to close all the active windows
//switchTo =used to switch from one window to another
//then to close child window using loop after remove parent handle

