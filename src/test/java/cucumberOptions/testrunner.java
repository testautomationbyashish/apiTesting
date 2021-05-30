package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/features"},
	format={"pretty","html:target/reports/test-report"},

		glue = {"stepdefs/stepdefsAPItest"} ,stepNotifications = true)
public class TestRunner {

}
