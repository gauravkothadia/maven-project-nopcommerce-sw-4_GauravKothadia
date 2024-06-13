package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CellPhonesPage extends Utility {

    By cellPhoneHeading = By.xpath("//h1[normalize-space()='Cell phones']");
    By listViewIcon = By.xpath("//a[normalize-space()='List']");
//    String productNamePart1 = "//h2[@class='product-title']//a[contains(text(),'";
//    String productNamePart2 = "')]";
    By productNameNokia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    public String getCellPhoneHeading(){
        return getTextFromElement(cellPhoneHeading);
    }

    public void clickOnListView(){
        clickOnElement(listViewIcon);
    }

    public void clickOnProductNokia(){
        refreshPage();
        clickOnElement(productNameNokia);
    }

}
