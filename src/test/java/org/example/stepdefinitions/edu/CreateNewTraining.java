package org.example.stepdefinitions.edu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.AddNewTrainingPage;
import org.example.utils.WebDriverGenerator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CreateNewTraining {
  WebDriver driver;
  AddNewTrainingPage trainingPage;
  @Given("i navigate to {string}")
  public void i_navigate_to(String url) {
    driver = WebDriverGenerator.getWebDriver();
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
  @When("i click on My Organization and next Training list bootstrapbtn")
  public void i_click_on_my_organization_and_next_training_list_bootstrapbtn() {
    trainingPage.myOrganizationMenuOption.click();
    driver.findElement(By.xpath("/html/body/app-root/app-bases/div/div/div/div/app-my-organisation/div")).click();
  }
  @When("i click on New Training button")
  public void i_click_on_new_training_button() {
    trainingPage.newTrainingButton.click();
  }
  @When("i fill out the text fields")
  public void i_fill_out_the_text_fields() {
    trainingPage.title.sendKeys("Test title");
    trainingPage.description.sendKeys("Test description");
    trainingPage.shortDescription.sendKeys("Test shDescription");
    trainingPage.target.sendKeys("Test target");
    trainingPage.targetGroup.sendKeys("Test target group");
    trainingPage.requiredMaterial.sendKeys("requiredMaterial");
    trainingPage.trainingPreparation.sendKeys("trainingPreparation");
    trainingPage.additionalPreperation.sendKeys("additionalPreperation");
    trainingPage.visibleDuration.sendKeys("visibleDuration");
    trainingPage.duration.sendKeys("2");
    trainingPage.validityInYears.sendKeys("validityInYears");
    trainingPage.expireReminderMonth.sendKeys("expireReminderMonth");
    trainingPage.pricePersonEstimation.sendKeys("pricePersonEstimation");
    trainingPage.numberOfParticipants.sendKeys("numberOfParticipants");
    trainingPage.contactForQuestions.sendKeys("contactForQuestions");

  }
}
