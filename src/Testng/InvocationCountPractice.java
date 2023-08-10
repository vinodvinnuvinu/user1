package Testng;

import org.testng.annotations.Test;

public class InvocationCountPractice 
{
	@Test(invocationCount=2)
	public void test0()
	{
		System.out.println("test0");
	}
	
	@Test
	public void test1()          // default value is 1
	{
		System.out.println("test1");
	}
	
	@Test(invocationCount=-2)                // it will not execute  because negative value
	public void test2()
	{
		System.out.println("test2");
		
	}
	
	@Test(invocationCount=0)                 // default value is 1 so it will not execute
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(invocationCount=4)
	public void test4()
	{
		System.out.println("test4");
	}

}
