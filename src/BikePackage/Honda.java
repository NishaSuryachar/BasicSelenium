package BikePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Honda
{
	@Test
	public void honda()
	{
		String given_url="https://www.honda2wheelersindia.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.honda2wheelersindia.com/");
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		if(given_url.equals(current_url))
		{
			Reporter.log("you are in honda 2wheelers india page",true);
		}
		else
		{
			Reporter.log("you are not in honda 2wheelers india page",true);
		}
		driver.close();
	}

}
