package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooksPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement textLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook']")
    WebElement selectProductMacBook;

    public String verifyTextLaptopsAndNotebooks() {
        return getTextFromElement(textLaptopsAndNotebooks);
    }

    public void clickOnSortBy(String sort) {
        selectByVisibleTextFromDropDown(sortBy, sort);
    }

    public void clickOnMacBook() {
        clickOnElement(selectProductMacBook);
    }
}


