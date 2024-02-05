package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysByRobotInDws {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_C);
        r.keyPress(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("script is successfull");
        driver.close();
	}

}
