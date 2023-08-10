package GroupExecution;

import org.testng.annotations.Test;

public class Test3 
{
	@Test(groups="Smoke")
	public void demo1()
	{
		System.out.println("Test3-Demo1Smoke");
	}
	@Test(groups="System")
	public void demo2()
	{
		System.out.println("Tes3-Demo2System");
	}
	@Test(groups="Regression,System")
	public void demo3()
	{
		System.out.println("Test3-Demo3RegressionSystem");
	}
	@Test(groups="Sanity,Smoke,Regression")
	public void demo4()
	{
		System.out.println("Test3-Demo4");

}
}
