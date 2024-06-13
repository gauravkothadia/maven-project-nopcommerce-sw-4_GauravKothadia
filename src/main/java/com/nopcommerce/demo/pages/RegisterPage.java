package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerHeading = By.xpath("//h1[normalize-space()='Register']");
    By genderRadioButtonMale = By.cssSelector("div.gender input#gender-male");
    By firstNameField = By.cssSelector("#FirstName");
    By lastNameField = By.cssSelector("#LastName");
    By dobDay = By.xpath("//div[@class='inputs date-of-birth']//select[@name='DateOfBirthDay']");
    By dobMonth = By.xpath("//div[@class='inputs date-of-birth']//select[@name='DateOfBirthMonth']");
    By dobYear =By.xpath("//div[@class='inputs date-of-birth']//select[@name='DateOfBirthYear']");
    By emailField = By.xpath("//input[@id='Email']");
    By companyField = By.xpath("//input[@id='Company']");
    By pwdField = By.xpath("//input[@id='Password']");
    By confirmPwdField = By.xpath("//input[@id='ConfirmPassword']");
    By registerButtonLink = By.xpath("//button[@id='register-button']");

    public String getRegisterHeading(){
        return getTextFromElement(registerHeading);
    }

    public void clickOnGenderRadioButtonMale(){
        clickOnElement(genderRadioButtonMale);
    }
    public void setFirstNameField(String fName){
        sendTextToElement(firstNameField,fName);
    }
    public void setLastNameField(String lName){
        sendTextToElement(lastNameField,lName);
    }
    public void setDobDay(String day){
        selectByVisibleTextFromDropDown(dobDay,day);
    }public void setDobMonth(String month){
        selectByVisibleTextFromDropDown(dobMonth,month);
    }public void setDobYear(String year){
        selectByVisibleTextFromDropDown(dobYear,year);
    }
    public void setEmailField(String eMail){
        sendTextToElement(emailField,eMail);
    }
    public void setCompanyField(String comp){
        sendTextToElement(companyField,comp);
    }
    public void setPwdField(String pwd){
        sendTextToElement(pwdField,pwd);
    }
    public void setConfirmPwdField(String cPwd){
        sendTextToElement(confirmPwdField,cPwd);
    }

    public void clickOnRegisterButtonLink(){
        clickOnElement(registerButtonLink);
    }
}
