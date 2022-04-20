package pages_imp_web;

import base.WebBasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages_web.CheckoutPageWeb;

import static locators_web.CheckoutPageLocator.*;

public class CheckoutImpWeb extends WebBasePageObject implements CheckoutPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(CHECKOUT_TEXT, 30).isDisplayed() & waitElement(FINISH_CHECKOUT_BUTTON,30).isDisplayed();
    }

    @Override
    public String checkOutText() {
        return getText(CHECKOUT_TEXT);
    }

    @Override
    public void selectIndonesiaCountry(String country) {
        selectByVisibilityText(BILLING_COUNTRY, country);
    }

    @Override
    public void selectCreditDebitCardPayment() {
        click(CREDIT_DEBIT_CARD_RADIO_BUTTON);
    }

    @Override
    public void inputDetailCard(String cardName, String cardNo, String cvvNo, String expCard) {
        type(CARD_NAME_TEXT_FIELD, cardName);
        type(CARD_NUMBER_TEXT_FIELD, cardNo);
        type(CVV_TEXT_FIELD, cvvNo);
        type(EXPIRED_DATE_TEXT_FIELD, expCard);
    }

    @Override
    public String getCardName() {
        return getText(CARD_NAME_TEXT_FIELD);
    }

    @Override
    public String getCardNumber() {
        return getText(CARD_NUMBER_TEXT_FIELD);
    }

    @Override
    public String getCvvNo() {
        return getText(CVV_TEXT_FIELD);
    }

    @Override
    public String getExpCard() {
        return getText(EXPIRED_DATE_TEXT_FIELD);
    }

    @Override
    public void uncheckSaveCard() {
        if(find(SAVE_CARD_CHECKBOX).isSelected()) {
            WebElement Element = getDriver().findElement(By.cssSelector(".udlite-fake-toggle-checkbox"));
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("arguments[0].scrollIntoView();", Element);
            click(SAVE_CARD_CHECKBOX);
        }
    }

    @Override
    public void clickFinishCheckout() {
        click(FINISH_CHECKOUT_BUTTON);
    }

    @Override
    public String getErrorMessageCheckout() {
        return getText(ERROR_MESSAGE_PAYMENT);
    }

}
