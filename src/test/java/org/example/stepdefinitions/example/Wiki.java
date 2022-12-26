package org.example.stepdefinitions.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.WebDriverGenerator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wiki {
  WebDriver driver;
  @Given("I navigate to {string}")
  public void i_navigate_to(String string) {
    driver = WebDriverGenerator.getWebDriver();
    driver.get(string);
  }
  @When("I enter search term {string}")
  public void i_enter_search_term(String string) {
    driver.findElement(By.id("searchInput")).sendKeys(string);
  }
  @When("i hit the search button")
  public void i_hit_the_search_button() {
    driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
  }
  @Then("The title is equal to {string}")
  public void the_title_is_equal_to(String string) {
    Assert.assertEquals(string, driver.getTitle());
  }
}
