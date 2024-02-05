package AssignmentPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteLoginPOM 
{
	@Test
    public void receive()
    {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPOM execute=new LoginPOM(driver);
        execute.Books();
        execute.Computers();
        execute.Electronics();
        execute.ApparelAndShoes();
        execute.DigitalDownloads();
        execute.Jewelry();
        execute.GiftCards();
        execute.Login();
        execute.Email("pallavi1901@gmail.com");
        execute.Password("Pallavi123@");
        execute.RemenberMe();
        execute.LoginButton();
    }
}
