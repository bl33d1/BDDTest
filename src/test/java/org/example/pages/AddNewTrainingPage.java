package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddNewTrainingPage extends BasePage{

  public AddNewTrainingPage(WebDriver driver){
    super(driver);
  }
  @FindBy(xpath="//*[@id=\"i0116\"]")
  public WebElement usernameInput;
  @FindBy(xpath="//*[@id=\"idSIButton9\"]")
  public WebElement usernameNextButton;
  @FindBy(xpath="//*[@id=\"i0118\"]")
  public WebElement passwordInput;
  @FindBy(xpath="//*[@id=\"idBtn_Back\"]")
  public WebElement staySignedInNoButton;
  @FindBy(xpath="/html/body/app-root/app-bases/div/app-sidebar/nav/div[1]/div")
  public WebElement openMenuButton;
  @FindBy(xpath="//*[@id=\"sidebar-menu\"]/li[4]/a")
  public WebElement myOrganizationMenuOption;
  @FindBy(xpath="  /html/body/app-root/app-bases/div/div/div/div/app-training-list/div/form/div/div[1]/button")
  public WebElement newTrainingButton;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[1]")
  public WebElement title;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/textarea")
  public WebElement description;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[2]")
  public WebElement shortDescription;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[3]")
  public WebElement target;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[4]")
  public WebElement targetGroup;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/select[1]")
  public WebElement trainingType;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/select[2]")
  public WebElement isExternal;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[5]")
  public WebElement requiredMaterial;
  @FindBy(xpath="element")
  public WebElement element;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[6]")
  public WebElement trainingPreparation;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[7]")
  public WebElement additionalPreperation;
  @FindBy(xpath="//*[@id=\"Certification\"]")
  public WebElement certification;
  @FindBy(xpath="//*[@id=\"flexSwitchCheckDefault\"]")
  public WebElement acceptsExtrenalCertificate;
  //check education trainer
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/div[2]/ngx-bootstrap-multiselect/div/button")
  public WebElement educationTrainerButton;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/div[2]/ngx-bootstrap-multiselect/div/div/a[1]/span/input")
  public WebElement EducationTrainerFirstOptionCheckbox;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/div[3]/div[1]/input")
  public WebElement visibleDuration;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/div[3]/div[1]/input")
  public WebElement duration;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/div[4]/div[1]/input")
  public WebElement validityInYears;
  @FindBy(xpath="//*[@id=\"endOfTheMonthExpire2\"]")
  public WebElement monthExpire;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[8]")
  public WebElement expireReminderMonth;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[9]")
  public WebElement pricePersonEstimation;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[1]/input[10]")
  public WebElement numberOfParticipants;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[1]/ngx-bootstrap-multiselect/div/button")
  public WebElement trainingProfilesButton;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[1]/ngx-bootstrap-multiselect/div/div/a[1]/span/input")
  public WebElement trainingProfilesFirstOptionCheckBox;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[2]/ngx-bootstrap-multiselect/div/button")
  public WebElement trainingTopicButton;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[2]/ngx-bootstrap-multiselect/div/div/a[1]/span/input")
  public WebElement trainingTopicFirstOptionCheckBox;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[3]/ngx-bootstrap-multiselect/div/button")
  public WebElement categoriesButton;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[3]/ngx-bootstrap-multiselect/div/div/a[1]/span/input")
  public WebElement categoriesFirstOptionCheckBox;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[4]/ngx-bootstrap-multiselect/div/button")
  public WebElement brandsButton;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/div[4]/ngx-bootstrap-multiselect/div/div/a[1]/span/input")
  public WebElement brandsFirstOptionCheckBox;
  @FindBy(xpath="//*[@id=\"registrationPerTraining\"]")
  public WebElement registration;
  @FindBy(xpath="//*[@id=\"unsubscribeId\"]")
  public WebElement unsubscribe;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[2]/input")
  public WebElement contactForQuestions;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[1]/div[3]/input")
  public WebElement neccessaryEquipment;

  // Class Section
  @FindBy(xpath = "/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[2]/button")
  public WebElement addNewClass;
  @FindBy(xpath = "//div[@formarrayname=\"classes\"]")
  public List<WebElement> allClassesList;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/select[1]")
  public WebElement classVariation;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/input[1]")
  public WebElement classDuration;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/select[2]")
  public WebElement classLanguage;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/select[3]")
  public WebElement selectTrainer;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/input[2]")
  public WebElement trainingLocation;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/div[1]/div[2]/input")
  public WebElement participantsMin;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/div[1]/div[3]/input")
  public WebElement participantsMax;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/div[2]/ngx-bootstrap-multiselect/div/button")
  public WebElement classEmployeeButton;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[1]/div[2]/ngx-bootstrap-multiselect/div/div/a[1]/span/input")
  public WebElement classEmployeeFirstOptionCheckBox;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[1]/div/select")
  public WebElement selectPriceType;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[2]/div[1]/select")
  public WebElement currencyType;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[2]/div[2]/input")
  public WebElement cost;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[6]/div/div/label[1]")
  public WebElement certificationClass;
  @FindBy(xpath="//*[@id=\"classStatus\"]")
  public WebElement classStatus;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[3]/div[1]/input")
  public WebElement classPriceValidFrom;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[3]/div[2]/input")
  public WebElement classPriceValidTo;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[4]/div[1]/input")
  public WebElement classDurationFrom;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[4]/div[2]/input")
  public WebElement classDurationTo;
  @FindBy(xpath="/html/body/app-root/app-bases/div/div/div/div/app-create-training/div/div/form/div[2]/button")
  public WebElement addNewClassButton;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[4]/div[2]/input")
  public WebElement endDate;
  @FindBy(xpath="//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div[5]/div/input")
  public WebElement calculatedDate;

  public void fillFields(){
    title.sendKeys("Test title");
    description.sendKeys("Test description");
    shortDescription.sendKeys("Test shDescription");
    target.sendKeys("Test target");
    targetGroup.sendKeys("Test target group");
    new Select(trainingType).selectByIndex(1);
    new Select(isExternal).selectByIndex(1);
    requiredMaterial.sendKeys("requiredMaterial");
    trainingPreparation.sendKeys("trainingPreparation");
    additionalPreperation.sendKeys("additionalPreperation");
    visibleDuration.sendKeys("visibleDuration");
    duration.sendKeys("2");
    validityInYears.sendKeys("validityInYears");
    expireReminderMonth.sendKeys("expireReminderMonth");
    pricePersonEstimation.sendKeys("pricePersonEstimation");
    numberOfParticipants.sendKeys("numberOfParticipants");
    contactForQuestions.sendKeys("contactForQuestions");
  }

}
