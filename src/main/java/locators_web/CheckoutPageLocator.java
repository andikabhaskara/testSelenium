package locators_web;

import org.openqa.selenium.By;

public interface CheckoutPageLocator {

    By CHECKOUT_TEXT = By.cssSelector(".udlite-heading-serif-xxl");
    By BILLING_COUNTRY = By.id("u66-form-group--1");
    By CREDIT_DEBIT_CARD_RADIO_BUTTON = By.id("u409-accordion-panel-title--5");
    By CARD_NAME_TEXT_FIELD = By.id("u66-form-group--6");
    By CARD_NUMBER_TEXT_FIELD = By.cssSelector(".InputContainer > [name=\"cardnumber\"]");
    By CVV_TEXT_FIELD = By.cssSelector("[name=\"cvc\"]");
    By EXPIRED_DATE_TEXT_FIELD = By.cssSelector("[autocomplete=\"cc-exp\"]");
    By SAVE_CARD_CHECKBOX = By.cssSelector(".udlite-fake-toggle-checkbox");
    By FINISH_CHECKOUT_BUTTON = By.cssSelector("button[class*=\"checkout-button\"]");
    By ERROR_MESSAGE_PAYMENT = By.cssSelector("[data-purpose*=\"checkout-message\"]");

}
