package StepDefinition;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	public String URL = "https://demoapp.skillrary.com/";
	
	@Given("i should open the browser and navigate to the login page of skillrary")
	public void i_should_open_the_browser_and_navigate_to_the_login_page_of_skillrary() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver" , "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		//Thread.sleep(3000);
		driver.findElement(By.linkText("LOGIN")).click();
	    //throw new io.cucumber.java.PendingException();
	}
	@When("Enter Name {string}")
	public void enter_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	}
	@When("Enter Password {string}")
	public void enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	}
	@When("Click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("last")).click();
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		AssertJUnit.assertEquals(username, string);
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("i should see the admin as {string}")
	public void i_should_see_the_admin_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
		AssertJUnit.assertEquals(admin, string);
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("i should navigate to the page as {string}")
	public void i_should_navigate_to_the_page_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String Register= driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
		 AssertJUnit.assertEquals(Register, string);
	    //throw new io.cucumber.java.PendingException();
	}
}