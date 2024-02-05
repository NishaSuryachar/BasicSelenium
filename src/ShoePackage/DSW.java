package ShoePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DSW {
	@Test(groups="smoke")
	public void dsw()
	{
		String given_url="https://www.dsw.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dsw.com/");
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		if(given_url.equals(current_url))
		{
			Reporter.log("you are in DSW page",true);
		}
		else
		{
			Reporter.log("you are not in DSW page",true);
		}
		driver.close();

	}

}
