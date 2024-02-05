package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialText {

	public static void main(String[] args) throws InterruptedException 
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go to web page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//here we are clicking the shopping cart web element by giving a partial linked text
		driver.findElement(By.partialLinkText("Shopping ")).click();
		//close the window
		driver.close();
	}
}
