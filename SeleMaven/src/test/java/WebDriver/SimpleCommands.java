package WebDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SimpleCommands {
				// this is used to interact with any browser
				WebDriver driver;
				public static String URL1 = "https://opensource-demo.orangehrmlive.com";
				public static String URL2 = "https://demo.guru99.com/test/newtours";
				public static String URL3 = "https://www.google.com";
				public static String URL4 = "https://demoqa.com/alerts";
				public static String URL5 = "https://demoapp.skillrary.com";
				public static String URL6 = "https://demoqa.com/frames";
				
				
				//@test , @beforetest , @aftertest are called as testng annotations.
				//these annotations may contain methods for testing 
				
			
			@BeforeTest
			public void BT()
			{
				System.setProperty("webdriver.chrome.driver" , "C://Selenium//chromedriver.exe");
				//this is for browser versions, it can take care of all versions of all browsers and their downloads.
				//WebDriverManager.chromedriver().setup();
				//To create new instance of browser every time we run the test.
				//whenever new instance of browser comes up, it shouldd be connected to driver.
				//the new instance of browser is stored in driver
				driver = new ChromeDriver();
				//to maximize the window of browser.
				driver.manage().window().maximize();
				//to get the URL or navigate to the URL.
				//driver.get(URL1);
				//one more method can be used to navigate as shown below.
				// driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
				}
			
			@Test(enabled=false,priority=0 )
			public void testcase1() throws InterruptedException
			{
				//all of my test steps and their actions will go here.
				String ExpectedTitle="OrangeHRM";
				//if i have to perform any action on my webpage in the browser then i have to use driver
				driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
				
				driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
				//to check if the title is still OrangeHRM.
				String ActualTitle= driver.getTitle();
				if(ExpectedTitle.equals(ActualTitle))
				{
					
						//thread is used when we think loading the webpage may take time.
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id='welcome']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@href='/index.php/auth/logout']")).click();
				}
				else
				{
						System.out.println("The titles are not same");
				}
				
				
					String ExpectedTitle1= driver.getTitle();
					Assert.assertEquals(ActualTitle, ExpectedTitle1);
			}
			
			
			@Test(enabled=false,priority=1)
			public void testcase2() throws InterruptedException
			{
				//i am storing an element of webpage in a variable using WebElement
				WebElement un = driver.findElement(By.xpath("//*[@id='txtUsername']"));
				//if we want to check if an element is enabled or disabled in the webpage.
				if(un.isEnabled())
				{
					// now i am passing value to the variable un
					un.sendKeys("aryan");
					Thread.sleep(3000);
					//if already some data is present then i can remove the data using clear.
					un.clear();
					un.sendKeys("Admin");
				}
				
				//if value is displayed in username then fill data in password.
				if(un.isDisplayed())
				{
					driver.findElement(By.id("txtPassword")).sendKeys("admin123");
					driver.findElement(By.id("btnLogin")).click();
					//after logging in, i wish to click on the tab called Admin
					driver.findElement(By.linkText("Admin")).click();
					//if my link is very big, i will use partial name.
					driver.findElement(By.partialLinkText("Adm")).click();
					// if i want to find out how many links are there on the webpage.
					List<WebElement> links = driver.findElements(By.tagName("a"));
					System.out.println(links.size());
					//if i want to print the name of all the links.
					for(int i=0;i<links.size();i++)
					{
						System.out.println(links.get(i).getText());
					}
				}
					}
			
			
			
				@Test(enabled=false, priority=2)
			public void testcase3() throws InterruptedException
				{
					driver.get(URL6);
					// i want to know how many frames are there in the webpage
					//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
					// this will give the count of frames
					//System.out.println(frames.size());
					// to get the names of frames we use for loop
//					for(int i=0;i<frames.size();i++)
//					{
//						String name = frames.get(i).getAttribute("id");
//						// getattribute is used because the frames come at runtime and are dynamic in nature
//						System.out.println(name);
						
						// if i wish to switch to frame 1
						//driver.switchTo().frame("frame1");
						//driver.switchTo().defaultContent();
						// defaultcontent is used to come back to the main page
						//System.out.println(driver.findElement(By.id("sampleHeading")).getText());
						
						// switching to frame 2 and scrolling
						// going to frame 2
						driver.switchTo().frame("frame2");
						Thread.sleep(3000);
						
						//scrolling using js executor
						JavascriptExecutor js = (JavascriptExecutor)driver;
						js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
						}
					//}
				
				
				@Test(enabled=false, priority=3)
				public void testcase4() throws InterruptedException
					{
						driver.get(URL2);
						
						// i want to fetch the value which i selected we can use keywords like value, text etc
						//if i want to fetch any attributes then i use getattribute keyword
						//attributes are used when something is dynamic in nature it keeps changing
						String value = driver.findElement(By.name("username")).getAttribute("name");
						System.out.println(value);
						
						driver.findElement(By.name("username")).sendKeys("aryan");
						driver.findElement(By.name("password")).sendKeys("arsh");
						driver.findElement(By.name("submit")).click();
						// we can use containstext for navigating to any links
						driver.findElement(By.xpath("//*[contains(text(), 'flights')]")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
						Thread.sleep(3000);
						// now i wish to work with drop-downs
						//first step is to identify the element and store it in a variable
						WebElement dd = driver.findElement(By.name("passCount"));
						// in selenium to select the value from the drop down we use keyword select
						//this keyword select will click on the drop down
						Select sc = new Select(dd);
						// i want to find out how many values are there
						List<WebElement> values = sc.getOptions();
						// if there are 4 value
						System.out.println(values.size());
						for (int i=0;i<values.size();i++);
						{
							//to print all the values
							 //System.out.println(values.get(i).getText());
						}
							// we have to select the value by giving its index
							// the index starts at zero like arrays
							sc.selectByIndex(3);
							Thread.sleep(3000);
							sc.selectByVisibleText("3");
							System.out.println(sc.getFirstSelectedOption().getText());
							//we select some value using selectbyvalue
							
						}
				
				
				@Test(enabled=false, priority=4)
				public void testcase5() throws InterruptedException, AWTException
					{
						driver.get(URL1);
						// all of my test actions are shown here
						//String ExpectedTitle = "OrangeHRM";
						// any action to be performed on the application can be done using driver
						driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
						driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
						
						driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
						// for loop as well as for enhanced loop can be used to complete action
						
						//navigation buttons
						//if i wish to login and then come back to previous page then i use navigation
						//for going back one step
						driver.navigate().back();
						//if we wish to move one step forward
						driver.navigate().forward();
						//if i wish to refresh my page 
						driver.navigate().refresh();
						
						
						// if by using actions i wish to click ENTER from the keyboard
						// this step initialises the actions to work with the mouse
						Actions act = new Actions(driver);
						act.sendKeys(Keys.ENTER).build().perform();
						act.sendKeys(Keys.ARROW_DOWN).build().perform();
						act.sendKeys(Keys.ARROW_RIGHT).build().perform();
						// all such actions can be done
					}
				
				@Test(enabled=false, priority=5)
				public void testcase6() throws InterruptedException, AWTException
					{
					driver.get("https://www.google.com");
					Actions act = new Actions(driver);
					
					WebElement link = driver.findElement(By.linkText("Gmail"));
					
					// I want to right click to see the options
					act.contextClick(link).build().perform();
					Thread.sleep(3000);
					
					//We import Robot because it will interact with the right click of the
					// context click
					Robot rc = new Robot();
					// any key events, any menu activities, we use robot
					
					// clicking on the first option of the right click
					rc.keyPress(MenuKeyEvent.VK_DOWN);
					Thread.sleep(3000);
					
					//choosing the second option
					//rc.keyPress(MenuKeyEvent.VK_DOWN);
					
					// to click on the enter button on context click
					rc.keyPress(MenuKeyEvent.VK_ENTER);
					Thread.sleep(3000);
					
					// to switch tabs
					rc.keyPress(MenuKeyEvent.VK_CONTROL);
					rc.keyPress(MenuKeyEvent.VK_TAB);
					//System.out.println(driver.getTitle());
					
					//get the handle of one tab, it will store the first window opened
					// it can be for a browser
					//String parentTab = driver.getWindowHandle();
					
					//used to store all the tabs that are opened
					// it will identify how many windows, how many tabs
					
					Set<String> tabs = driver.getWindowHandles();
					
					// for enhanced loop for tabs
					for(String handles: tabs)
					{
						// it will switch to the other tab in the below line
						driver.switchTo().window(handles);
						// gets the title
						System.out.println(driver.getTitle());
					}
					
					}
				
				@Test(enabled = false, priority = 6)
				public void testcase7() throws InterruptedException
				{
					driver.get(URL2);
					String underconstruction = "Under Construction: Mercury Tours";
				List<WebElement> link = driver.findElements(By.tagName("a"));
				//i want to extract the text of each link
				String[] linktext =new String [link.size()];
				int i=0;
				for(WebElement e : link)
				{
					linktext[i] = e.getText();
					i++;
				}
				
				for(String t : linktext)
				{
					driver.findElement(By.linkText(t)).click();
					if(driver.getTitle().equals(underconstruction))
					{
						System.out.println( t + "is Under Construction");
					}
					else
					{
						System.out.println(t +"is working");
					}
					driver.navigate().back();
					Thread.sleep(3000);
					driver.navigate().refresh();
				}
			}
				
				@Test(enabled = true, priority = 7)
				public void testcase8() throws InterruptedException
				{
					driver.get(URL1);
					JavascriptExecutor js= (JavascriptExecutor)driver;
					//to find the domain and other info using javascript
					String domain = js.executeScript("return document.domain").toString();
					System.out.println(domain);
					// to fetch the innertext of the webpage we use javascript only not the webdriver
					String innertext = js.executeScript("return document.documentElement.innerText").toString();
					System.out.println(innertext);
					// if i want the innertext for any particular element then i use
					String innertextUN = js.executeScript("return document.getElementById('divUsername').innerText").toString();
					System.out.println(innertextUN);
					// if i want to refresh any page using javascript
					js.executeScript("history.go(0)");
					// in order to send data to text box we use
					js.executeScript("document.getElementById('txtUsername').value='Admin'");
					js.executeScript("document.getElementById('txtPassword').value='admin123'");
					System.out.println("password added");
					js.executeScript("document.getElementById('btnLogin').click();");
					Thread.sleep(3000);
					js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click();");
					Thread.sleep(3000);
					// the best way to scroll is through javascript
					//this will scroll till the x and y coordinates
					js.executeScript("window.scrollBy(0,500)");
					//to scroll to the end of the page we use
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(3000);
					//if i want to scroll again just add - sign 
					Thread.sleep(3000);
					js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
					// if i want to scroll to a particular element the i use
					js.executeScript("document.getElementById('ohrmList_chkSelectRecord_9').scrollIntoView()");
					//in order to fetch the innertext of the table we use
					String table = js.executeScript("return document.getElementById('resultTable').innerText").toString();
					System.out.println(table);
					//to fetch the inner HTML of the table
					String HTML = js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
					System.out.println(HTML);
					
				}
			
				
				@AfterTest(enabled=false)
			public void AT()
				{
					driver.close();
				}
		
}