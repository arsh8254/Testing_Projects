package WebDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.swing.event.MenuKeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.beust.jcommander.JCommander.Builder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {
		WebDriver driver;
//		public String URL="https://opensource-demo.orangehrmlive.com";
//		public String URL1="https://demo.guru99.com/test/newtours";
		public String URL2="https://google.com";

		@BeforeTest
		public void BT()
		{
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver" , "C://Selenium//chromedriver.exe");
			
			driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			//driver.get(URL);
			//IMPLICITLY WAIT 
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
	@Test(priority=0, enabled=false)

	public void testcase1() throws InterruptedException
	{
		String expected="OrangeHRM";
		//String expected=driver.getTitle();
		//Assert.assertEquals(expected, actual);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//for button we use click keywords
		driver.findElement(By.id("btnLogin")).click();
		String actual=driver.getTitle();
		if(expected.equals(actual))
		{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		}
		else
		{
			System.out.println("not same");
		}
	}

	@Test(priority=1,enabled=false)
	public void testcase2() throws InterruptedException
	{
		//webelement is also an interface
		WebElement un= driver.findElement(By.xpath("//*[@id='txtUsername']"));
		if(un.isEnabled())
		{
			//if some data is present it will clear
			un.sendKeys("astha");
			Thread.sleep(3000);
			un.clear();
			//pass values to un
			un.sendKeys("Admin");
			
		}	
	if(un.isDisplayed())
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//for button we use click keywords
		//when to identify any elemnt by text name can use contains(text()....)
		//driver.findElement(By.xpath("//*[contains(text(),'LOGIN')]")).click();
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Admin")).click();
		//driver.findElement(By.linkText(URL))
		//or
		//driver.findElement(By.partialLinkText("Ad")).click();
		//to checkbox cmnd is 
		driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_67']")).click();
		if(driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_67']")).isSelected())
		{
			System.out.println("its selected");
		}
	}
	}
	@Test(enabled = false)
	public void test3() throws InterruptedException
	{
		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		//for button we use click keywords
//		driver.findElement(By.id("btnLogin")).click();
		String Tiltle=driver.getTitle();
		//want to knows links then use findelements not findelement 
		//driver.get(URL1);
		List<WebElement> link= driver.findElements(By.tagName("a"));
		//to print size of link
		System.out.println(link.size());
		for(int i=0;i<link.size();i++)
		{
			System.out.println(link.get(i).getText());
		}
	}
	@Test(enabled=false)

	public void testcase4() throws InterruptedException
	{
		//driver.get(URL1);
		driver.findElement(By.name("userName")).sendKeys("astha");
		String val=driver.findElement(By.name("userName")).getAttribute("value");
		System.out.println(val);
		//id name class value all are attributes ,for fetching it we use getattribute
		//getattribute is dynamic in nature
		//want to capture that attribute
	driver.findElement(By.name("password")).sendKeys("asthajain");
//		//for button we use click keywords
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.partialLinkText("Fli")).click();
		//we can iether use containtext for navigating t any links
		driver.findElement(By.xpath("//*[contains(text(),'Flights')]")).click();
		Thread.sleep(3000);
		//for radiobutton
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		Thread.sleep(3000);
		//for dropdown we need to store in webelement
		WebElement dd=driver.findElement(By.name("passCount"));
		//in selenium to select the value from dropdown we use keyword select
		//this select will click on dd dropdown
		Select s=new Select(dd);
		//to find how namy select values are there in dropdown
		 List<WebElement> value=s.getOptions();
		 System.out.println(value.size());
		 for(int i=0;i<value.size();i++)
		 {
			 System.out.println(value.get(i).getText());
		 }
		s.selectByIndex(3);
		//System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		s.selectByVisibleText("3");
		s.selectByValue("2");
		 Thread.sleep(3000);
		 
		 //want to fetch the value which i selected
		 
		 
		 
		WebElement d=driver.findElement(By.name("fromPort"));
		Select ss=new Select(d);
		ss.selectByValue("Sydney");
			 Thread.sleep(3000);
		WebElement m=driver.findElement(By.name("fromMonth"));
		Select p=new Select(m);
		p.selectByValue("8");
		
		WebElement da=driver.findElement(By.name("fromDay"));
		Select dy=new Select(da);
		dy.selectByValue("13");
		
		WebElement t=driver.findElement(By.name("toPort"));
		Select tp=new Select(t);
		tp.selectByValue("London");
		
		WebElement tm=driver.findElement(By.name("toMonth"));
		Select mt=new Select(tm);
		mt.selectByValue("11");
		
		WebElement td=driver.findElement(By.name("toDay"));
		Select dt=new Select(td);
		dt.selectByValue("19");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		
		WebElement al=driver.findElement(By.name("airline"));
		Select la=new Select(al);
		la.selectByIndex(0);
		//la.selectByValue("Blue Skies Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
	}
	@Test(enabled=false)

	public void testcase5() throws InterruptedException
	{
//		driver.get(URL);
		String expected="OrangeHRM";
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//for button we use click keywords
		driver.findElement(By.id("btnLogin")).click();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//for enhanced loop
		for(WebElement e:links)
		{
			System.out.println(e.getText());
		//System.out.println(e.getAttribute("href"));
			//want to click on PIM
			driver.findElement(By.linkText("PIM")).click();
			//after going inside pim page and want to go back to home page
			//navigation metod which will take back 1 step
//			Thread.sleep(3000);
//			driver.navigate().back();
			//want to navigate again forward 
			//or 
//			Thread.sleep(3000);
//			driver.navigate().forward();
//			Thread.sleep(3000);
			//at this point of time i want to refresh page
			
//			driver.navigate().refresh();
			//explicit wait,when i have condition check whether elemnt is visible and then click on element
			WebElement link=driver.findElement(By.linkText("PIN"));
			WebDriverWait wt=new WebDriverWait(driver,40);
			//this is one of condtion applied for PIM
			//Simi you can use for any other condition with same objects
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("PIN")));
			link.click();
			
			//mouseover to element called as PIM
			//to do mouseover/keyword operations or kind of scroll up and down we use actions
			
			Actions a=new Actions(driver);
			//contect click is ryt click
			//.build will compile
			a.moveToElement(link).build().perform();
			
			//keyboard keys
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
			a.sendKeys(Keys.ENTER).build().perform();
		
			
		}
	}
	@Test(enabled=false)
	public void testcase6()
	{
		//driver.get(URL);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Actions a=new Actions(driver);
		//this line enter keyword to enter
		a.sendKeys(Keys.ENTER).build().perform();
		
	}
	@Test(enabled = false)
	public void testcase7() throws AWTException
	{
		
		
		driver.get(URL2);
		WebElement link=driver.findElement(By.linkText("Gmail"));
		Actions a=new Actions(driver);
		a.moveToElement(link);
	 a.contextClick(link).build().perform();
	 Robot r=new Robot();
		// a kind of menu action is Robot
		
		//ryt click cannot be automated bt action we should use robot
		//a.contextClick()
		r.keyPress(MenuKeyEvent.VK_DOWN);
		//r.keyPress(MenuKeyEvent.VK_DOWN);
		r.keyPress(MenuKeyEvent.VK_ENTER);
		r.keyPress(MenuKeyEvent.VK_CONTROL);
		r.keyPress(MenuKeyEvent.VK_TAB);
		//System.out.println(driver.getTitle());
		String parenttabs=driver.getWindowHandle();
		Set<String> tabs=driver.getWindowHandles();
		//window handles stores all the tabs and wndows which ar opened
		//window handle get window for very frst window and store in parenttab
		for(String handles:tabs)
		{
			//switch to means switch to another tab
			driver.switchTo().window(handles);
			driver.get("https://opensource-demo.orangehrmlive.com");
			System.out.println(driver.getTitle());
			driver.switchTo().window(parenttabs);
			driver.get("https://google.com");
			//screen stuck then press ctrl(left side)
			//close is used to closed the current open tab
			//quit used for closing all tabs
			//driver.close();
	driver.switchTo().window(handles);
			driver.quit();
		}
		

		
	}

	@Test(enabled=false)      // has error
	public void testcase8()
	{
		String underconstruction="Under Construction: Mercury Tours";
		driver.get("https://demo.guru99.com/test/newtours");

			List<WebElement> list=driver.findElements(By.tagName("a"));
			String[] linktext=  new String [list.size()];
			int i=0;
			for(WebElement s:list)
			{
				
			linktext[i]=s.getText();
				
				i++;		
			}
			for(String t:linktext)
			{
				driver.findElement(By.linkText(t)).click();
				if(driver.getTitle().equals(underconstruction))
				{
					System.out.println(t +"link doesnt work");
				}
				
				else
				{
					System.out.println(t +"link works");
				}
				driver.navigate().back();
			}
					
	}	
	

	@Test(enabled=false)   // has error  solve it
	public void testcase9() throws AWTException, InterruptedException 
	{
		
		driver.get("https://demoqa.com/browser-windows");

		String parenttabs=driver.getWindowHandle();
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.id("windowButton")).click();	
		}

		Set<String> tabs=driver.getWindowHandles();
			
			driver.switchTo().window(parenttabs);
			driver.get("https://facebook.com");
			
			for(String handles:tabs)
			{
				//switch to means switch to another tab
				//handles contain parent to child
				driver.switchTo().window(handles);
				driver.get("https://opensource-demo.orangehrmlive.com");
				System.out.println(driver.getTitle());
			}
			driver.switchTo().window(parenttabs);
			driver.close();
