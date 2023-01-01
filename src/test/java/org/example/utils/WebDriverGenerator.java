package org.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverGenerator {

  private WebDriverGenerator(){}

  private static WebDriver driver;

  public static WebDriver getWebDriver(){

    if(driver == null){

          ChromeOptions options = new ChromeOptions();
          //options.setHeadless(true);
          options.setBinary("C:\\Users\\bllaca.bledi\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver(options);
          //driver.manage().window().maximize();
          return driver;
    }
    return driver;
  }

  public static void closeDriver(){
    driver.quit();
  }

}
