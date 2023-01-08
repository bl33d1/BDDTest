package org.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class WebDriverGenerator {

  private WebDriverGenerator(){}

  private static WebDriver driver;

  public static WebDriver getWebDriver(){

    if(driver == null){

      // TODO: Set browser type based on configuration properties file

      String browser = ConfigurationReader.getProperty("browser");

      switch (browser){
        case "chrome":
          ChromeOptions options = new ChromeOptions();
          options.setHeadless(true);
          options.setBinary("C:\\Users\\bllaca.bledi\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          return driver;
        case "firefox":
          FirefoxOptions optionsF = new FirefoxOptions();
          //options.setHeadless(true);
          //optionsF.setBinary("C:\\Users\\bllaca.bledi\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
          WebDriverManager.firefoxdriver().setup();
          driver = new FirefoxDriver(optionsF);
          //driver.manage().window().maximize();
          return driver;
      }

    }
    return driver;
  }

  public static void closeDriver(){
    driver.quit();
    driver = null;
  }

}
