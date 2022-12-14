package org.example.hooks;

import io.cucumber.java.BeforeAll;
import org.example.utils.WebDriverGenerator;
import org.junit.jupiter.api.AfterAll;

public class Setup {
  @BeforeAll
  public void setUp(){

  }

  @AfterAll
  public static void tearDown(){
    WebDriverGenerator.closeDriver();
  }
}
