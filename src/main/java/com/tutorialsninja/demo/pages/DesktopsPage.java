package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(tagName = "h2")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement productPath;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement productHPLP3065;

    public String getDesktopsText() {
        return getTextFromElement(desktopsText);
    }

    public void clickOnSortBy(String sort) {
        selectByVisibleTextFromDropDown(sortBy,sort);
    }

    public void clickOnHPLP3065() {
        clickOnElement(productHPLP3065);
    }

    public void selectProduct (String product){
        mouseHoverToElement(productPath);
    }
}