package AssignmentsPOPUP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		String[] name= {"Nisha","M S","Nishams1208@gmail.com","9123456780","Nisha12345","Nisha12345"};
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.get("https://demo.automationtesting.in/Register.html");
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='form-group']/div/input"));
        int i=0;
        for (WebElement web : options)
        {
			web.sendKeys(name[i++]);
		}
       WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
       address.sendKeys("J.P Nagar,Bangalore");
       driver.findElement(By.xpath("//input[@value='FeMale']")).click();
       List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
       for (WebElement web : checkbox)
       {
		   web.click();
	   }
         WebElement language = driver.findElement(By.xpath("(//div[@class='form-group'])[7]"));
         language.click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='English']"))).click();
         WebElement skills = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='Skills']")));
         Select s1=new Select(skills);
         s1.selectByVisibleText("Java");
          driver.findElement(By.xpath("//span[@role='combobox']")).click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='India']"))).click();
          WebElement year = driver.findElement(By.id("yearbox"));
          Select s2=new Select(year);
          s2.selectByVisibleText("1994");
          WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
          Select s3=new Select(month);
          s3.selectByVisibleText("October");
          WebElement day = driver.findElement(By.id("daybox"));
          Select s4=new Select(day);
          s4.selectByVisibleText("9");
          driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Pictures\\Saved Pictures\\adi yogi.jpg");
          driver.findElement(By.xpath("//button[@value='sign up']")).click();
        }
}
