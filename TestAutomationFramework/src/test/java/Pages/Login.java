package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import base.BaseTest;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="txt-username") 
	WebElement txt_username;
	@FindBy(id="txt-password") 
	WebElement txt_password;
	@FindBy(id="btn-login") 
	WebElement btn_login;

	public void loginScreen() {

		//HomePage homepage = new HomePage();
		//homepage.clickAppointment();
		driver.findElement(By.id("btn-make-appointment")).click();


	}

	public void enterValidCredentials(String username, String password) {
		
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);

		//driver.findElement(By.id("txt-username")).sendKeys(username);
		//driver.findElement(By.id("txt-password")).sendKeys(password);
		//driver.findElement(By.id("btn-login")).click();

	}

	public void clickLoginButton() {

		//driver.findElement(By.id("btn-login")).click();
		btn_login.click();

	}

}
