package RestTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

public class Junit {
	@BeforeMethod
	public void BT()
	{
		String Name = "Sunil";
		String SName ="Nishchith";
		
		AssertJUnit.assertEquals(SName,Name);
		System.out.println("Both the names are same");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is the first method");
	}
	
	@AfterMethod
	public void AT()
	{
		System.out.println("This is after method");
	}
}
