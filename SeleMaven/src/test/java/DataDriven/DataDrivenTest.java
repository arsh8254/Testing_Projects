package DataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DataDrivenTest {
	WebDriver driver;
	public String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
			@Test()
			public void testcase1() throws IOException, InterruptedException {
			WebDriverManager.chromedriver().setup();
	
	
			File excel=new File("D:\\MOOLYA\\SELENIUM\\DDT2.xlsx");
			FileInputStream fis=new FileInputStream(excel);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
	
			driver=new ChromeDriver();
			driver.get(URL);
	
			int rowcount=sh.getLastRowNum();
			for(int i=0;i<rowcount;i++) {
				String username=sh.getRow(i).getCell(0).getStringCellValue();
				String password=sh.getRow(i).getCell(1).getStringCellValue();
		
		
				WebElement user=driver.findElement(By.xpath("//*[@id='txtUsername']"));
				user.sendKeys(username);
	
				driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
				driver.findElement(By.xpath("//*[@id='btnLogin']")).click(); 
				//WebElement	link=	driver.findElement(By.xpath("//*[@id='welcome']"));
				System.out.println("bhg");
				String str1=  driver.getCurrentUrl();
				// String str=    driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
				if(str1.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
					System.out.println("india");
					driver.findElement(By.xpath("//*[@id='welcome']")).click();
					Thread.sleep(2000); 
					driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
					Thread.sleep(3000);
		
	
}
				else {
					for(int j=i+1;j<rowcount;j++) {
					String username1=sh.getRow(j).getCell(0).getStringCellValue();
					String password1=sh.getRow(j).getCell(1).getStringCellValue();
					driver.navigate().refresh();
					driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username1);
					driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password1); 
					driver.findElement(By.xpath("//*[@id='btnLogin']")).click();  
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='welcome']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
					Thread.sleep(3000);
					
}
}
}}}