package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// Test Runner class file to run our Cucumber test after all Step definitions methods are implemented
@RunWith(Cucumber.class) // define @RunWith annotation and it will import a Cucumber API JUnit
// define a few Cucumber options
//this class will link the Feature file with the step definitions
@CucumberOptions(
		features="src/test/java/restaurantmenu/cucumberbddproject/features", // path of where all features are located (in the "features" package)
		glue="stepdefinitions" // package name of where the step definitions are located
		)
// The above 2 parameters of "features" and "glue"
// No implementation in this class as it tells the build tool or Java compiler to use Cucumber tests (CucumberOptions) and it links the feature file with the glue (stepdefinitions)
// Save this test runner file and run it as a JUnit test
public class MenuManagementTest {

}
