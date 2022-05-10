package locators_web;

import org.openqa.selenium.By;

public interface CheckoutPageLocator {

    By CHECKOUT_INFORMATION_TEXT = By.className("title");
    By FIRST_NAME_FIELD = By.id("first-name");
    By LAST_NAME_FIELD = By.id("last-name");
    By ZIP_FIELD = By.id("postal-code");
    By CONTINUE_BUTTON = By.id("continue");

}
