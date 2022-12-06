package testcaseler;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html"},
        features = "src/test/resources/OrangeHrm.feature",
        glue="testcaseler",
        tags= "@guru",
        dryRun = false)
public class OrHrRunner {

}
