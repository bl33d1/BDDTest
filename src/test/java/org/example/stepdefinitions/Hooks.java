package org.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.utils.WebDriverGenerator;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
  @Before
  public void setUp(){

  }

  @After
  public void tearDownScenario(Scenario scenario){
    // Cast WebDriver instance to TakesScreenshot interface
    // Call getScreenShotAs method and output type as bytes (save to byte array)
    if(scenario.isFailed()){
      byte [] image = ((TakesScreenshot) WebDriverGenerator.getWebDriver()).getScreenshotAs(OutputType.BYTES);

      // attach the image in the scenario html report
      scenario.attach(image,"image/png", scenario.getName());
    }
  }

  @AfterClass
  public static void tearDown(){
    WebDriverGenerator.closeDriver();
  }
}
