package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MacBookProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;


    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement addToCartSuccessMessage;

    @CacheLookup
    @FindBy( xpath ="//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLinkInMessage;



    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getCartAddSuccessfulMessage() {
        return getTextFromElement(addToCartSuccessMessage);
    }

    public void clickOnShoppingCartLinkInMessage() {
        clickOnElement(shoppingCartLinkInMessage);
    }
}