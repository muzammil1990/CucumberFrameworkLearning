package cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", //package name to run all feature files
                  glue = "stepdefinition", //step definition package name mapped to feature file
                  dryRun= false) // it will check if the mapping is proper between feature file and step def file
public class TestRunner {

}
