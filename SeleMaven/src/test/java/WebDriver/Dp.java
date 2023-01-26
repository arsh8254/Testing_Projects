package WebDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dp {
	WebDriver driver;
	  public static String URL1 = "https://opensource-demo.orangehrmlive.com";
  @Test(dataProvider = "dp")
  
  public void f(String n, String s) throws InterruptedException {
	  driver.get(URL1);
	  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(n);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(s);
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@href='/index.php/auth/logout']")).click();
		Thread.sleep(3000);

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  
  	driver.close();
}
}
