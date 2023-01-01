package org.example.runners;

import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import junit.framework.TestResult;
import org.example.utils.ScreenshotRuleUtil;
import org.example.utils.WebDriverGenerator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue="org.example.stepdefinitions",
    plugin = {"pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"
    },
    dryRun = false,
    tags = "@wiki"
)
public class FunctionalTesting {
}
