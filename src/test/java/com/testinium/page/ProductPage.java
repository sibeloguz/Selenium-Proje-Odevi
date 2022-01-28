package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();

    }

    public void scroll() {
        methods.sentKeys(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.xpath("//a[contains(text(),'Güncelle')]"));
        methods.randomSelect(By.xpath("//a[@class=\"add-to-favorites\"]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class=\"menu top my-list\"]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//div[@class='logo-text']"));




    }

}







