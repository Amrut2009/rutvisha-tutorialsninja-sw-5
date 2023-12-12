package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement textRegisterAccount;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephoneField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement yesRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void enterFirstName (String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName (String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void enterEmailId (String email){
        sendTextToElement(emailField,email);
    }
    public void enterTelephone (String telephone){
        sendTextToElement(telephoneField,telephone);
    }
    public void enterPassword (String password){
        sendTextToElement(passwordField,password);
    }
    public void confirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnYesRadioButton(){
        clickOnElement(yesRadioButton);
    }
    public void clickOnPrivatePolicyCheckBox (){
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnContinueBtn(){
        clickOnElement(continueBtn);
    }

    public String verifyTextRegisterAccount (){
        return getTextFromElement(textRegisterAccount);
    }

}
