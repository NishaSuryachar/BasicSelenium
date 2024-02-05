package PracticePg;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized extends BaseClass
{
	@Parameters("URL")
	@Test
     public void login(String url)
     {
		   
		   driver.get(url);
		  
     }
}
