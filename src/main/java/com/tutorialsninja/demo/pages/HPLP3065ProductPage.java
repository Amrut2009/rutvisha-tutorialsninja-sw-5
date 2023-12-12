package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HPLP3065ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath ="//button[@id='button-cart']")
            WebElement  addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement addToCartSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
            WebElement shoppingCartLinkInMessage;


    public void selectDeliveryDate(String day, String month, String year) throws InterruptedException {
        clickOnElement(By.xpath("//i[@class='fa fa-calendar']"));
        clickOnElement(By.xpath("//div[@class='datepicker-days']//th[@colspan='5']"));

        while(true){
            String y = getTextFromElement(By.xpath("//div[@class='datepicker-months'] //th[@class='picker-switch']"));
            if(y.equalsIgnoreCase(year)){
                break;
            } else {
                clickOnElement(By.xpath("//div[@class='datepicker-months']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        clickOnElement(By.xpath("//span[normalize-space()='"+month+"']"));
        Thread.sleep(200);
        clickOnElement(By.xpath("//td[@class = 'day' and text() = '"+day+"']"));
    }

    public void sendDataToQuantityField(String quantity) {
        sendTextToElement(quantityField, quantity);
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