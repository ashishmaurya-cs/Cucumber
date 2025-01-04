package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith
@io.cucumber.testng.CucumberOptions(features = "src/main/resources/feature", glue = { "/stepdef" })
public class LoginRunner extends AbstractTestNGCucumberTests{

}
