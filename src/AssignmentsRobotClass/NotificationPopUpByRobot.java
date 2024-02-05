package AssignmentsRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopUpByRobot {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
        Robot r = new Robot();
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("Blocked successfully");
        driver.close();
  	}
}
