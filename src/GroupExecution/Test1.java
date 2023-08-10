package GroupExecution;

import org.testng.annotations.Test;

public class Test1 
{
	@Test(groups="Smoke")
	public void demo1()
	{
		System.out.println("Test1-Demo1Smoke");
	}
	@Test(groups="Sanity")
	public void demo2()
	{
		System.out.println("Test1-Demo2Sanity");
	}
	@Test(groups="Regression")
	public void demo3()
	{
		System.out.println("Test1-Demo3Regressin");
	}
	@Test(groups="Sanity,Smoke")
	public void demo4()
	{
		System.out.println("Test1-Demo4SanitySmoke");
	}


}
