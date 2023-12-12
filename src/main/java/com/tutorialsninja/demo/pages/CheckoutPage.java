package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement textCheckOut;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement textNewCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckOut;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement emailId;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonLast;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement comments;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement agree;

    @CacheLookup
    @FindBy(xpath = "//input[@name = 'agree']")
    WebElement guestContinueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-warning alert-dismissible']")
    WebElement warningText;

    public String verifyCheckOutText() {
        return getTextFromElement(textCheckOut);
    }

    public String verifyNewCustomerText() {
        return getTextFromElement(textNewCustomerText);
    }

    public void clickOnGuestCheckOut() {
        clickOnElement(guestCheckOut);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailId, email);
    }

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
    }

    public void enterAddress1(String value) {
        sendTextToElement(address1, value);
    }

    public void enterCity(String value) {
        sendTextToElement(city, value);
    }

    public void enterPostCode(String value) {
        sendTextToElement(postcode, value);
    }

    public void selectCountry(String value) {
        selectByVisibleTextFromDropDown(country, value);
    }

    public void selectRegion(String value) {
        selectByVisibleTextFromDropDown(region, value);
    }

    public void clickOnLastContinueCheckOutButton() {
        clickOnElement(continueButtonLast);
    }

    public void enterComments(String value) {sendTextToElement(comments, value);}

    public void clickOnAgree() {
        clickOnElement(agree);
    }

    public void clickOnGuestContinue() {
        clickOnElement(guestContinueButton);
    }

    public String verifyPaymentWarningText() {
        return getTextFromElement(warningText);
    }
}