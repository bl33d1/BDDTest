package org.example.stepdefinitions.edu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.AddNewTrainingPage;
import org.example.utils.BrowserUtil;
import org.example.utils.WebDriverGenerator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateNewTraining {
  WebDriver driver;
  AddNewTrainingPage trainingPage;

  @Given("i navigate to {string}")
  public void i_navigate_to(String url) {
    driver = WebDriverGenerator.getWebDriver();
    driver.get(url);
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    trainingPage = new AddNewTrainingPage(driver);
  }

  @When("i provide the email {string} and click next")
  public void i_provide_the_email_and_click_next(String email) {
    trainingPage.usernameInput.sendKeys(email);
    trainingPage.usernameNextButton.click();
  }

  @When("i provide the password {string}")
  public void i_provide_the_password(String string) throws InterruptedException {
    Thread.sleep(2000);
    trainingPage.passwordInput.sendKeys(string);
    driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
  }

  @When("i click the button No for staying signed in")
  public void i_click_the_button_no_for_staying_signed_in() {
    trainingPage.staySignedInNoButton.click();
  }

  @When("i click the menu button")
  public void i_click_the_menu_button() {
    trainingPage.openMenuButton.click();
  }

  @When("i click on My Organization and next Training list button")
  public void i_click_on_my_organization_and_next_training_list_button() {
    trainingPage.myOrganizationMenuOption.click();
    driver.findElement(By.xpath("/html/body/app-root/app-bases/div/div/div/div/app-my-organisation/div")).click();
  }

  @When("i click on New Training button")
  public void i_click_on_new_training_button() {
    trainingPage.newTrainingButton.click();
  }

  @When("i fill out the text fields")
  public void i_fill_out_the_text_fields() {
    trainingPage.fillFields();
  }







  @When("i click the Add new Class button")
  public void i_click_the_add_new_class_button() {

    BrowserUtil.scrollDown(2023);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[2]/button")));
//    trainingPage.addNewClassButton.click();
    String jsClickCommand = "document.querySelector('body > app-root > app-bases > div > div > div > div > app-create-training > div > div > form > div.d-flex.justify-content-between.align-items-center.mb-4 > button').click()";
    JavascriptExecutor js = (JavascriptExecutor) WebDriverGenerator.getWebDriver();
    js.executeScript(jsClickCommand);
  }
  @When("i click the newly created class to expand it")
  public void i_click_the_newly_created_class_to_expand_it() {
    driver.findElement(By.xpath("//*[@id=\"ngb-panel-2-header\"]/button")).click();
  }
  @When("i fill out the validityInYears input with {int}")
  public void i_fill_out_the_validity_in_years_input_with(Integer int1) {
    trainingPage.validityInYears.sendKeys(int1.toString());
  }
//  @When("i set the Month expire checkbox to {string}")
//  public void i_set_the_month_expire_checkbox_to(String string) {
//    if(string.equals("true") && !trainingPage.monthExpire.isSelected()){
//      trainingPage.monthExpire.click();;
//    }
//  }
  @When("i set endDate to {string}")
  public void i_set_end_date_to(String date) {
    trainingPage.endDate.sendKeys(date);
  }
  @Then("the ExpirationOfCertificateConfirmation should be {string}")
  public void the_expiration_of_certificate_confirmation_should_be(String date) {

    BrowserUtil.scrollDown(2023);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[5]/div/input")));

    String actualResults = trainingPage.calculatedDate.getAttribute("value");
    Assert.assertEquals(date, actualResults);
  }
}
