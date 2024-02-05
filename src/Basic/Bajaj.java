package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bajaj {

	public static void main(String[] args) 
	{
		String s="https://www.bajajauto.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
        String s1=driver.getCurrentUrl();
        if(s.equals(s1))
        {
        	System.out.print("URL is same");
			driver.close();
		}
		else
		{
			System.out.print("URL is not same");
			driver.close();
		}
       
	}

}
