package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utility {

    By registrationCompleteStatus = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[@class='button-1 register-continue-button']");

    public String getRegistrationCompleteStatusMessage(){
        return getTextFromElement(registrationCompleteStatus);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
