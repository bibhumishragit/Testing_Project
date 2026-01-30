package TestRunner;

//import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.*;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/Features/dataTable.feature",       // Path to your .feature files
        glue = "Stepdefinition",                        // Package containing step definitions
        plugin = {
                "pretty",                                   // Console output
                "html:target/cucumber-reports/html",        // HTML report
                "json:target/cucumber-reports/report.json"  // JSON report
        },
        monochrome = true,                              // Clean console output
        dryRun = false                                 // Set true to validate steps without executing
        //tags = "@SmokeTest"                             // Run scenarios with this tag
)

public class CucumberRunner {}