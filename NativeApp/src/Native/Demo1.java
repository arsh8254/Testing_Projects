package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Demo1 extends Capabilities {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
			AndroidDriver<AndroidElement> driver = capability();
			
			driver.findElement(MobileBy.AccessibilityId("Preference")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
			
			// because id is a locator of selenium so we can use by.id directly
			//i use mobile.by only if it is android locator
			Thread.sleep(3000);
			driver.findElement(By.id("android:id/checkbox")).click();
			//if i don't have accessibility id and i cannot use xpath as it is big
			//so i can identify the element using text
			//Whenever i am identifying the element with attribute not locator then i that case i use uiautomator
			//and uiSelector is a method i use to identify the element with a attribute
			//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
			//or
			//driver.findElementByAndroidUIAutomator("UiSelector().text(\"WiFi settings\")").click();
			//or
			driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("aryan");
			//when two elements have same locator value then we differentiate them by using their index value
			//here ok and cancel have the same class name
			// cancel has index 0
			//ok has index 1
			driver.findElements(By.className("android.widget.Button")).get(1).click();
			Thread.sleep(3000);
			//if i want to navigate back then
			//app switch is basically to switch between two apps
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
			// if i want to open notification then
			driver.openNotifications();
			
			
	}
}
