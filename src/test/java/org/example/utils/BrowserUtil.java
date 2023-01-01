package org.example.utils;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtil {
  public static void scrollDown(int pixels){
    JavascriptExecutor js = (JavascriptExecutor) WebDriverGenerator.getWebDriver();
    js.executeScript("window.scrollBy(0,"+pixels+");");
   }
}
