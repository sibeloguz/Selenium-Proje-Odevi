package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LogoutPage {

    Methods methods;

    public LogoutPage() {

        methods = new Methods();
    }
    public void Logout(){

        methods.click(By.xpath("//img[@class='checkout-logo']"));
        methods.waitBySeconds(3);
        methods.Code(By.className("common-sprite"));
        methods.waitBySeconds(2);
        methods.click(By.name("Çıkış"));
    }
}
