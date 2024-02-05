package AssignmentPOM;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ExecuteDWSHomePage 
{
	@Test
	public void receiver()
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
        DWSHomePage execute=new DWSHomePage(driver);
        execute.Logo();
        execute.Register();
        execute.Login();
        execute.ShoppingCart();
        execute.WishList();
        execute.SearchField("cap");
        execute.SearchButton();
        execute.Books();
        execute.Computers();
        execute.Electronics();
        execute.ApparelAndShoes();
        execute.DigitalDownloads();
        execute.Jewelry();
        execute.GiftCards();
        execute.Logo();
        execute.NewsLetter("nishams1902@gmail.com");
        execute.Subscribe();
        execute.Excellent();
        execute.Vote();
     }
}
