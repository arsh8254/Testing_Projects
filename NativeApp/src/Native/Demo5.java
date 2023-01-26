package Native;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;


import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class Demo5 extends Capabilities {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElement(MobileBy.AccessibilityId("OS")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
		Thread.sleep(3000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Send")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button2")).click();
		Thread.sleep(2000);
		// in order to switch apps to get otp or confirm payment etc
		//driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		//Thread.sleep(2000);
		
		//instead of using app switch we start a new activity to directly move to messaging app
		//we use its package name and the activity name
		driver.startActivity(new Activity("com.google.android.apps.messaging","com.google.android.apps.messaging.home.HomeActivity"));
        Thread.sleep(3000);
        driver.findElementById("com.google.android.apps.messaging:id/conversation_text_content").click();
        Thread.sleep(3000);
				
        // we use split to get the desired text like otp from the whole message
		String message = driver.findElement(By.id("com.google.android.apps.messaging:id/conversation_snippet")).getText().split(":")[1].trim();
		System.out.println(message);
		
	}

}
