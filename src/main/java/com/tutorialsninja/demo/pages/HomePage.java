package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement desktopTab;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement laptopsAndNoteBooks;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllComponents')]")
    WebElement showAllComponents;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-caret-down']")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement poundSterling;

    public void selectMenu(String menu) {
        List<WebElement> allMenu = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
        for (WebElement option : allMenu) {
            if (menu.equalsIgnoreCase(option.getText())) {
                option.click();
                break;
            }
        }
    }

    public void mouseHooverOnDesktops() {
        selectMenu("Desktops");
    }

    public void clickOnShowAllDesktops() {
        clickOnElement(showAllDesktops);
    }

    public void mouseHooverOnLaptopsAndNotebooks() {
        selectMenu("Laptops & Notebooks");
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(showAllLaptopsAndNotebooks);
    }

    public void mouseHooverOnComponents() {
        selectMenu("Components");
    }

    public void clickOnComponents() {
        clickOnElement(components);
    }

    public void clickOnShowAllComponents() {
        clickOnElement(showAllComponents);
    }

    public void clickOnCurrencyDropDown() {
        clickOnElement(currency);
    }

    public void clickOnPoundSterling() {
        clickOnElement(poundSterling);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class = 'list-inline']//a"));
        for (WebElement list : options) {
            if (option.equalsIgnoreCase(list.getText())) {
                list.click();
                break;
            }
        }
    }

    public void clickOnMyAccount() {
        selectMyAccountOptions("My Account");
    }// Click on Login Option from down options

    public void clickOnDesktopsTab() {
        mouseHoverToElementAndClick(desktopTab);
    }

    public void clickOnLaptopsAndNoteBooksTab() {
        mouseHoverToElementAndClick(laptopsAndNoteBooks);
    }
}