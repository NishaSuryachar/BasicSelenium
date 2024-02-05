package BikePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfield 
{
	@Test
	public void royalEnfield()
	{
		String given_url="https://www.royalenfield.com/in/en/home/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/in/en/home/");
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		if(given_url.equals(current_url))
		{
			Reporter.log("you are in royalenfield page",true);
		}
		else
		{
			Reporter.log("you are not in royalenfield page",true);
		}
		driver.close();
	}
}
