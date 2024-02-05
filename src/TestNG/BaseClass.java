package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	WebDriver driver;
@BeforeClass
public void openBrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
@BeforeMethod
public void login()
{
	System.out.println("login successfully");
}
@AfterMethod
public void logout()
{
	System.out.println("logout successfully");
}
@AfterClass
public void closeBrowser()
{
	driver.close();
}
}
