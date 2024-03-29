package PracticePg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPop {

	public static void main(String[] args)
	{
//		ChromeOptions c_opt=new ChromeOptions();
//		c_opt.addArguments("--disable-notifications");
//		WebDriver driver=new ChromeDriver(c_opt);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		

	}

}
