package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceMethod {

	public static void main(String[] args)
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go to that particular web page
		driver.get("https://www.woodlandworldwide.com/");
		//here we are printing the source code of the web page
		System.out.println(driver.getPageSource());
	}
}
