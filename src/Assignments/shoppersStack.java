package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppersStack {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://www.shoppersstack.com/";
		String given_title="ShoppersStack | Login";
		String given_signup_Title="ShoppersStack | Shopper | Signup";
		String[] names= {"Nisha","M S","1234567890","Nishams1901@gmail.com","Nisha12345@","Nisha12345@"};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(12000);
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in shoppersstack home page");
			WebElement login = driver.findElement(By.xpath("//button[@id='loginBtn']"));
			if(login.isEnabled())
			{
				System.out.println("login click is successful");
				login.click();
				String current_title = driver.getTitle();
				if(given_title.equals(current_title))
				{
					System.out.println("you are in login page");
					WebElement signup = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained'])[2]"));
					if(signup.isDisplayed())
					{
						if(signup.isEnabled())
						{
							System.out.println("signup click is successful");
							Thread.sleep(2000);
							signup.click();
							String current_signup_Title=driver.getTitle();
							if(given_signup_Title.equals(current_signup_Title))
							{
								System.out.println("you are in signup page");
								driver.findElement(By.xpath("//input[@id='Female']")).click();
								List<WebElement> signingup = driver.findElements(By.xpath("//form[@class='signup_signupForm__BDlN5']/div/div/div/input"));
								int i=0;
								for(WebElement web:signingup)
								{
									web.sendKeys(names[i++]);
									Thread.sleep(1000);
								}
								WebElement checkBox = driver.findElement(By.xpath("//input[@id='Terms and Conditions']"));
								checkBox.click();
								if(checkBox.isSelected())
								{
									System.out.println("checkBox is selected");
								    WebElement register = driver.findElement(By.xpath("//button[@id='btnDisabled']"));
								    if(register.isEnabled())
								    {
								    	register.click();
								    	Thread.sleep(2000);
								        System.out.println("Register button is clicked successsfully");
								    }
								    else
								    {
								    	System.out.println("Register button is not clicked");
								    }
								}
								else
								{
									System.out.println("checkBox is not selected");
								}
							}
							else
							{
								System.out.println("you are not in signup page");
							}
						}
						else
						{
							System.out.println("signup click is unsuccessful");
						}
					}
					else
					{
						System.out.println("you are not in login page and not clicking on signup button");
					}
				}
				else
				{
					System.out.println("you are not in login page");
				}
				
			}
			else
			{
				System.out.println("login click is unsuccessful");
			}
		}
		else
		{
			System.out.println("you are not in shoppersstack home page");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
