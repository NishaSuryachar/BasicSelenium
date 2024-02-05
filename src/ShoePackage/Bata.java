package ShoePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bata
{
	@Test
	public void bata()
	{
		String given_url="https://www.bata.com/in/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bata.com/");
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		if(given_url.equals(current_url))
		{
			Reporter.log("you are in bata page",true);
		}
		else
		{
			Reporter.log("you are not in bata page",true);
		}
		driver.close();

	}

}

//Batch Execution:
//in the batch execution we have create testcase in different classes but in the same package
//after that we have to select every file and right click and click on testng and then click on covert to testng
//then we got xml file with inclusde all class names
//we have to run xml file
//it will execute one after the other without we manually run everything
//this is batch execution