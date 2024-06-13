package com.nopcommerce.demo.testsuite;
/**
 * 1. Create the class ElectronicsTest
 * Write the following test
 * 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
 * 1.1 Mouse Hover on “Electronics” Tab
 * 1.2 Mouse Hover on “Cell phones” and click
 * 1.3 Verify the text “Cell phones”
 * 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
 * 2.1 Mouse Hover on “Electronics” Tab
 * 2.2 Mouse Hover on “Cell phones” and click
 * 2.3 Verify the text “Cell phones”
 * 2.4 Click on List View Tab
 * 2.5 Click on product name “Nokia Lumia 1020” link
 * 2.6 Verify the text “Nokia Lumia 1020”
 * 2.7 Verify the price “$349.00”
 * 2.8 Change quantity to 2
 * 2.9 Click on “ADD TO CART” tab
 * 2.10 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.12 Verify the message "Shopping cart"
 * 2.13 Verify the quantity is 2
 * 2.14 Verify the Total $698.00
 * 2.15 click on checkbox “I agree with the terms of service”
 * 2.16 Click on “CHECKOUT”
 * 2.17 Verify the Text “Welcome, Please Sign In!”
 * 2.18 Click on “REGISTER” tab
 * 2.19 Verify the text “Register”
 * 2.20 Fill the mandatory fields
 * 2.21 Click on “REGISTER” Button
 * 2.22 Verify the message “Your registration completed”
 * 2.23 Click on “CONTINUE” tab
 * 2.24 Verify the text “Shopping card”
 * 2.25 click on checkbox “I agree with the terms of service”
 * 2.26 Click on “CHECKOUT”
 * 2.27 Fill the Mandatory fields
 * 2.28 Click on “CONTINUE”
 * 2.29 Click on Radio Button “2nd Day Air ($0.00)”
 * 2.30 Click on “CONTINUE”
 * 2.31 Select Radio Button “Credit Card”
 * 2.32 Select “Visa” From Select credit card dropdown
 * 2.33 Fill all the details
 * 2.34 Click on “CONTINUE”
 * 2.35 Verify “Payment Method” is “Credit Card”
 * 2.36 Verify “Shipping Method” is “2nd Day Air”
 * 2.37 Verify Total is “$698.00”
 * 2.38 Click on “CONFIRM”
 * 2.39 Verify the Text “Thank You”
 * 2.40 Verify the message “Your order has been successfully processed!”
 * 2.41 Click on “CONTINUE”
 * 2.42 Verify the text “Welcome to our store”
 * 2.43 Click on “Logout” link
 * 2.44 Verify the URL is “https://demo.nopcommerce.com/”
 */

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//1. Create the class ElectronicsTest
public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    CartPage cartPage = new CartPage();
    LoginCheckOutAsGuestPage loginCheckOutAsGuestPage = new LoginCheckOutAsGuestPage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    OnePageCheckoutOPCBilling onePageCheckoutOPCBilling = new OnePageCheckoutOPCBilling();
    CheckoutCompletedPage checkoutCompletedPage = new CheckoutCompletedPage();

    // 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // 1.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverTo("Electronics");
        // 1.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverToAndClick("Cell phones");
        // 1.3 Verify the text “Cell phones”
        String expectedHeading = "Cell phones";
        Assert.assertEquals(cellPhonesPage.getCellPhoneHeading(), expectedHeading);
    }

    // 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        //2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverTo("Electronics");
        // 2.2 Mouse Hover on “Cell phones” and click
        homePage.mouseHoverToAndClick("Cell phones");
        // 2.3 Verify the text “Cell phones”
        String expectedHeading = "Cell phones";
        Assert.assertEquals(cellPhonesPage.getCellPhoneHeading(), expectedHeading);
        // 2.4 Click on List View Tab
        cellPhonesPage.clickOnListView();
        // 2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnProductNokia();
        // 2.6 Verify the text “Nokia Lumia 1020”
        String expectedProductNameHeading = "Nokia Lumia 1020";
        Assert.assertEquals(nokiaLumia1020Page.getNokiaLumia1020Heading(), expectedProductNameHeading);
        // 2.7 Verify the price “$349.00”
        String expectedPrice = "$349.00";
        Assert.assertEquals(nokiaLumia1020Page.getProductPagePrice(), expectedPrice);
        // 2.8 Change quantity to 2
        nokiaLumia1020Page.changeProductQuantity("2");
        // 2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickOnAddToCardButton();
        // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedNotificationBarSuccessMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(nokiaLumia1020Page.getNotificationBarSuccessMessage(), expectedNotificationBarSuccessMessage);
        // After that close the bar clicking on the cross button.
        nokiaLumia1020Page.clickOnNotificationBarCloseButton();
        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.mouseHoverToShoppingCartLink();
        nokiaLumia1020Page.mouseHoverToAndClickGoToCart();
        // 2.12 Verify the message "Shopping cart"
        String expectedCartHeading = "Shopping cart";
        Assert.assertEquals(cartPage.getShoppingCartHeading(), expectedCartHeading);
        // 2.13 Verify the quantity is 2
        Assert.assertEquals(cartPage.getQuantityAmount(), "2");
        // 2.14 Verify the Total $698.00
        Assert.assertEquals(cartPage.getTotalPriceValue(), "$698.00");
        // 2.15 click on checkbox “I agree with the terms of service”
        cartPage.clickOnTAndCCheckBox();
        // 2.16 Click on “CHECKOUT”
        cartPage.clickOnCheckoutButton();
        // 2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(loginCheckOutAsGuestPage.getWelcomeHeadingMessage(), "Welcome, Please Sign In!");
        // 2.18 Click on “REGISTER” tab
        loginCheckOutAsGuestPage.clickOnRegisterButton();
        // 2.19 Verify the text “Register”
        Assert.assertEquals(registerPage.getRegisterHeading(), "Register");
        // 2.20 Fill the mandatory fields
        registerPage.clickOnGenderRadioButtonMale();
        registerPage.setFirstNameField("Gaurav");
        registerPage.setLastNameField("Patel");
        registerPage.setDobDay("10");
        registerPage.setDobMonth("August");
        registerPage.setDobYear("1990");
        registerPage.setEmailField("abc000@abc.com");
        registerPage.setCompanyField("ABC Ltd.");
        registerPage.setPwdField("abcd@0001");
        registerPage.setConfirmPwdField("abcd@0001");
        // 2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButtonLink();
        // 2.22 Verify the message “Your registration completed”
        Assert.assertEquals(registerResultPage.getRegistrationCompleteStatusMessage(), "Your registration completed");
        // 2.23 Click on “CONTINUE” tab
        registerResultPage.clickOnContinueButton();
        // 2.24 Verify the text “Shopping card”
        Assert.assertEquals(cartPage.getShoppingCartHeading(), "Shopping cart");
        // 2.25 click on checkbox “I agree with the terms of service”
        cartPage.clickOnTAndCCheckBox();
        // 2.26 Click on “CHECKOUT”
        cartPage.clickOnCheckoutButton();
        // 2.27 Fill the Mandatory fields
        onePageCheckoutOPCBilling.selectCountry("Argentina");
        onePageCheckoutOPCBilling.enterCity("London");
        onePageCheckoutOPCBilling.enterAddress1("London Road");
        onePageCheckoutOPCBilling.enterPostCode("N1 5RU");
        onePageCheckoutOPCBilling.enterPhoneNumber("07895462104");
        // 2.28 Click on “CONTINUE”
        onePageCheckoutOPCBilling.clickOnContinueButton();
        // 2.29 Click on Radio Button “2nd Day Air ($0.00)”
        onePageCheckoutOPCBilling.clickOn2ndDayAir();
        // 2.30 Click on “CONTINUE”
        onePageCheckoutOPCBilling.clickOnShippingContinueButton();
        // 2.31 Select Radio Button “Credit Card”
        onePageCheckoutOPCBilling.clickOnCreditCardRadioButton();
        onePageCheckoutOPCBilling.clickOnPaymentContinueButton();
        // 2.32 Select “Visa” From Select credit card dropdown
        onePageCheckoutOPCBilling.setSelectCreditCardTypeDropdown("Visa");
        // 2.33 Fill all the details
        onePageCheckoutOPCBilling.setCardHolderName("Abc patel");
        onePageCheckoutOPCBilling.setCardNumber("4916567672177329");
        onePageCheckoutOPCBilling.setSelectExpMonth("11");
        onePageCheckoutOPCBilling.setSelectExpYear("2025");
        onePageCheckoutOPCBilling.setCardCode("589");
        // 2.34 Click on “CONTINUE”
        onePageCheckoutOPCBilling.clickOnPaymentInfoCotinueButton();
        // 2.35 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethod = "Credit Card";
        Assert.assertEquals(onePageCheckoutOPCBilling.getPaymentMethodText(), expectedPaymentMethod);
        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethod = "2nd Day Air";
        Assert.assertEquals(onePageCheckoutOPCBilling.getActualShippingMethodText(), expectedShippingMethod);
        // 2.37 Verify Total is “$698.00”
        String expectedTotalAmount = "$698.00";
        Assert.assertEquals(onePageCheckoutOPCBilling.getActualTotalAmount(), expectedTotalAmount);
        // 2.38 Click on “CONFIRM”
        onePageCheckoutOPCBilling.clickOnFinalContinueButton();
        // 2.39 Verify the Text “Thank You”
        Assert.assertEquals(checkoutCompletedPage.getThankYouMessage(), "Thank you");
        // 2.40 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkoutCompletedPage.getOrderStatusMessage(),"Your order has been successfully processed!");
        // 2.41 Click on “CONTINUE”
        checkoutCompletedPage.clickOnContinueButtonAfterThankYou();
        // 2.42 Verify the text “Welcome to our store”
        Assert.assertEquals(checkoutCompletedPage.getStoreWelcomeMessage(),"Welcome to our store");
        //2.43 Click on “Logout” link
        checkoutCompletedPage.clickOnLogoutLink();
        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
        Assert.assertEquals(homePage.gettingCurrentURLOfPage(),"https://demo.nopcommerce.com/");
    }
}
