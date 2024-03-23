package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definitions {
WebDriver driver;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	   
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		
	}

	@When("the user enters valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String email, String pwd) {
	   
		driver.findElement(By.id("user-name")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	

	@Then("the user should see logo")
	public void the_user_should_see_logo() {
	    
		boolean welcomestatus=driver.findElement(By.className("app_logo")).isDisplayed();
		Assert.assertEquals(welcomestatus, true);
		driver.quit();
	}

}
