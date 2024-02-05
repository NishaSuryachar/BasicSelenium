package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class KTM {

	public static void main(String[] args)
	{
		String s="https://www.ktmindia.com/ktm-bikes/supersport/ktm-rc-200?utm_source=Google&utm_medium=cpc&utm_campaign=EDM_KTM_RC_200_South_Performance_Max_Feb23_Google&utm_content=First_Party_Audience&utm_customdetails1=RC_LeadGen_D2C&utm_customdetails2=Display_Google&gad_source=1&gclid=Cj0KCQiAyKurBhD5ARIsALamXaEGJVcqv2dvN-YwEbS9kRfuK4m19bdRJPw7lvh9T9jXaDbCvz10A5IaAlfqEALw_wcB";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktmindia.com/ktm-bikes/supersport/ktm-rc-200?utm_source=Google&utm_medium=cpc&utm_campaign=EDM_KTM_RC_200_South_Performance_Max_Feb23_Google&utm_content=First_Party_Audience&utm_customdetails1=RC_LeadGen_D2C&utm_customdetails2=Display_Google&gad_source=1&gclid=Cj0KCQiAyKurBhD5ARIsALamXaEGJVcqv2dvN-YwEbS9kRfuK4m19bdRJPw7lvh9T9jXaDbCvz10A5IaAlfqEALw_wcB");
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
