package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginCheckOutAsGuestPage extends Utility {

    By welcomeHeading = By.tagName("h1");
    By checkOutAsGuestButton = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By registerButton = By.xpath("//button[normalize-space()='Register']");

    public String getWelcomeHeadingMessage(){
        return getTextFromElement(welcomeHeading);
    }

    public void clickOnCheckOutAsGuestButton(){
        clickOnElement(checkOutAsGuestButton);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

}
