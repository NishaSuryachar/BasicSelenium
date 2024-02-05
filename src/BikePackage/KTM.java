package BikePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KTM 
{
	@Test
	public void kTM()
	{
		String given_url="https://www.ktm.com/en-in.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ktm.com/en-in.html");
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		if(given_url.equals(current_url))
		{
			Reporter.log("you are in ktm page",true);
		}
		else
		{
			Reporter.log("you are not in ktm page",true);
		}
		driver.close();

	}
}
