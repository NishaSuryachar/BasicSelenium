package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookWithUtilityAssignment
{
	static String given_url="https://www.facebook.com/";
	static WebDriver driver;
	public static void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void closeBrowser()
	{
		driver.close();
	}
	public static void FaceBook() throws InterruptedException
	{
		String userdata="Nishams123@gmail.com";
		driver.get("https://www.facebook.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in FaceBook page");
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			Thread.sleep(2000);
			WebElement signup = driver.findElement(By.xpath("//div[@class='_1lch']"));
			if(signup.isDisplayed())
			{
				System.out.println("you are in signup page");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nisha");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M S");
				if(Character.isDigit(userdata.charAt(0)))
				{
					System.out.println("you are signingup with mobile Number");
					mobileNumber(userdata);
				}
				else
				{
					System.out.println("you are signingup with Email id");
					emailId(userdata);
				}
			}
			else
			{
				System.out.println("you are not in signup page");
			}
		}
		else
		{
			System.out.println("you are not in FaceBook page");
		}
	}
    public static void mobileNumber(String userdata) throws InterruptedException
    {
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(userdata);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Nisha12345");
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		Thread.sleep(1000);
		s1.selectByValue("9");
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		Thread.sleep(1000);
		s2.selectByValue("10");
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		Thread.sleep(1000);
		s3.selectByValue("1994");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_1lch']")).click();
	}
	public static void emailId(String userdata) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(userdata);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(userdata);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Nisha12345");
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		Thread.sleep(1000);
		s1.selectByValue("9");
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		Thread.sleep(1000);
		s2.selectByValue("10");
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		Thread.sleep(1000);
		s3.selectByValue("1994");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_1lch']")).click();
    }
	public static void main(String[] args) throws InterruptedException
	{
		openBrowser();
		FaceBook();
		closeBrowser();
	}
}
