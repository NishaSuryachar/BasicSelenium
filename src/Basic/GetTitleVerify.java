package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleVerify {

	public static void main(String[] args) 
	{
		//to open the browser
        WebDriver driver=new ChromeDriver();
      //to maximize the browser
        driver.manage().window().maximize();
      //go to that particular web page
        driver.get("https://demowebshop.tricentis.com/electronics");
      //storing the page title name into the container which is given 
        String given_title="Demo Web Shop. Electronics";
      //to get the title name of the web page
        String current_title=driver.getTitle();
        //here we are checking the given title and current title are same or not
        if(current_title.equals(given_title))
        {
        	System.out.println("given and current same");
        }
        else
        {
        	System.out.println("given and current not same");
        }
    }
}
