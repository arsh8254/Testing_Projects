package Native;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
			DesiredCapabilities dc = new DesiredCapabilities();
			
			// this is the name of the emulator
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel");
			
			// this is the name of the platform - ios or android
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
			
			// this may not be used mandatorily in android
			// it is generally embedded in the program
			//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			
			// appium is taken by default so there is no need to write it in the program
			//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
			
			// this is used when we have to automate the app in ios
			//for ios it is mandatory to be used
			//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
			
			
			AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			return driver;
			
	}

}
