package pages_imp_web;

import base.WebBasePageObject;
import pages_web.UserHomePageWeb;

import static locators_web.UserHomePageLocator.*;

public class UserHomeImpWeb extends WebBasePageObject implements UserHomePageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(SHOPPING_TITLE_TEXT,30).isDisplayed();
    }

    @Override
    public String shoppingTitleText() {
        return getText(SHOPPING_TITLE_TEXT);
    }

    @Override
    public void sortProduct(String sortName) {
        selectByVisibilityText(SELECT_SORT_PRODUCT, sortName);
    }

    @Override
    public String productResult() {
        return getText(FIRST_PRODUCT);
    }

    @Override
    public void clickFirstProduct() {
        click(FIRST_PRODUCT);
    }

}
