package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HP LP3065']")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMsgForMacBook;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(id = "//input[@id='input-quantity']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement textMacBook;

    public String verifyProductText() {
        return getTextFromElement(productText);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifySuccessText() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public void enterQuantity(String qty) {
        sendTextToElement(quantity, "1");
    }

    public String verifyTextMacBook() {
        return getTextFromElement(textMacBook);
    }

    public String verifySuccessMsgForMacBook() {
        return getTextFromElement(successMsgForMacBook);
    }

    public void datePicker() {
        String year = "2023";
        String month = "November";
        String date = "27";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

}
