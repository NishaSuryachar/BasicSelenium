package PracticePg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Robot r=new Robot();
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
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_L);
        r.keyPress(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_O);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_L);
        r.keyRelease(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_O);
        r.keyRelease(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_ENTER);
        
	}

}
