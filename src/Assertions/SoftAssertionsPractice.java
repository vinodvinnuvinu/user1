package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsPractice 
{
	@Test
	public void demo1()
	{
		SoftAssert soft = new SoftAssert();     
		String s1 = "hello";
		String s2 = "world";
		
		soft.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("assertions failed");
		soft.assertAll();
	}
	@Test
	public void demo2()
	{
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1);
		System.out.println(s2);
	}

}
