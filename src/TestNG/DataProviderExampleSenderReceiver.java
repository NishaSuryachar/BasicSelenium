package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleSenderReceiver
{
	@DataProvider(name="register")
    public Object[][] sender()
    {
    	Object[][] obj=new Object[2][5];
    	obj[0][0]="Nisha";
    	obj[0][1]="M S";
    	obj[0][2]="Nisha1903@gmail.com";
    	obj[0][3]="Nisha12345";
    	obj[0][4]="Nisha12345";
    	obj[1][0]="Shruthi";
    	obj[1][1]="M S";
    	obj[1][2]="Shruthi1903@gmail.com";
    	obj[1][3]="Shruthi12345";
    	obj[1][4]="Shruthi12345";
    	return obj;
    	
    }
	@Test(dataProvider = "register")
	public void receiver(String fname,String lname,String email,String password,String confirmpassword)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fname);
		driver.findElement(By.id("LastName")).sendKeys(lname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
}
