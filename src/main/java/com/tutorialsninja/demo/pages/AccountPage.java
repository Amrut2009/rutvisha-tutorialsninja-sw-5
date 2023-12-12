package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement myAccountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement textMyAccount;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueAfterRegisterAccount;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueAfterLogOut;

    @CacheLookup
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='My Account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[@class= 'btn btn-primary']")
    WebElement continueButton1;

    public String verifyYourAccountHasBeenCreated() {
        return getTextFromElement(myAccountCreatedText);
    }

    public String verifyTextMyAccount() {
        return getTextFromElement(textMyAccount);
    }

    public void clickOnContinueAfterRegisterAccount() {
        clickOnElement(continueAfterRegisterAccount);
    }

    public void clickOnContinueAfterLogOut() {
        clickOnElement(continueAfterLogOut);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnContinue1() {
        clickOnElement(continueButton1);
    }
}