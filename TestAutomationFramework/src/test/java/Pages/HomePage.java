package Pages;

import org.openqa.selenium.By;
import base.BaseTest; 


public class HomePage extends BaseTest {
	By makeAppointment = By.id("btn-make-appointment");


	public  void  homepageBeforeLogin() {
		
		driver.findElement(makeAppointment).isDisplayed();
	}
	public  void  clickAppointment() {
		
		//driver.findElement(makeAppointment).isDisplayed();
		driver.findElement(makeAppointment).click();
		
	}
public  void  homepageAfterLogin() {
		
		driver.findElement(makeAppointment).isDisplayed();
	}


}
