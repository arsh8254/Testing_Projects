package WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ParallelTesting {
		
		WebDriver driver;
		public String URL="https://opensource-demo.orangehrmlive.com";
		@Parameters("mybrowser")
		
		@BeforeTest
		public void BT(String mybrowser)
		{
			if(mybrowser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver" , "C://Selenium//chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				
			}
			else if(mybrowser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver" , "C://Selenium//geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();

				
			}
			
		}
		@Test
		public void test1() throws InterruptedException
		{
			System.out.println(driver.getTitle());
			  	driver.get(URL);
			  	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
				
				
		}
				@AfterTest
				public void AT()
				{
					driver.close();
				}
}
