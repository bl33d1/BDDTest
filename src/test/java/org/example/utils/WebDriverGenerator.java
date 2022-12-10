package org.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverGenerator {

  private WebDriverGenerator(){}

  private static WebDriver driver;

  public static WebDriver getWebDriver(){

    if(driver == null){
      ChromeOptions options = new ChromeOptions();
      options.setHeadless(true);
      WebDriverManager.chromedriver().setup();
      //headless
      driver = new ChromeDriver(options);

      //default
      //driver = new ChromeDriver();
    }
    return driver;
  }

}
