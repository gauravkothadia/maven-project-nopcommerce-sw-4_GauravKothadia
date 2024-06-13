package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020Page extends Utility {
    By nokiaLumia1020Heading = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By productPagePrice = By.xpath("//div[@class='product-price']//span");
    By productQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-20']");
    By notificationBarSuccessMessage = By.xpath("//div[@class='bar-notification success']//p");
    By notificationBarCloseButton = By.xpath("//div[@class='bar-notification success']//span");
    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");

    public String getNokiaLumia1020Heading(){
        return getTextFromElement(nokiaLumia1020Heading);
    }

    public String getProductPagePrice(){
        return getTextFromElement(productPagePrice);
    }

    public void changeProductQuantity(String num){
        clearingText(productQuantity);
        sendTextToElement(productQuantity,num);
    }

    public void clickOnAddToCardButton(){
        clickOnElement(addToCartButton);
    }

    public String getNotificationBarSuccessMessage(){
        return getTextFromElement(notificationBarSuccessMessage);
    }

    public void clickOnNotificationBarCloseButton(){
        clickOnElement(notificationBarCloseButton);
    }

    public void mouseHoverToShoppingCartLink(){
        mouseHoverToElement(shoppingCartLink);
    }

    public void mouseHoverToAndClickGoToCart(){
        clickOnElement(findSingleElement(goToCartButton));
    }



}
