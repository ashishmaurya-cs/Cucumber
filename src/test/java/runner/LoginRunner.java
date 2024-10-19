package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature"
,glue={"/stepdef"}
)
public class LoginRunner {

	
}
