package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	public static void main(String[] args)
	{
		//THe Url given by the comapany
		String s="https://www.qspiders1.com/";
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maaximize the browser window
		driver.manage().window().maximize();
		//go to particular web page
		driver.get("https://www.qspiders.com/");
		//geting the current url from the browser which is opened by get() method
		String s1=driver.getCurrentUrl();
		//here we compare the given and current url
		if(s.equals(s1))
		{
			System.out.println("URL same");
		}
		else
		{
			System.out.println("URL not same");
			driver.close();
		}
	}
}

	