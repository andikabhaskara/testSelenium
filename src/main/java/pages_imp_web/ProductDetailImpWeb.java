package pages_imp_web;

import base.WebBasePageObject;
import pages_web.ProductDetailPageWeb;

import static locators_web.ProductDetailPageLocator.*;

public class ProductDetailImpWeb extends WebBasePageObject implements ProductDetailPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(PRODUCT_TITLE_NAME, 30).isDisplayed() & waitElement(ADD_TO_CART_BUTTON, 30).isDisplayed();
    }

    @Override
    public String getProductName() {
        return getText(PRODUCT_TITLE_NAME);
    }

    @Override
    public String getProductPrice() {
        return getText(PRODUCT_PRICE_NAME);
    }

    @Override
    public void clickAddToCard() {
        click(ADD_TO_CART_BUTTON);
    }

    @Override
    public String isProductAdded() {
        return getText(CART_IS_FILLED_ICON);
    }

    @Override
    public void clickCheckoutCart() {
        click(CART_ICON);
    }
}
