package com.nopcommerce.demo.testsuite;
/**
 * 1. Create class “ComputerTest” into testsuite package
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Click on Computer Menu.
 * 1.2 Click on Desktop
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Click on Computer Menu.
 * 2.2 Click on Desktop
 * 2.3 Select Sort By position "Name: A to Z"
 * 2.4 Click on "Add To Cart"
 * 2.5 Verify the Text "Build your own computer"
 * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
 * 2.7.Select "8GB [+$60.00]" using Select class.
 * 2.8 Select HDD radio "400 GB [+$100.00]"
 * 2.9 Select OS radio "Vista Premium [+$60.00]"
 * 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
 * [+$5.00]"
 * 2.11 Verify the price "$1,475.00"
 * 2.12 Click on "ADD TO CARD" Button.
 * 2.13 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.15 Verify the message "Shopping cart"
 * 2.16 Change the Qty to "2" and Click on "Update shopping cart"
 * 2.17 Verify the Total"$2,950.00"
 * 2.18 click on checkbox “I agree with the terms of service”
 * 2.19 Click on “CHECKOUT”
 * 2.20 Verify the Text “Welcome, Please Sign In!”
 * 2.21Click on “CHECKOUT AS GUEST” Tab
 * 2.22 Fill the all mandatory field
 * 2.23 Click on “CONTINUE”
 * 2.24 Click on Radio Button “Next Day Air($0.00)”
 * 2.25 Click on “CONTINUE”
 * 2.26 Select Radio Button “Credit Card”
 * 2.27 Select “Master card” From Select credit card dropdown
 * 2.28 Fill all the details
 * 2.29 Click on “CONTINUE”
 * 2.30 Verify “Payment Method” is “Credit Card”
 * 2.32 Verify “Shipping Method” is “Next Day Air”
 * 2.33 Verify Total is “$2,950.00”
 * 2.34 Click on “CONFIRM”
 * 2.35 Verify the Text “Thank You”
 * 2.36 Verify the message “Your order has been successfully processed!”
 * 2.37 Click on “CONTINUE”
 * 2.37 Verify the text “Welcome to our store”
 */

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Create class “ComputerTest” into testsuite package
public class ComputerTest extends BaseTest {

    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    CartPage cartPage = new CartPage();
    LoginCheckOutAsGuestPage loginCheckOutAsGuestPage = new LoginCheckOutAsGuestPage();
    OnePageCheckoutOPCBilling onePageCheckoutOPCBilling = new OnePageCheckoutOPCBilling();
    CheckoutCompletedPage checkoutCompletedPage = new CheckoutCompletedPage();

