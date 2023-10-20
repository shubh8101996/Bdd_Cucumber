package runnwe;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "featureFile\\login.feature", // Location of your feature files
    glue = "StepDef", // Package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for formatting the test results
)
public class TestRunner {

}
