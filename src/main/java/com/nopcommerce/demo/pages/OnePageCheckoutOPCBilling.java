package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnePageCheckoutOPCBilling extends Utility {

//    By requiredSymbol = By.xpath("//div[@class='edit-address']//span[@class='required']");
//    By labelFields = By.xpath("//div[@class='edit-address']//span[@class='required']/preceding-sibling::label");
//    By inputFields = By.xpath("//div[@class='edit-address']//span[@class='required']/preceding-sibling::input");
//    By selectField = By.xpath("//div[@class='edit-address']//span[@class='required']/preceding-sibling::select");
    By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailAddressField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryDropdownField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1Field = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");
    By nextDayAirShipping = By.xpath("//input[contains(@value,'Next Day Air')]");
    By shippingContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardRadioButton = By.xpath("//label[normalize-space()='Credit Card']/preceding-sibling::input");
    By paymentContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By selectCreditCardTypeDropdown = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By selectExpMonth = By.xpath("//select[@id='ExpireMonth']");
    By selectExpYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By secondDayAir = By.xpath("//div[@class='section shipping-method']//label[starts-with(text(),'2nd Day Air')]/preceding-sibling::input");





    //-----mandatory fields-------------
    public void enterFirstName(String fName) {
        sendTextToElement(firstNameField, fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastNameField, lName);
    }

    public void enterEmail(String eMail) {
        sendTextToElement(emailAddressField, eMail);
    }

    public void selectCountry(String country) {
        selectByVisibleTextFromDropDown(countryDropdownField, country);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterAddress1(String address1) {
        sendTextToElement(address1Field, address1);
    }

    public void enterPostCode(String pCode) {
        sendTextToElement(postCodeField, pCode);
    }

    public void enterPhoneNumber(String phone) {
        sendTextToElement(phoneNumberField, phone);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAir(){
        clickOnElement(nextDayAirShipping);
    }

    public void clickOnShippingContinueButton() {
        clickOnElement(shippingContinueButton);
    }

    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnPaymentContinueButton(){
        clickOnElement(paymentContinueButton);
    }

    public void setSelectCreditCardTypeDropdown(String cardName){
        selectByVisibleTextFromDropDown(selectCreditCardTypeDropdown, cardName);
    }

    public void setCardHolderName(String str){
        sendTextToElement(cardHolderName,str);
    }
    public void setCardNumber(String cardNum){
        sendTextToElement(cardNumber,cardNum);
    }

    public void setSelectExpMonth(String mon){
        selectByVisibleTextFromDropDown(selectExpMonth,mon);
    }

    public void setSelectExpYear(String yr){
        selectByVisibleTextFromDropDown(selectExpYear,yr);
    }

    public void setCardCode(String str){
        sendTextToElement(cardCode,str);
    }

    public void clickOn2ndDayAir(){
        clickOnElement(secondDayAir);
    }

    By paymentInfoContinueButton  = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethodText = By.xpath("//li[@class='payment-method']//span[normalize-space()='Payment Method:']/following-sibling::span");
    By actualShippingMethod = By.xpath("//span[normalize-space()='Shipping Method:']/following-sibling::span");
    By actualTotalAmount = By.xpath("//tr[@class='order-total']//span[@class='value-summary']");
    By finalContinueButton = By.xpath("//button[normalize-space()='Confirm']");

    public void clickOnPaymentInfoCotinueButton(){
        clickOnElement(paymentInfoContinueButton);
    }
    public String getPaymentMethodText(){
        return getTextFromElement(paymentMethodText);
    }

    public String getActualShippingMethodText(){
        return getTextFromElement(actualShippingMethod);
    }

    public String getActualTotalAmount(){
        return getTextFromElement(actualTotalAmount);
    }

    public void clickOnFinalContinueButton(){
        clickOnElement(finalContinueButton);
    }
}
