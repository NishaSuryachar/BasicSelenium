package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAssignment {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://www.facebook.com/facebook/";
		String given_text="Create a new account";
		String[] name= {"Nisha","M S","9123456789","Nisha12345"};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/facebook/");
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in FaceBook page");
			Thread.sleep(4000);
		    driver.findElement(By.xpath("//span[text()='Create New Account']")).click();
			WebElement account = driver.findElement(By.xpath("//a[contains(text(),'Already have an account?')]"));
			String current_text=account.getText();
			if(given_text.equalsIgnoreCase(current_text))
			{
				
				System.out.println("you are in Create a new account page");
				List<WebElement> data = driver.findElements(By.xpath("//div[@id='reg_form_box']"));	
				int i=0;
				for(WebElement web:data)
				{
					web.sendKeys(name[i++]);
					Thread.sleep(1000);
				}
			}
			else
			{
				
			}
		}
		else
		{
			System.out.println("");
		}
	}

}
