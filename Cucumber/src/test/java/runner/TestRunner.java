package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
	// Runwith is used when we want to specifically run a file or a class
	@RunWith(Cucumber.class)
	// we give the path of the cucumber class - only partial path
	//glue tells us in which package the implementations are
	@CucumberOptions(features = {"src\\test\\resources\\login\\test.feature"},
	glue = {"StepDefinition"},
	// i want to check if all the methods are implemented or not; whether i missed some of the methods or not
	dryRun = false,
	// Strict = true  -- this is better than dryRun, it also checks whether all the methods are implemented or not
	//tags = "@PositiveTesting",     //it will run only positive cases
	// if i want to see the report then i use plugin
	plugin = {"html:testoutput/aryan.html", "json:testoutput/aryan.json", "junit:testoutput/aryan.xml"}
)
public class TestRunner {

}
