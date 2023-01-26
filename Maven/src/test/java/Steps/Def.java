package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Def {
	WebDriver driver;
	public static String URL = "https://opensource-demo.orangehrmlive.com";

	@Given("i should go to login page")
	public void i_should_go_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriverManager.chromedriver().setup();
		//To create new instance of browser every time we run the test.
		//whenever new instance of browser comes up, it shouldd be connected to driver.
		driver = new ChromeDriver();
		//to maximize the window of browser.
		driver.manage().window().maximize();
		driver.get(URL);
	    //throw new io.cucumber.java.PendingException();
	}
	@When("enter username {string}")
	public void enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	    //throw new io.cucumber.java.PendingException();
	}
	@When("enter the password {string}")
	public void enter_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
	    //throw new io.cucumber.java.PendingException();
	}
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

	    //throw new io.cucumber.java.PendingException();
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
	    //throw new io.cucumber.java.PendingException();
	}


}
