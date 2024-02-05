package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssiment {

	public static void main(String[] args) throws InterruptedException
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		// navigate to that particular web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//storing the page title name into the container 
		String given_title=driver.getTitle();
		//go to another web page
		driver.get("https://www.abhibus.com/");
		//here we are navigating back to the old page
		driver.navigate().back();
		//storing the page title name into the container 
		String current_title=driver.getTitle();
		//here we are checking whether we are navigate back to old page or not by comparing title name
		if(given_title.equals(current_title))
		{
			System.out.println("you are in demo web shop page");
		}
		else
		{
			System.out.println("you are in abhibhi bus page");
		}
		Thread.sleep(2000);
		//here we pass the value to the search text field
		driver.findElement(By.id("small-searchterms")).sendKeys("Ear phones");
		//refresh the web page
		driver.navigate().refresh();
		//navigate to the next page
		driver.navigate().forward();
		Thread.sleep(2000);
		//close the window
		driver.close();
	}
}
