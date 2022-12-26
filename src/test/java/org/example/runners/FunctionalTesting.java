package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

    features = "src/test/resources/features",
    glue="org.example.stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html",
        "json:target/cucumber.json"
    },
    dryRun = false,
    tags = "@login"
)
public class FunctionalTesting {

}
