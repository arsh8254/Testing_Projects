package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;

import static java.time.Duration.ofSeconds;

import java.awt.Dimension;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Demo4 extends Capabilities{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		//if we want to click on the views using attributes called text
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//if i want to know how many clickable items are there
		WebElement link = driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		// if i used android element here and run this code in ios it will give an error
		//so to use in both the devices we use webelement
		
		//in order to get the size 
		Dimension number = link.getSize();
		System.out.println(number);
		
		//if i want to tap on an element we use toch actions
		//first i will store the element in a variable
		WebElement el = driver.findElementByAccessibilityId("Expandable Lists");
		//to perform any keyboard operation we use actions in selenium
		//similarly in mobile we use touch action
		//in mobile testing these are called gestures
		TouchAction ta = new TouchAction(driver);
		
		//if i want to tap on an element
		ta.tap(TapOptions().withElement(element(el))).perform();
		Thread.sleep(3000);
		
		driver.findElementByAccessibilityId("1. Custom Adapter").click();
		Thread.sleep(3000);
		WebElement lp = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		ta.longPress(longPressOptions().withElement(lp).withDuration(ofSeconds(3))).release().perform();

	}

}
