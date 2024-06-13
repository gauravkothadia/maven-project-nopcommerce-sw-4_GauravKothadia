package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {

    By shoppingCartHeading = By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantityUpButton = By.xpath("//div[@class='quantity up']");
    By totalPriceLabel = By.xpath("//tr[@class='order-total']//label[contains(text(),'Total:')]");
    By totalPriceValue = By.xpath("//span[@class='value-summary']//strong");
    By checkBoxTAndC = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By quantityAmount = By.xpath("//div[@class='product-quantity']//input");

    public String getShoppingCartHeading(){
        return getTextFromElement(shoppingCartHeading);
    }

    public void clickOnQuantityUpButton(){
        clickOnElement(quantityUpButton);
    }

    public String getTotalPriceValue(){
        scrollToElement(findSingleElement(totalPriceLabel));
        return getTextFromElement(totalPriceValue);
    }

    public void clickOnTAndCCheckBox(){
        clickOnElement(checkBoxTAndC);
    }

    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }

    public String getQuantityAmount(){
        return getElementArributeValue(quantityAmount,"value");
    }

}
