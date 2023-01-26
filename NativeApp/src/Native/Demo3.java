package Native;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo3 extends Capabilities {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		// if i want to scroll till the end of the page and click on the last element
		//javascript and webdriver are used for selenium testing not for appium
		//for appium we use
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		//ios scrolling is done by x and y coordinates
		

	}

}
