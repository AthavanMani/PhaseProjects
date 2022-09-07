package in.Sauce.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "Features"
				,glue = "in.Sauce.testscripts"
				,plugin = {"progress", "html:target/Cucumber.html"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
