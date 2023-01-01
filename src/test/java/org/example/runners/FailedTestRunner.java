package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.example.utils.WebDriverGenerator;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "@target/rerun.txt",
    glue = "org.example.stepdefinitions"
)
public class FailedTestRunner {

  @AfterClass
  public static void tearDown(){
    WebDriverGenerator.closeDriver();
  }
}
