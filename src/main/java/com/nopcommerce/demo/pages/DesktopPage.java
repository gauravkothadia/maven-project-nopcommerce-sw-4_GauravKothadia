package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    By desktopLink = By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");
    By sortByElement = By.xpath("//select[@id='products-orderby']");
    By productNames = By.xpath("//h2[@class='product-title']//a");
    By firstAddToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");



    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }

    public void selectOnSortBy(String optionText){
        Select select = new Select(findSingleElement(sortByElement));
        select.selectByVisibleText(optionText);
    }

    public List<String> enlistProductNames(){
        List<String> listOfProducts = new ArrayList<>();

        for(WebElement ele : findMultipleElements(productNames)){
            listOfProducts.add(ele.getText().trim());
        }
        return listOfProducts;
    }

    public void clickOnFirstAddToCartButton(){
        refreshPage();                                      //-----used page refresh to avoid StaleElementException
        clickOnElement(findSingleElement(firstAddToCart));
    }



}
