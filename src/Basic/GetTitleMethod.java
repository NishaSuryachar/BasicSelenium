package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args)
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go to that particular web page
		driver.get("https://demowebshop.tricentis.com/");
		//storing the page title name into the container which is given 
		String title_name="Demo Web Shop";
		//to get the title name of the web page
		System.out.println(driver.getTitle());
	}
}

//Ctrl+shift+i = to get the web page
//ctrl+f = to open search box