package com.testinium.test;

import com.testinium.page.PointPage;
import org.junit.Test;

public class PointTest extends BaseTest {
    @Test
    public void pointTest(){
        PointPage pointPage = new PointPage();
        pointPage.Pick();
    }

}
