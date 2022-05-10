package locators_web;

import org.openqa.selenium.By;

public interface ProductDetailPageLocator {
    By PRODUCT_TITLE_NAME = By.className("inventory_details_name");
    By PRODUCT_PRICE_NAME = By.className("inventory_details_price");
    By ADD_TO_CART_BUTTON = By.className("btn_primary");
    By CART_IS_FILLED_ICON = By.className("shopping_cart_badge");
    By CART_ICON = By.className("shopping_cart_link");
}
