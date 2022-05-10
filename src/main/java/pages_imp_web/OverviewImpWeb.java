package pages_imp_web;

import base.WebBasePageObject;
import pages_web.OverviewPageWeb;

import static locators_web.OverviewPageLocator.*;


public class OverviewImpWeb extends WebBasePageObject implements OverviewPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(OVERVIEW_TEXT,30).isDisplayed() & waitElement(FINISH_BUTTON, 30).isDisplayed();
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
    public String getPaymentInfo() {
        return getText(PAYMENT_INFORMATION);
    }

    @Override
    public String getDeliveryInfo() {
        return getText(DELIVERY_INFORMATION);
    }

    @Override
    public String getItemTotalPrice() {
        return getText(ITEM_TOTAL_PRICE);
    }

    @Override
    public String getTaxPrice() {
        return getText(TAX_PRICE);
    }

    @Override
    public String getTotalPrice() {
        return getText(TOTAL_PRICE);
    }

    @Override
    public void clickFinishButton() {
        click(FINISH_BUTTON);
    }
}
