package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PointPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public PointPage() {

        methods = new Methods();
    }

    public void Pick() {
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(5);
        methods.selectByText(By.xpath("//div[@class='sort']/select"), "Yüksek Oylama");
        methods.waitBySeconds(5);
        methods.Code(By.xpath("//*[@class=\"mn-strong common-sprite\" and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@class='mn-icon icon-angleRight' and contains(text(),'Hobi')]"));
        methods.waitBySeconds(5);
        methods.randomSelect(By.xpath("//a[@class=\"pr-img-link\"]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//span[contains(text(),'Sepete Ekle')]"));
        methods.waitBySeconds(5);
        methods.Code(By.xpath("//*[@class='common-sprite']"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(5);
        /* Favori Listesinde yer alan , 3.ürün silinir.(Favorilere eklenen 3.ürünün
           unique bir attribute’unu tutarak favorilere ekleyiniz,
           favori listesinden ilgili attribute lu ürünü siliniz)?
         */

    }
}




