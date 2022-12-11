package org.example.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.example.utils.WebDriverGenerator;

public class Setup {
  @BeforeAll
  public void setUp(){

  }

  @AfterAll
  public void tearDown(){
    WebDriverGenerator.closeDriver();
  }
}
