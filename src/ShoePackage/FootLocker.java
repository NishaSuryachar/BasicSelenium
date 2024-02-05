package ShoePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FootLocker 
{
	@Test
	public void footLocker()
	{
		String given_url="https://www.footlocker.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.footlocker.com/");
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		if(given_url.equals(current_url))
		{
			Reporter.log("you are in FootLocker page",true);
		}
		else
		{
			Reporter.log("you are not in FootLocker page",true);
		}
		driver.close();
	}
}