//				Thread.sleep(3000);
//		driver.quit();
	}


	@Test(enabled=false)    // has error solve it
	public void testcase10() throws InterruptedException {

		//ALERTS
		
		//3 types
		//simple ok(normal),pass value and say ok(prompt to enter smthng),ok nd cancel popup(confirm)
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
//		//alert is keyword of selenium
		Alert a= driver.switchTo().alert();
//		//accept for ok
//		//dismiss for cancel
		String alertinfo=a.getText();
		System.out.println(alertinfo);
		a.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		a.dismiss();
		
		Thread.sleep(8000);
		driver.findElement(By.id("promtButton")).click();
		a.sendKeys("astha jain");
		a.accept();
			
	}
	

	@Test(enabled=false)
	public void testcase11() throws InterruptedException
	{
		driver.get("https://github.com/login");
		
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.linkText("Explore")).click();
		driver.findElement(By.linkText("Topics")).click();
		Thread.sleep(3000);
		List<WebElement> s=driver.findElements(By.tagName("a"));
		System.out.println(s.size());
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i).getText());
		}
		
	}
	

	@Test(enabled=false)
	public void testcase12() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com");
		Actions a =new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.PAGE_UP).build().perform();
		//everytime this line open new chrome browser
		//new instance of browser is stored in driver
		
	//WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//we use execute script not asynchronous
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		String URL= js.executeScript("return document.URL").toString();
		System.out.println(URL);
		String domain= js.executeScript("return document.domain").toString();
		System.out.println(domain);
		
		//to fetch inner text we use javascriot
		String inner =js.executeScript("return document.documentElement.innerText").toString();
	System.out.println(inner);	
	String specific=js.executeScript("return document.getElementById('divUsername').innerText").toString();
	System.out.println(specific);
	//for refresh
	js.executeScript("history.go(0)");
	//
	}
	
	
	@Test(enabled=false)
	public void testcase13()
	{
		driver.get("https://opensource-demo.orangehrmlive.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return document.getElementById('txtUsername').value='Admin'");
		js.executeScript("return document.getElementById('txtPassword').value='admin123'");
		js.executeScript("return document.getElementById('btnLogin').click()");
		js.executeScript("return document.getElementById('menu_pim_viewPimModule').click()");
		js.executeScript("return document.getElementById('menu_pim_viewEmployeeList').click()");
		//to scroll at end of page
		//x and y coordinate
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		js.executeScript("document.getElementById('ohrmList_chkSelectRecord_41').scrollIntoView()");
		//to fetch inner text of table
//		String table=js.executeScript("return document.getElementById('resultTable').innerText").toString();
	//	
//		System.out.println(table);
		//inner html of table
	String tablee=js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
		
		System.out.println(tablee);	
		}

	
	@Test(enabled=false)
	public void testcase14()
	{
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("return document.getElementById('email').value='user'");
//		js.executeScript("return document.getElementById('password').value='user'");
//		js.executeScript("return document.getElementById('last').click()");
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
		driver.findElement(By.id("last")).click();
		//to delete particular element in a row td[2] means deleting 2 precedding value of td[3]
		//to go backward use precedding
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]//preceding-sibling::td[2]//button")).click();
		//ahead then use forward
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]//following-sibling::td[2]//button")).click();
				
	}
	
	
	@Test(enabled=false)		//has error solve it
	public void testcase15()
	{
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.xpath("//*[contains(text(),'First Name')]")).click();
		String s=driver.findElement(By.xpath("//*[@class='rt-tr-odd']//following-sibling::div[3]")).toString();
		System.out.println(s);
	}
	
	
	@Test(enabled=false)
	public void testcase16() throws InterruptedException
	{
		driver.get("https://demoqa.com/frames");
		//driver.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("C:\\Users\\dell\\Desktop\\as.xlsx");
		List<WebElement> fr =driver.findElements(By.tagName("iframe"));
		System.out.println(fr.size());
		for(int i=0;i<fr.size();i++)
		{
			String fe=fr.get(i).getAttribute("id");
			System.out.println(fe);
		}
		//switch to different frame 
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		//want to move to default size 
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		
		// intercations assignment 
//		Actions a=new Actions(driver);
//		a.dragAndDrop(null, null);
//		a.clickAndHold().moveToElement(null).release().build().perform();
//		a.doubleClick();
	//	
		
		
		
	}

	@Test(enabled=false)
	public void testcase17()
	{
		driver.get("https://demoqa.com/droppable");
		Actions a=new Actions(driver);
		WebElement fr = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	 
		a.dragAndDrop(fr, to).build().perform();
		String textTo = to.getText();
		System.out.println(textTo);

		if(textTo.equals("Drop here")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}

	}

	@Test(enabled=false)
	public void testcase18()
	{
		driver.get("https://demoqa.com/selectable");
		Actions a=new Actions(driver);
		
	}
	
	  @AfterTest
	  
	  public void AterTest() {
	   driver.close();
	    }
}