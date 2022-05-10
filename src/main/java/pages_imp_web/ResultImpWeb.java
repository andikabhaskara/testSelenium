package pages_imp_web;

import base.WebBasePageObject;
import io.cucumber.java.Scenario;
import pages_web.ResultPageWeb;

import static locators_web.ResultPageLocator.*;

public class ResultImpWeb extends WebBasePageObject implements ResultPageWeb {

    Scenario scenario;

    @Override
    public boolean isOnPage() {
        return waitElement(COMPLETE_TEXT, 30).isDisplayed() & waitElement(BACK_TO_HOME_BUTTON, 30).isDisplayed();
    }

    @Override
    public String getCompleteOrderText() {
        return getText(THANK_YOU_TEXT);
    }

    @Override
    public String getCompleteDescText() {
        return getText(COMPLETE_DESCRIPTION_TEXT);
    }
}
