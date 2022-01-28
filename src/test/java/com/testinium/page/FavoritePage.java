package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class FavoritePage {

        Methods methods;
        public FavoritePage() {
            methods = new Methods();
        }

        public void pet() {
            methods.click(By.xpath("//input[@class='common-sprite']"));
            methods.waitBySeconds(2);
            methods.sentKeys(By.id("js-cart"), "Sepete Git");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//input[@name='quantity']"));
            methods.sentKeys(By.xpath("//input[@name='quantity']"),"num");
            methods.waitBySeconds(3);
            methods.click(By.id("[cart_module]/div[1]/table/tbody/tr/td[4]/form/input[1]"));
            methods.waitBySeconds(2);
            methods.sentKeys(By.className("fa fa-refresh green-icon"), "Güncelle");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//a[@class='button red']"));
            methods.waitBySeconds(2);
            methods.sentKeys(By.xpath("//a[@class='selected']"), "Yeni bir adres kullanmak istiyorum");
            methods.waitBySeconds(2);
            methods.click(By.xpath("//input[@name='address_type_id]"));
            methods.sentKeys(By.id("address-firstname-companyname"), "Sibel");
            methods.sentKeys(By.id("address-lastname-title"), "Oğuz");
            methods.sentKeys(By.id("address-country-id"), "Türkiye");
            methods.sentKeys(By.id("address-zone-id"), "Kocaeli");
            methods.sentKeys(By.id("address-county-id"), "Gebze");
            methods.sentKeys(By.id("district"), "Mutlukent");
            methods.sentKeys(By.id("address-address-text"), "Serkan Özçeri Cad.Poyraz Sitesi B3 Blok Kat6 No25");
            methods.sentKeys(By.id("address-postcode"), "34950");
            methods.sentKeys(By.id("address-telephone"), "");
            methods.sentKeys(By.id("address-mobile-telephone"), "5462954472");
            methods.click(By.id("button-checkout-continue"));
            methods.waitBySeconds(2);
            methods.sentKeys(By.id("credit-card-owner"), "Sibel Oğuz");
            methods.sentKeys(By.id("credit_card_number_1"), "4342");
            methods.sentKeys(By.id("credit_card_number_2"), "2800");
            methods.sentKeys(By.id("credit_card_number_3"), "0810");
            methods.sentKeys(By.id("credit_card_number_4"), "3760");
            methods.sentKeys(By.id("credit-card-expire-date-month"), "09");
            methods.sentKeys(By.id("credit-card-expire-date-year"), "27");
            methods.sentKeys(By.id("credit-card-security-code"), "386");
            methods.click(By.id("button-checkout-continue"));
            methods.waitBySeconds(2);



        }


}
