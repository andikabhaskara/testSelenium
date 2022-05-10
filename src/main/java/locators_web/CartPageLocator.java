package locators_web;

import org.openqa.selenium.By;

public interface CartPageLocator {

    By CHECKOUT_TEXT = By.className("title");
    By CHECKOUT_BUTTON = By.id("checkout");
    By PRODUCT_NAME = By.className("inventory_item_name");
    By PRODUCT_PRICE = By.className("inventory_item_price");
}
