package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Honda {

	public static void main(String[] args) 
	{
		String s="https://www.honda2wheelersindia.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		String s1=driver.getCurrentUrl();
		if(s.equals(s1))
		{
			System.out.print("URL is same");
	    }
		else
		{
			System.out.print("URL is not same");
			driver.close();
		}
	}

}
