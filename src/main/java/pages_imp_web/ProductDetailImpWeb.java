package pages_imp_web;

import base.WebBasePageObject;
import pages_web.ProductDetailPageWeb;

import static locators_web.ProductDetailPageLocator.*;

public class ProductDetailImpWeb extends WebBasePageObject implements ProductDetailPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(PRODUCT_TITLE_NAME, 30).isDisplayed();
    }

    @Override
    public String getProductName() {
        return getText(PRODUCT_TITLE_NAME);
    }

    @Override
    public void clickBuyNow() {
        click(BUY_NOW_BUTTON);
    }
}
