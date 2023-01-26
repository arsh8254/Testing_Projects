package WebDriver;

import org.testng.annotations.Test;

public class Groups {
	
			@Test(groups = {"smoke"},priority = 0)
			public void testcase1()
			{
				System.out.println(" for smoke testing 1");
			}
			
			@Test(groups = {"regression"},priority = 0)
			public void testcase2()
			{
				System.out.println(" for regression testing 1");
			}

			
			@Test(groups = {"regression"},priority = 0)
			public void testcase3()
			{
				System.out.println(" for regression testing 2");
			}

			
			@Test(groups = {"smoke"},priority = 0)
			public void testcase4()
			{
				System.out.println(" for smoke testing 2");
			}


}
