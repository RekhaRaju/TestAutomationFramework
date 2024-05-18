package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= "/RekhaSelenium/TestAutomationFramework/src/test/resources/Features",
glue= {"StepDefinitions"},
plugin= {"pretty", "html:target/htmlreport.html"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
