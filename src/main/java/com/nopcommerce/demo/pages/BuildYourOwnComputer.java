package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BuildYourOwnComputer extends Utility {

    By productHeading = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectingProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectingRAM = By.xpath("//label[normalize-space()='RAM']/parent::dt/following-sibling::dd//select");
    String hddPart1 = "//input[@type='radio']/following-sibling::label[contains(text(),'";
    String hddPart2 = "')]";
    String osPart1 = "//input[@type='radio']/following-sibling::label[contains(text(),'";
    String osPart2 = "')]";
    String softwarePart1 = "//label[contains(text(),'";
    String softwarePart2 = "')]/preceding-sibling::input";
    By productPrice = By.xpath("//div[@class='product-price']//span");
    By addToCartButton = By.cssSelector("#add-to-cart-button-1");
    By productAddedMessage = By.xpath("//p[@class='content']");
    By productAddedMessageCloseButton = By.xpath("//span[@class='close']");
    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");


    public String getProductHeading(){
        scrollToElement(findSingleElement(productHeading));
        return getTextFromElement(productHeading);
    }

    public void setSelectingProcessor(String option){
        selectByVisibleTextFromDropDown(selectingProcessor,option);
    }

    public void setSelectingRAM(String option){
        selectByVisibleTextFromDropDown(selectingRAM,option);
    }

    public void setSelectingHDD(String storage){
        clickOnElement(findSingleElement(By.xpath(hddPart1+storage+hddPart2)));
    }

    public void setSelectingOS(String osText){
        clickOnElement(findSingleElement(By.xpath(osPart1+osText+osPart2)));
    }

    public void setSelectingSoftware(String softwareText){
        WebElement ele = findSingleElement(By.xpath(softwarePart1+softwareText+softwarePart2));
        if (!ele.isSelected()) {
            clickOnElement(ele);
        }
    }

    public String getProductPrice(){
        return getTextFromElement(productPrice);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String getProductAddedMessage(){
        return getTextFromElement(productAddedMessage);
    }

    public void clickOnProductAddedMessageCloseButton(){
        clickOnElement(productAddedMessageCloseButton);
    }

    public void mouseHoverToShoppingCart(){
        mouseHoverToElement(shoppingCartLink);
    }

    public void mouseHoverToGoToCartAndClick(){
        waitUntilVisibilityOfElementLocated(goToCartButton, 10);
        mouseHoverToElementAndClick(goToCartButton);
    }

}
