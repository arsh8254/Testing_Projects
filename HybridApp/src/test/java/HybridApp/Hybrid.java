package HybridApp;

import java.net.MalformedURLException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;

// import static items
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;

public class Hybrid extends HybridCap {
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException
	{
		 driver=capability();
	}
	
	@Test(enabled = false)
	public void test() throws InterruptedException
	{
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//Thread.sleep(3000);
		// choosing the drop down to india
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		//Thread.sleep(3000);
		// sending name
		//driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Liesl");
		//Thread.sleep(3000);
		// selecting female
		//driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		//Thread.sleep(3000);
		
		// clicking on the button com.androidsample.generalstore:id/btnLetsShop
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		Thread.sleep(3000);
		
		// remove the name and login, capture the error message
		// add the toast message here
	}
	@Test(enabled=false)
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(3000);
		
		// choosing the drop down to india
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		Thread.sleep(3000);
		
		// sending name
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Liesl");
		Thread.sleep(3000);
		
		// selecting female
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		Thread.sleep(3000);
				
		// clicking on the button com.androidsample.generalstore:id/btnLetsShop
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		Thread.sleep(5000);
		
		// what is visible
		// product screen is visible
		// select the first two products (add to cart)
		// without scrolling
		// one way
		//driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
		
		// another method to click on a product
		// index will come only if there are elements
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		//Thread.sleep(3000);
		// add to cart is changed to added to cart
		// clicking on the next element
		//driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
		
	}
	
	@Test(enabled=false)
	public void testcase2() throws InterruptedException
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(3000);
		
		// choosing the drop down to india
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"))").click();
		Thread.sleep(3000);
		
		// sending name
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Liesl");
		Thread.sleep(3000);
		
		// selecting female
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		Thread.sleep(3000);
				
		// clicking on the button com.androidsample.generalstore:id/btnLetsShop
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		Thread.sleep(5000);
		
		// scrolling based on the product list (two at a time)
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"PG 3\"))"));
		
		// when you are choosing the item
		// there are few elements on the screen, and that list is only 3
		// so storing that list first
		int nameCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		for(int i=0; i< nameCount; i++)
		{
			// getting the name of each product
			String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			
			// placing an if condition to see if the name matches
			if (productName.equalsIgnoreCase("PG 3"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				// breaking the loop
				break;
			}
		}
	}
	@Test
	public void testcase3() throws InterruptedException
	{
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(3000);
		
		// choosing the drop down to india
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"))").click();
		Thread.sleep(3000);
		
		// sending name
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Liesl");
		Thread.sleep(3000);
		
		// selecting female
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		Thread.sleep(3000);
				
		// clicking on the button com.androidsample.generalstore:id/btnLetsShop
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		Thread.sleep(5000);
		
		// scrolling based on the product list (two at a time)
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		
		// clicking on the button
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
		
		// now adding the two values and check if it is correct with the total
		// using resource id which is the same as id
		String amount1= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		
		// splitting the amount 1 to remove the $ sign
		amount1 = amount1.substring(1);
		Double amount1Value = Double.parseDouble(amount1);
		System.out.println(amount1Value);
		
		// now to do the same to amount 2
		String amount2= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		amount2 = amount2.substring(1);
		Double amount2Value = Double.parseDouble(amount2);
		System.out.println(amount2Value);
		
		// what is the sum of these two
		Double expectedTotal = amount1Value + amount2Value;
		System.out.println(expectedTotal);
		
		// now getting the actual displayed value from the screen
		String TotalValue = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		
		// splitting total vlaue
		TotalValue = TotalValue.substring(1);
		
		// changing to double
		Double TotalValueAmount = Double.parseDouble(TotalValue);
		
		// running an assert
		Assert.assertEquals(TotalValueAmount, expectedTotal);
	
		// checking the datatype
		System.out.println(amount2Value.getClass().getSimpleName());
		System.out.println(amount2.getClass().getSimpleName());
		
		// long tap
		TouchAction ta = new TouchAction(driver);
		
		
		// store the element
		WebElement E1 = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		ta.longPress(longPressOptions().withElement(element(E1)).withDuration(ofSeconds(3)))
		.release().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		
		// tap
		WebElement E2 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Send me e-mails on discounts related to selected products in future\")"));
		ta.tap(tapOptions().withElement(element(E2))).perform();
		Thread.sleep(3000);
		
		// next page
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(20000);
		
		// now there is a window opened in the browser, so we will have to
		// get the handles
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName);
		}
		
		
		// now changing the handles
		// web app = WEBVIEW_com.androidsample.generalstore
		driver.context("WEBVIEW_com.androidsample.generalstore");
		Thread.sleep(9000);
		
		// From the web app
		driver.findElement(By.tagName("input")).sendKeys("Moolya linkedin");
		Thread.sleep(5000);
		
		// need to click on the first option // we have a keyboard there too // so we can use actions interface
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		// now we will click with using linktext
		driver.findElement(By.partialLinkText("Moolya | LinkedIn")).click();
		Thread.sleep(5000);
	}
}