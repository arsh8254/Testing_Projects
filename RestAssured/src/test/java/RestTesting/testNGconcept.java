package RestTesting;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testNGconcept {
	@BeforeTest
	public void BT()
	{
		String Name = "Sunil";
		String SName = "Nishchith";
		AssertJUnit.assertEquals(SName, Name);
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is my first teestcase1");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("This is After test");
	}
	
	
	
	
}
