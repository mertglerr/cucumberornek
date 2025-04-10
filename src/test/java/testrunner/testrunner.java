package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="src/test/java/features/login.feature",
        glue = "stepDefinition",
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)


public class testrunner {
}
