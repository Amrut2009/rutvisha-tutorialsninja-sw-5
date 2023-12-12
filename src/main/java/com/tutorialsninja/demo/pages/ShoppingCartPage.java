package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'HP LP3065')])[2]")
    WebElement textHPLP3065;

    @CacheLookup
    @FindBy(xpath = "//small[normalize-space()='Delivery Date:2011-04-22']")
    WebElement textDeliveryDate;

    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[6]")
    WebElement totalAmount;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'MacBook')])[2]")
    WebElement textMacBook;

    @CacheLookup
    @FindBy(xpath = "(//input[@name='quantity[85528]'])[1]")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "(//i[@class='fa fa-refresh'])[1]")
    WebElement updateSymbol;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement textModifiedCart;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOut;

    public String verifyTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String verifyTextHPLP3065() {
        return getTextFromElement(textHPLP3065);
    }

    public String verifyTextDeliveryDate() {
        return getTextFromElement(textDeliveryDate);
    }

    public String verifyModelName() {
        return getTextFromElement(modelName);
    }

    public String verifyTotalAmount() {
        return getTextFromElement(totalAmount);
    }

    public String verifyTextMacBook() {
        return getTextFromElement(textMacBook);
    }

    public void clickOnUpdateSymbol() {
        clickOnElement(updateSymbol);
    }

    public String verifyTheModifyCartText() {
        return getTextFromElement(textModifiedCart);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }


    public void changeQty() {
        quantity.clear();
        sendTextToElement(quantity, "2");
    }



}
