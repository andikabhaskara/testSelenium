package pages_imp_web;

import base.WebBasePageObject;
import pages_web.GuestHomePageWeb;

import static locators_web.GuestHomePageLocator.*;

public class GuestHomeImpWeb extends WebBasePageObject implements GuestHomePageWeb {

    @Override
    public void openPage() {
        getDriver().get("http://www.udemy.com/");
    }

    @Override
    public void clickLoginButton() {
        click(LOGIN_BUTTON);
    }
}
