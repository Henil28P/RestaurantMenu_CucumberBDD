package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// Test Runner class file to run our Cucumber test after all Step definitions methods are implemented
@RunWith(Cucumber.class) // define @RunWith annotation and it will import a Cucumber API JUnit
// define a few Cucumber options
// this class will link the Feature file with the step definitions
@CucumberOptions(
		features={"src/test/java/restaurantmenu/cucumberbddproject/features"}, // path of where all features are located (in the "features" package)
		glue={"stepdefinitions"}, // package name of where the step definitions are located
		tags= {"@ListofStrings"}, // to filter scenario on tag name of that scenario
		plugin={"pretty",
				"html:target/SystemTestReports/html",
				"json:target/SystemTestReports/json/report.json",
				"junit:target/SystemTestReports/junit/report.xml"}, // use a plugin "pretty" which will be used when generating nice looking outputs
		dryRun=false, // default value of dryRun parameter is false
		monochrome=true // for more readable outputs and removes all special characters
		)
// No implementation in this class as it tells the build tool or Java compiler to use Cucumber tests (CucumberOptions) and it links the feature file with the glue (stepdefinitions)
// Note: All the parameter values of @CucumberOptions are multiple values or an array of strings (eg. for glue parameter, we can specify multiple package names as step definitions could be in multiple files sometimes)
// Save this test runner file and run it as a JUnit test
public class MenuManagementTest {

}
