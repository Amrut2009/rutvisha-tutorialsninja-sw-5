package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement textAccountLogOut;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement continueAfterLogOut;

    public String verifyTextAccountLogOut() {
        return getTextFromElement(textAccountLogOut);
    }

    public void clickOnContinueAfterLogOut() {
        clickOnElement(continueAfterLogOut);

    }
}
