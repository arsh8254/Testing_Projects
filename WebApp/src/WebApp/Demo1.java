package WebApp;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo1 extends Capabilities {
			// i should call the method here
			AndroidDriver<AndroidElement> driver;
			@BeforeTest
			public void BT() throws MalformedURLException
		
			{
			driver = capability();
			}
	
			@Test
			public void testcase1() throws InterruptedException
			{
				driver.get("https://www.google.com");
				String title = driver.getTitle();
				System.out.println(title);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("Moolya");
				Actions act = new Actions(driver);
				act.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(3000);
				JavascriptExecutor js =(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 800)");
				driver.findElement(By.xpath("//*[@href=\"https://in.linkedin.com/company/moolyatesting\"][1]")).click();
}

}
