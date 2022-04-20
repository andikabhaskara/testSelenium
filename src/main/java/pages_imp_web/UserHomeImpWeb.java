package pages_imp_web;

import base.WebBasePageObject;
import pages_web.UserHomePageWeb;

import static locators_web.UserHomePageLocator.*;

public class UserHomeImpWeb extends WebBasePageObject implements UserHomePageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(USER_PROFILE_AVATAR,30).isDisplayed();
    }

    @Override
    public String myLearningText() {
        return getText(MY_LEARNING_TEXT);
    }

    @Override
    public void searchProduct(String productName) {
        type(INPUT_SEARCHBAR, productName);
    }

    @Override
    public String productIsInputted() {
        return getValue(INPUT_SEARCHBAR);
    }

    @Override
    public void clickSearch() {
        click(SEARCH_BUTTON);
    }

}
