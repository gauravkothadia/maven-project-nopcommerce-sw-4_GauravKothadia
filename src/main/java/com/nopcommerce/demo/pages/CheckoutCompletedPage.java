package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutCompletedPage extends Utility {
    //      2.35 Verify the Text “Thank You”
    By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    //      2.36 Verify the message “Your order has been successfully processed!”
    By orderStatusMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    //      2.37 Click on “CONTINUE”
    By continueButtonAfterThankYou = By.xpath("//button[normalize-space()='Continue']");
    //      2.37 Verify the text “Welcome to our store”
    By storeWelcomeMessage = By.xpath("//h2[normalize-space()='Welcome to our store']");

    By logoutLink = By.linkText("Log out");


    public String getThankYouMessage(){
        return getTextFromElement(thankYouMessage);
    }

    public String getOrderStatusMessage(){
        return getTextFromElement(orderStatusMessage);
    }

    public void clickOnContinueButtonAfterThankYou(){
        clickOnElement(continueButtonAfterThankYou);
    }

    public String getStoreWelcomeMessage(){
        return getTextFromElement(storeWelcomeMessage);
    }

    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
    }
}
