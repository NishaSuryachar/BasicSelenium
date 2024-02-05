package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisablePopUp {

	public static void main(String[] args)
	{
		ChromeOptions coptions=new ChromeOptions();
		coptions.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(coptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		//driver.close();
	}
}
//here either we can handle popup or disable/ignore it.
//for that first we have to create a object for ChromeOptions class only
////use that object then call addArguments("--disable-notifications") method inside that 
//  we have write "--disable-notifications" 
//then pass that coptions object to chromeDriver constructor.