package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainMethodVerify {

	public static void main(String[] args) 
	{
		//to open the browser
		ChromeDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go navigate to that particular web page
		driver.navigate().to("https://www.woodlandworldwide.com/");
		//here we are printing the title of web page
		System.out.println(driver.getTitle());
		//we are storing title name into container to perform actions in future
		String given_title=driver.getTitle();
		//go to that particular web page
		driver.get("https://trends.ajio.com/");
		//here we are navigating back to the old page i.e woodland page
		driver.navigate().back();
		//here we are storing title name into container to perform actions in future
		String current_title=driver.getTitle();
		//here we are performing action i.e we are checking that whether the page navigated back to the old web page,
		//               by comparing the title name of the web page
		if(given_title.contains(current_title))//here we are using contains rather than equals
		{
			System.out.println("you are in woodland page");
		}
		else
		{
			System.out.println("you are in trends ajio page");
			driver.navigate().forward();
		}
	}
}
