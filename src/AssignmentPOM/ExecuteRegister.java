package AssignmentPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteRegister 
{
	@Test
     public void receiver()
     {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/register");
        RegisterPOM execute=new RegisterPOM(driver);
        execute.Books();
        execute.Computers();
        execute.Electronics();
        execute.ApparelAndShoes();
        execute.DigitalDownloads();
        execute.Jewelry();
        execute.GiftCards();
        execute.Register();
        execute.Female();
        execute.FirstName("Pallavi");
        execute.LastName("N");
        execute.Email("pallavi1901@gmail.com");
        execute.Password("Pallavi123@");
        execute.ConfirmationPassword("Pallavi123@");
        execute.RegisterButton();
     }
}
