package org.example.stepdefinitions.edu;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.AddNewTrainingPage;
import org.example.utils.BrowserUtil;
import org.example.utils.WebDriverGenerator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ExpireDateCalculation {
  WebDriver driver;
  AddNewTrainingPage trainingPage;

  @BeforeClass
  public void setUp(){
    driver = WebDriverGenerator.getWebDriver();
    trainingPage = new AddNewTrainingPage(driver);
  }

}
