package AssignmentsAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAssignment {

	public static void main(String[] args) throws InterruptedException
    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement s1= driver.findElement(By.id("box6"));
		WebElement t1 = driver.findElement(By.xpath("//div[text()='Italy']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(s1, t1).build().perform();
		Thread.sleep(1000);
		WebElement s2= driver.findElement(By.id("box7"));
		WebElement t2 = driver.findElement(By.xpath("//div[text()='Spain']"));
		a1.dragAndDrop(s2, t2).build().perform();
		Thread.sleep(1000);
		WebElement s3 = driver.findElement(By.id("box1"));
		WebElement t3 = driver.findElement(By.xpath("//div[text()='Norway']"));
		a1.dragAndDrop(s3, t3).build().perform();;
		Thread.sleep(1000);
		WebElement s4 = driver.findElement(By.id("box4"));
		WebElement t4 = driver.findElement(By.xpath("//div[text()='Denmark']"));
		a1.dragAndDrop(s4, t4).build().perform();
		Thread.sleep(1000);
		WebElement s5 = driver.findElement(By.id("box5"));
		WebElement t5 = driver.findElement(By.xpath("//div[text()='South Korea']"));
		a1.dragAndDrop(s5, t5).build().perform();
		Thread.sleep(1000);
		WebElement s6 = driver.findElement(By.id("box2"));
		WebElement t6 = driver.findElement(By.xpath("//div[text()='Sweden']"));
		a1.dragAndDrop(s6, t6).build().perform();
		Thread.sleep(1000);
		WebElement s7 = driver.findElement(By.id("box3"));
		WebElement t7 = driver.findElement(By.xpath("//div[text()='United States']"));
		a1.dragAndDrop(s7, t7).build().perform();
		driver.close();
	}
}

