package com.testinium.test;

import com.testinium.page.FavoritePage;
import org.junit.Test;
    public class FavoriteTest extends BaseTest {
        @Test
        public void favoriteTest(){
           FavoritePage favoritePage = new FavoritePage();
           favoritePage.pet();
        }
    }

