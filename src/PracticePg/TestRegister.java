package PracticePg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRegister
{
	@Test
    public void receiver()
    {
    	WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/register");
        Register regi=new Register(driver);
        driver.findElement(By.id("gender-female")).click();
        regi.FirstName("Nisha");
        driver.findElement(By.id("LastName")).sendKeys("M S");
        driver.findElement(By.id("Email")).sendKeys("Nishu91094@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Nishu123@!");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Nishu123@!");
        driver.findElement(By.id("register-button")).click();
    }
}
