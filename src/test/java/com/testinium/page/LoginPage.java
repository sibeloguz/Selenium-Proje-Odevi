package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage() {

        methods = new Methods();
    }

    public void login() {
        methods.click(By.xpath("//a[contains(text(),'Giriş Yap')]"));
        methods.waitBySeconds(3);
        methods.sentKeys(By.id("login-email"), "sibeloguz0@gmail.com");
        methods.sentKeys(By.id("login-password"), "180696Si");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn "));
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[contains(text(),'Hesabım')]")));
        methods.waitBySeconds(3);

    }
}






