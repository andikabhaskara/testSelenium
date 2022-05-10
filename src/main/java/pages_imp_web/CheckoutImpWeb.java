package pages_imp_web;

import base.WebBasePageObject;
import pages_web.CheckoutPageWeb;

import static locators_web.CheckoutPageLocator.*;

public class CheckoutImpWeb extends WebBasePageObject implements CheckoutPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(CHECKOUT_INFORMATION_TEXT, 30).isDisplayed() & waitElement(CONTINUE_BUTTON,30).isDisplayed();
    }

    @Override
    public String getCheckoutInfoText() {
        return getText(CHECKOUT_INFORMATION_TEXT);
    }

    @Override
    public void inputFirstName(String firstName) {
        type(FIRST_NAME_FIELD, firstName);
    }

    @Override
    public void inputLastName(String lastName) {
        type(LAST_NAME_FIELD, lastName);
    }

    @Override
    public void inputZipCode(String zipCode) {
        type(ZIP_FIELD, zipCode);
    }

    @Override
    public void clickContinueButton() {
        click(CONTINUE_BUTTON);
    }

}
