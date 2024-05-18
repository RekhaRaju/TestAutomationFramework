package StepDefinitions;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Login;
//import base.BaseTest;
import io.cucumber.java.en.*;

public class LoginSteps {
WebDriver driver;
Login lp;
	

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.id("btn-make-appointment")).click();
		
	}

	@When("User Enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		
		 lp = new Login(driver);
		lp.enterValidCredentials(username,password);
	   
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		
	 lp = new Login(driver);
		lp.clickLoginButton();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		lp = new Login(driver);
		lp.loginScreen();;
	    
	}
	
	

}
