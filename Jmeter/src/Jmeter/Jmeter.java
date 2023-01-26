package Jmeter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Jmeter {
				WebDriver driver;
				@Test
				public void test1() throws InterruptedException
				{
						System.setProperty("webdriver.chrome.driver" , "C://Selenium//chromedriver.exe");
						driver = new HtmlUnitDriver();
						//driver = new ChromeDriver();
						driver.manage().window().maximize();
						Thread.sleep(3000);
						driver.get("https://www.google.com");
						String title = driver.getTitle();
						System.out.println(title);
						// now export this roject into a jar file and save in jmeter library to run it in jmeter
						//thus selenium can also be done in jmeter
						
	}

}
