package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitWebDriver {

	public static void main(String[] args) throws InterruptedException
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go to web page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//here we are clicking youtube element in the demo web shop web page
		driver.findElement(By.linkText("YouTube")).click();
		Thread.sleep(2000);
		//quitting all windows
		driver.quit();
     }
}
//close()=it closes the parent window
//quit()=it will close all the windows in the browser