package Sele;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleGrid {
	public static String URL = "https://opensource-demo.orangehrmlive.com/";
	
	public static void main(String[] args) throws MalformedURLException {
	// whatever machine we are working on both local and node machine, selenium stand alone files with browser must be there
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			// these capabilities define that chrome browser is present on the node machine
			
			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"),dc);
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			// now run simply keeping cmd for local and node running
				

	}

}
