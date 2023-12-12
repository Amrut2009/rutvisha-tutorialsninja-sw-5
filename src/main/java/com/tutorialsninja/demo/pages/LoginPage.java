package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomer;

    @CacheLookup
    @FindBy(name = "email")
    WebElement emailId;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passWord;

    @CacheLookup
    @FindBy(xpath = "input[value='Login']")
    WebElement loginButton;

    public void enterEmailId(String email) {
        sendTextToElement(emailId, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passWord, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyReturningCustomerText() {
        return getTextFromElement(returningCustomer);
    }
}

