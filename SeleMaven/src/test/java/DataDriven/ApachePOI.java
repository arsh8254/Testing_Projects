 package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApachePOI {
	WebDriver driver;
	public String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
			@Test()
			public void testcase1() throws IOException, InterruptedException {
			WebDriverManager.chromedriver().setup();
	
			//these two lines will take care about the excel file and reading the data from the excel file
			//the path should be of the .xlsx sheet
			File excel=new File("D:\\MOOLYA\\SELENIUM\\DDT2.xlsx");
			FileInputStream fis=new FileInputStream(excel);
			//fis is used to get the excel sheet and will remain same always
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet("Sheet1");
	
			driver=new ChromeDriver();
			driver.get(URL);
			//getLatRowNum gets the last row in which some data is mentioned
			int rowcount=sh.getLastRowNum();
			for(int i=0;i<rowcount;i++) 
			{
				String username=sh.getRow(i).getCell(0).getStringCellValue();
				String password=sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println(username);
				System.out.println(password);
		
		
				driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
				driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
				driver.findElement(By.xpath("//*[@id='btnLogin']")).click(); 
				driver.findElement(By.xpath("//*[@id='welcome']"));
				driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
				
}
			driver.close();
			}
}

