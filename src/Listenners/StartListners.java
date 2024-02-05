package Listenners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class StartListners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("onFinish");
	}

}

//after create class we have to implements ITestListener interface after that go to class name in package and right click on that 
//then select source and then click on implements /override methods after that one pop-up will come check on ITestListener checkbox in that 
//sub methods you have uncheck "onTestFailedButWithinSuccessPercentag" box 
//click on ok 
//after that create another class with test annotation
//before class name @Listeners annotation have to call
//inside that @Listeners annotation ( Listenners.StartListners.class) 
//Listenners- it is a package name
//StartListners-it is aclass name which implements ITestListner interface
//class -it is keyword[we have mention it as class only]