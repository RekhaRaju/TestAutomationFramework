package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.*;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	@BeforeTest
	public void setUp() throws IOException {
		if (driver == null) {
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
		}
	}

	@AfterTest
	public void tearDown() {

		driver.close();

	}

}
