package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://www.facebook.com/";
		String user_data="9986653247";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
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
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nisha");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("M S");
				Thread.sleep(1000);
				if(Character.isDigit(user_data.charAt(0)))
				{
					System.out.println("you are using Mobile Number for signup");
					driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(user_data);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Nisha123445");
					WebElement day = driver.findElement(By.id("day"));
					Select s1=new Select(day);
					Thread.sleep(1000);
					s1.selectByIndex(9);
					WebElement month = driver.findElement(By.id("month"));
					Select s2=new Select(month);
					Thread.sleep(1000);
					s2.selectByVisibleText("Oct");
					WebElement year = driver.findElement(By.id("year"));
					Select s3=new Select(year);
					Thread.sleep(1000);
					s3.selectByValue("1994");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@class='_1lch']")).click();
				}
				else
				{
					System.out.println("you are using Email id for signup");
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Nishams1234@gmail.com");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Nishams1234@gmail.com");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Nisha123445");
					WebElement day = driver.findElement(By.id("day"));
					Select s1=new Select(day);
					Thread.sleep(1000);
					s1.selectByIndex(9);
					WebElement month = driver.findElement(By.id("month"));
					Select s2=new Select(month);
					Thread.sleep(1000);
					s2.selectByVisibleText("Oct");
					WebElement year = driver.findElement(By.id("year"));
					Select s3=new Select(year);
					Thread.sleep(1000);
					s3.selectByValue("1994");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@class='_1lch']")).click();
				}
				
			}
			else
			{
				System.out.println("you are in not signup page");
			}
		}
		else
		{
			System.out.println("you are not in FaceBook page");
		}
		driver.close();		
	}

}
