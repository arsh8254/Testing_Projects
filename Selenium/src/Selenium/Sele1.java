package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
			WebDriver wb = new ChromeDriver();
			wb.navigate().to("https://opensource-demo.orangehrmlive.com");
			wb.manage().window().maximize();
			wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			wb.findElement(By.xpath("//*[@id='btnLogin']")).click();
			wb.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
			wb.quit();
		}
}
