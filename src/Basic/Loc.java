package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {

	public static void main(String[] args) throws InterruptedException
	{
		//storing the url into the container 
		String given_url="https://demowebshop.tricentis.com/";
		//to open the browser
	    WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go to web page
		driver.get("https://demowebshop.tricentis.com/");
		//storing the current url into the container 
		String current_url=driver.getCurrentUrl();
		//here we are verifying the current url and given url
		if(given_url.equals(current_url))
		{
			//if it is true,performs inner operations
			System.out.println("Succesufully entered");
		    Thread.sleep(2000);
		    //finding web element and clicking on that
	      	driver.findElement(By.linkText("Log in")).click();
	      //storing the given title name of the web page into the container 
	      	String given_Logintitle="Demo Web Shop. Login";
	        //storing the current title name of the web page into the container 
	     	String current_Logintitle=driver.getTitle();
	     	//here we are verifying the current title and given title name 
	     	if(given_Logintitle.contains(current_Logintitle))
	     	{
			System.out.println("you are in login page");
		    }
	     	else
	    	{
		      	System.out.println("you are not in login page");
		    }
     	}
		else
		{
			System.out.println("unsuccesufully");
		}
   }
}
