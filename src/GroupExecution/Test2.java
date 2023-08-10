package GroupExecution;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(groups="Smoke")
	public void demo1()
	{
		System.out.println("Test2-Demo1Smoke");
	}
	@Test(groups="Sanity")
	public void demo2()
	{
		System.out.println("Tes2-Demo2Sanity");
	}
	@Test(groups="Regression")
	public void demo3()
	{
		System.out.println("Test2-Demo3Regression");
	}
	@Test(groups="Sanity,Smoke,Regression")
	public void demo4()
	{
		System.out.println("Test2-Demo4SanitySmokeRegression");

}
}
