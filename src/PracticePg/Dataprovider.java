package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider
{
	@DataProvider(name="signup")
    public Object[][] sender()
    {
    	Object[][] obj=new Object[1][5];
    	obj[0][0]="Nisha";
    	obj[0][1]="suryachar";
    	obj[0][2]="shruthi123@gmail.com";
    	obj[0][3]="shruthi123@gmail.com";
    	obj[0][4]="Nisha123@!$";
        return obj;
    }
	@Test(dataProvider ="signup")
    public void receiver(String name,String surname,String email,String re_email,String password)
    {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(surname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(re_email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByVisibleText("9");
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1994");
//		WebElement msg = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
//		Select s4=new Select(msg);
//		s4.selectByValue("6");
		WebElement custom = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value ='god';",custom);
		
		
    	
    }
}
