package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.example.utils.WebDriverGenerator;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue="org.example.stepdefinitions",
    plugin = {"pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt",
    },
    dryRun = false,
    tags = "@dateCalculation"
)
public class FunctionalTesting {
    @AfterClass
    public static void tearDown(){
//        WebDriverGenerator.closeDriver();
    }
}
