package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.*;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



    /**
     * 1. Create the class MyAccountsTest
     * 1.1 create method with name "selectMyAccountOptions" it has one parameter name
     * "option" of type string
     * 1.2 This method should click on the options whatever name is passed as parameter.
     * (Hint: Handle List of Element and Select options)
     * Write the following test
     * 1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
     * 1.1 Clickr on My Account Link.
     * 1.2 Call the method “selectMyAccountOptions” method and pass the parameter
     * “Register”
     * 1.3 Verify the text “Register Account”.
     * 2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
     * 2.1 Clickr on My Account Link.
     * 2.2 Call the method “selectMyAccountOptions” method and pass the parameter
     * “Login”
     * 2.3 Verify the text “Returning Customer”.
     * 3. Test name verifyThatUserRegisterAccountSuccessfully()
     * 3.1 Clickr on My Account Link.
     * 3.2 Call the method “selectMyAccountOptions” method and pass the parameter
     * “Register”
     * 3.3 Enter First Name
     * 3.4 Enter Last Name
     * 3.5 Enter Email
     * 3.6 Enter Telephone
     * 3.7 Enter Password
     * 3.8 Enter Password Confirm
     * 3.9 Select Subscribe Yes radio button
     * 3.10 Click on Privacy Policy check box
     * 3.11 Click on Continue button
     * 3.12 Verify the message “Your Account Has Been Created!”
     * 3.13 Click on Continue button
     * 3.14 Clickr on My Account Link.
     * 3.15 Call the method “selectMyAccountOptions” method and pass the parameter
     * “Logout”
     * 3.16 Verify the text “Account Logout”
     * 3.17 Click on Continue button
     */
    @Listeners(CustomListeners.class)
    public class MyAccountsTest extends BaseTest {
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        LoginPage loginPage = new LoginPage();
        LogOutPage logOutPage = new LogOutPage();
        AccountPage accountPage = new AccountPage();

        @BeforeMethod(alwaysRun = true)
        public void inIt() {
            homePage = new HomePage();
            registerPage = new RegisterPage();
            loginPage = new LoginPage();
            logOutPage = new LogOutPage();
            accountPage = new AccountPage();
        }


        @Test(groups = {"sanity", "smoke", "regression"})
        public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
            // 1.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
            homePage.selectMyAccountOptions("Register");
            //1.3 Verify the text “Register Account"
            Assert.assertEquals(registerPage.verifyTextRegisterAccount(), "Register Account");
        }


        @Test(groups = {"smoke", "regression"})
        public void verifyUserShouldNavigateToLoginPageSuccessfully() {
            // 2.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
            homePage.selectMyAccountOptions("Login");
            //2.3 Verify the text “Returning Customer”.
            Assert.assertEquals(loginPage.verifyReturningCustomerText(), "Returning Customer");
        }

        @Test(groups = {"regression"})
        public void verifyThatUserRegisterAccountSuccessfully() {
            // 3.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
            homePage.selectMyAccountOptions("Register");
            //3.3 Enter First Name
            registerPage.enterFirstName("Khyati");
            //3.4 Enter Last Name
            registerPage.enterLastName("Savla");
            //3.5 Enter Email
            registerPage.enterEmailId("Khyati123@gmail.com");
            //3.6 Enter Telephone
            registerPage.enterTelephone("04545455454");
            //3.7 Enter Password
            registerPage.enterPassword("456789");
            //3.8 Enter Password Confirm
            registerPage.confirmPassword("456789");
            //3.9 Select Subscribe Yes radio button
            registerPage.clickOnYesRadioButton();
            //3.10 Click on Privacy Policy check box
            registerPage.clickOnPrivatePolicyCheckBox();
            //3.11 Click on Continue button
            registerPage.clickOnContinueButton();
            //3.12 Verify the message “Your Account Has Been Created!”
            Assert.assertEquals(accountPage.verifyYourAccountHasBeenCreated(), "Your Account Has Been Created!");
            //3.13 Click on Continue button
            accountPage.clickOnContinueAfterRegisterAccount();
            //3.14 Click on My Account Link.
            accountPage.clickOnMyAccountLink();
            //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            homePage.selectMyAccountOptions("Logout");
            //3.16 Verify the text “Account Logout”
            Assert.assertEquals(logOutPage.verifyTextAccountLogOut(), "Account Logout");
            //3.17 Click on Continue button
            logOutPage.clickOnContinueAfterLogOut();
        }

        @Test(groups = {"regression"})
        public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
            // 4.1 Click on My Account Link.
            homePage.clickOnMyAccount();
            //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
            homePage.selectMyAccountOptions("Login");
            //4.3 Enter Email address
            loginPage.enterEmailId("Khyati123@gmail.com");
            //4.5 Enter Password
            loginPage.enterPassword("456789");
            //4.6 Click on Login button
            loginPage.clickOnLoginButton();
            //4.7 Verify text “My Account”
            Assert.assertEquals(accountPage.verifyTextMyAccount(), "My Account");
            //4.8 Click on My Account Link.
            accountPage.clickOnMyAccountLink();
            //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            homePage.selectMyAccountOptions("LogOut");
            //4.10 Verify the text “Account Logout”
            Assert.assertEquals(logOutPage.verifyTextAccountLogOut(), "Account Logout");
            //4.11 Click on Continue button
            accountPage.clickOnContinue1();


        }

    }


