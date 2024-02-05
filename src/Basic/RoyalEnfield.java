package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class RoyalEnfield {

	public static void main(String[] args)
	{
		String s="https://www.royalenfield.com/in/en/motorcycles/bullet-350/campaign/?utm_source=google&utm_medium=cpc&utm_campaign=bullet_in_mc_brand_sep23&utm_term=new%20royal%20enfield%20bullet%20images&utm_content=broad&gad_source=1&gclid=Cj0KCQiAyKurBhD5ARIsALamXaGTqjAEO2hKl_bxChXk6m8ezsZBBJIZeldBUkkWvEMWdAZbhxufBNUaAnFJEALw_wcB";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/motorcycles/bullet-350/campaign/?utm_source=google&utm_medium=cpc&utm_campaign=bullet_in_mc_brand_sep23&utm_term=new%20royal%20enfield%20bullet%20images&utm_content=broad&gad_source=1&gclid=Cj0KCQiAyKurBhD5ARIsALamXaGTqjAEO2hKl_bxChXk6m8ezsZBBJIZeldBUkkWvEMWdAZbhxufBNUaAnFJEALw_wcB");
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
