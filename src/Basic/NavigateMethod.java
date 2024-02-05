package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args)
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		// navigate to that particular web page
		driver.navigate().to("https://www.ktmindia.com/");
		//storing the page title name into the container 
		String given_title_ktm=driver.getTitle();
		//go to that particular web page
		driver.get("https://www.bmw.in/");
		//here we are navigating back to the old page i.e ktm page
		driver.navigate().back();
		//storing the current page title name into the another container 
		String current_title_ktm=driver.getTitle();
		//here we are checking whether we are navigate to old page or not
		if(given_title_ktm.equals(current_title_ktm))
		{
			System.out.println("You are in Ktm page");
		}
		else
		{
			System.out.println("you are in bmw page");
			//here we navigate to next page or forward page i.e bmw page
			driver.navigate().forward();
		}
	}
}
