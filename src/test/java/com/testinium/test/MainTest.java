package com.testinium.test;

import com.testinium.page.*;
import org.junit.Test;

public class MainTest extends BaseTest{
        @Test
        public void MainTest(){
            HomePage homePage= new HomePage();
            homePage.home();
            LoginPage loginPage = new LoginPage();
            loginPage.login();
            ProductPage productPage = new ProductPage();
            productPage.scroll();
            PointPage pointPage = new PointPage();
            pointPage.Pick();
            FavoritePage favoritePage = new FavoritePage();
            favoritePage.pet();
            LogoutPage logoutPage = new LogoutPage();
            logoutPage.Logout();

        }

    }



