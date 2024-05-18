package testcases;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {
	@Test(dataProvider="testdata")
	public static void validLoginTest(String username, String password) {

		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys(username);
		driver.findElement(By.id("txt-password")).sendKeys(password);
		driver.findElement(By.id("btn-login")).click();

	}

	@DataProvider(name = "testdata")
	public Object[][] loginTestData() {
		return new Object[][] { { "John Doe", "ThisIsNotAPassword" }, { "JohnDoe", "ThisIsNotAPasswor" } };

	}

}
