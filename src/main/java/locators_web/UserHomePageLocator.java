package locators_web;

import org.openqa.selenium.By;

public interface UserHomePageLocator {
    By SHOPPING_TITLE_TEXT = By.className("title");
    By SELECT_SORT_PRODUCT = By.className("product_sort_container");
    By FIRST_PRODUCT = By.cssSelector("#item_5_title_link > div");

}
