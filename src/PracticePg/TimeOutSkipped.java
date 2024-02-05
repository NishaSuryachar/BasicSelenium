package PracticePg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(PracticePg.ListenersPg.class)
public class TimeOutSkipped 
{
	@Test(timeOut = 2000)
  public void timeOut() throws InterruptedException
  {
	  Thread.sleep(3000);
  }
	@Test(dependsOnMethods = "timeOut")
	public void Skipped()
	{
		System.out.println("i am coming");
	}
}
