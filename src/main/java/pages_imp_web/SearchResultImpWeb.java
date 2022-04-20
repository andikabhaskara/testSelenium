package pages_imp_web;

import base.WebBasePageObject;
import pages_web.SearchResultPageWeb;

import static locators_web.SearchResultPageLocator.*;

public class SearchResultImpWeb extends WebBasePageObject implements SearchResultPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(FIRST_RESULT_PRODUCT_NAME, 30).isDisplayed();
    }

    @Override
    public void clickFirstProduct() {
        click(FIRST_RESULT_PRODUCT_NAME);
    }


}