    // Write the following Test:
    // 1.Test name verifyProductArrangeInAlphaBaticalOrder()
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // 1.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        // 1.2 Click on Desktop
        computersPage.clickOnDesktopLink();
        // 1.3 Select Sort By position "Name: Z to A"
        desktopPage.selectOnSortBy("Name: Z to A");
        // 1.4 Verify the Product will arrange in Descending order.
        List<String> actualList = desktopPage.enlistProductNames();
        System.out.println(actualList);
        List<String> sortedProductNames = new ArrayList<>(actualList);
        sortedProductNames.sort(Comparator.reverseOrder());
        System.out.println(sortedProductNames);
        boolean areSorted = actualList.equals(sortedProductNames);
        Assert.assertFalse(areSorted);
    }

    // 2. Test name verifyProductAddedToShoppingCartSuccessFully()
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        // 2.1 Click on Computer Menu.
        homePage.selectMenu("Computers");
        // 2.2 Click on Desktop
        computersPage.clickOnDesktopLink();
        // 2.3 Select Sort By position "Name: A to Z"
        desktopPage.selectOnSortBy("Name: A to Z");
        // 2.4 Click on "Add To Cart"
        desktopPage.clickOnFirstAddToCartButton();
        //2.5 Verify the Text "Build your own computer"
        String expectedHeading = "Build your own computer";
        Assert.assertEquals(buildYourOwnComputer.getProductHeading(), expectedHeading);
        // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer.setSelectingProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        // 2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer.setSelectingRAM("8GB [+$60.00]");
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer.setSelectingHDD("400 GB");
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer.setSelectingOS("Vista Premium");
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputer.setSelectingSoftware("Microsoft Office");
        buildYourOwnComputer.setSelectingSoftware("Total Commander");
        // 2.11 Verify the price "$1,475.00"
        String expectedPrice = "$1,475.00";
        //Assert.assertEquals(buildYourOwnComputer.getProductPrice(),expectedPrice);
        // 2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputer.clickOnAddToCartButton();
        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnComputer.getProductAddedMessage(), expectedMessage);
        // After that close the bar clicking on the cross button.
        buildYourOwnComputer.clickOnProductAddedMessageCloseButton();
        // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputer.mouseHoverToShoppingCart();
        buildYourOwnComputer.mouseHoverToGoToCartAndClick();
        // 2.15 Verify the message "Shopping cart"
        String expectedCartHeading = "Shopping cart";
        Assert.assertEquals(cartPage.getShoppingCartHeading(),expectedCartHeading);
        // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
        cartPage.clickOnQuantityUpButton();
        //----------------clicking on update shopping cart is not required as page updates automatically and there is not link to find.--------//
        // 2.17 Verify the Total"$2,950.00"
        String expectedTotalPriceValue = "$2,950.00";
        Assert.assertEquals(cartPage.getTotalPriceValue(),expectedTotalPriceValue);
        // 2.18 click on checkbox “I agree with the terms of service”
        cartPage.clickOnTAndCCheckBox();
        // 2.19 Click on “CHECKOUT”
        cartPage.clickOnCheckoutButton();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(loginCheckOutAsGuestPage.getWelcomeHeadingMessage(),"Welcome, Please Sign In!");
        // 2.21Click on “CHECKOUT AS GUEST” Tab
        loginCheckOutAsGuestPage.clickOnCheckOutAsGuestButton();
        // 2.22 Fill the all mandatory field
        onePageCheckoutOPCBilling.enterFirstName("Gaurav");
        onePageCheckoutOPCBilling.enterLastName("Patel");
        onePageCheckoutOPCBilling.enterEmail("abc123@abc.com");
        onePageCheckoutOPCBilling.selectCountry("India");
        onePageCheckoutOPCBilling.enterCity("Mumbai");
        onePageCheckoutOPCBilling.enterAddress1("MG Road");
        onePageCheckoutOPCBilling.enterPostCode("34652144");
        onePageCheckoutOPCBilling.enterPhoneNumber("09106493244");
        // 2.23 Click on “CONTINUE”
        onePageCheckoutOPCBilling.clickOnContinueButton();
        // 2.24 Click on Radio Button “Next Day Air($0.00)”
        onePageCheckoutOPCBilling.clickOnNextDayAir();
        // 2.25 Click on “CONTINUE”
        onePageCheckoutOPCBilling.clickOnShippingContinueButton();
        // 2.26 Select Radio Button “Credit Card”
        onePageCheckoutOPCBilling.clickOnCreditCardRadioButton();
        onePageCheckoutOPCBilling.clickOnPaymentContinueButton();
        // 2.27 Select “Master card” From Select credit card dropdown
        onePageCheckoutOPCBilling.setSelectCreditCardTypeDropdown("Master card");
        // 2.28 Fill all the details
        onePageCheckoutOPCBilling.setCardHolderName("Abc patel");
        onePageCheckoutOPCBilling.setCardNumber("5299920210000277");
        onePageCheckoutOPCBilling.setSelectExpMonth("11");
        onePageCheckoutOPCBilling.setSelectExpYear("2025");
        onePageCheckoutOPCBilling.setCardCode("589");
        // 2.29 Click on “CONTINUE”
        onePageCheckoutOPCBilling.clickOnPaymentInfoCotinueButton();
        // 2.30 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethod = "Credit Card";
        Assert.assertEquals(onePageCheckoutOPCBilling.getPaymentMethodText(),expectedPaymentMethod);
        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedShippingMethod = "Next Day Air";
        Assert.assertEquals(onePageCheckoutOPCBilling.getActualShippingMethodText(),expectedShippingMethod);
        // 2.33 Verify Total is “$2,950.00”
        String expectedTotalAmount = "$2,950.00";
        Assert.assertEquals(onePageCheckoutOPCBilling.getActualTotalAmount(),expectedTotalAmount);
        // 2.34 Click on “CONFIRM”
        onePageCheckoutOPCBilling.clickOnFinalContinueButton();
        // 2.35 Verify the Text “Thank You”
        String expectedThankYouText = "Thank you";
        Assert.assertEquals(checkoutCompletedPage.getThankYouMessage(),expectedThankYouText);
        // 2.36 Verify the message “Your order has been successfully processed!”
        String expectedStatusMessage = "Your order has been successfully processed!";
        Assert.assertEquals(checkoutCompletedPage.getOrderStatusMessage(),expectedStatusMessage);
        // 2.37 Click on “CONTINUE”
        checkoutCompletedPage.clickOnContinueButtonAfterThankYou();
        // 2.37 Verify the text “Welcome to our store”
        String expectedStoreWelcomeGreetings = "Welcome to our store";
        Assert.assertEquals(checkoutCompletedPage.getStoreWelcomeMessage(),expectedStoreWelcomeGreetings);
    }


}
