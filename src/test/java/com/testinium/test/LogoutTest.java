package com.testinium.test;

import com.testinium.page.LogoutPage;
import org.junit.Test;

public class LogoutTest  extends BaseTest {
    @Test
    public void logoutTest(){
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.Logout();
    }

}
