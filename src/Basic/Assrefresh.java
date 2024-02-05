package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assrefresh {

	public static void main(String[] args) throws InterruptedException
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//navigate to that particular web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//we are storing title name into container to perform actions in future
		String given_url=driver.getCurrentUrl();
		//go to that particular web page
		driver.get("https://www.redbus.in/");
		//here we are navigating back to the old page
		driver.navigate().back();
		//we are storing title name into container to perform actions in future
	    String current_url=driver.getCurrentUrl();
	    //after navigate we call sleep() to wait for 2 sec
		Thread.sleep(2000);
		//here we refresh the web page 
		driver.navigate().refresh();
		//after navigate we call sleep() to wait for 2 sec
		Thread.sleep(2000);
		//here we are performing action i.e we are checking that whether the page navigated back to the old web page,
				//               by comparing the url of the web page
		if(given_url.contains(current_url))
		{
			System.out.println("you are in demo web page");
		}
		else
		{
			System.out.println("you are in red bus page");
		}
		//here we close the browser window
		driver.close();
	}
}

