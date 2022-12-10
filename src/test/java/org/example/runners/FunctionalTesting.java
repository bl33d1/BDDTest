package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(

    features = "src/test/resources/features",
    glue="org.example.stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html",
        "json:target/cucumber.json"
    },
    dryRun = false,
    tags = "@training"
)
public class FunctionalTesting {

}
