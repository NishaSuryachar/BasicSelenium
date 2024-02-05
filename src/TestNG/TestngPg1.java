package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngPg1 {

	   @Test
	   public void dws()
	   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/tricentis");
		Reporter.log("hello  iam dws",true);
		driver.close();
	   }
	   @Test
	   public void cat()
	   {
		   System.out.println("hello iam cat");
		   Reporter.log("mioo mioo",true);
	   }
	   @Test
	   public void nisha()
	   {
		   Reporter.log("iaam Nisha",true);
		   System.out.println("good");
	   }
        
	}


