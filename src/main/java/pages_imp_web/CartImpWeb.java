package pages_imp_web;

import base.WebBasePageObject;
import pages_web.CartPageWeb;

import static locators_web.CartPageLocator.*;

public class CartImpWeb extends WebBasePageObject implements CartPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(CHECKOUT_TEXT, 30).isDisplayed() & waitElement(CHECKOUT_BUTTON,30).isDisplayed();
    }

    @Override
    public String checkOutText() {
        return getText(CHECKOUT_TEXT);
    }

    @Override
    public String getProductName() {
        return getText(PRODUCT_NAME);
    }

    @Override
    public String getProductPrice() {
        return getText(PRODUCT_PRICE);
    }

    @Override
    public void clickCheckoutButton() {
        click(CHECKOUT_BUTTON);
    }
}
