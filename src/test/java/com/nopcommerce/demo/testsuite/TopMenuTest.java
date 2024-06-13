package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Computers");
        homePage.selectMenu("Electronics");
        homePage.selectMenu("Apparel");
        homePage.selectMenu("Digital downloads");
        homePage.selectMenu("Books");
        homePage.selectMenu("Jewelry");
        homePage.selectMenu("Gift Cards");
    }
}
