package locators_web;

import org.openqa.selenium.By;

public interface ResultPageLocator {
    By COMPLETE_TEXT = By.className("title");
    By BACK_TO_HOME_BUTTON = By.id("back-to-products");
    By THANK_YOU_TEXT = By.className("complete-header");
    By COMPLETE_DESCRIPTION_TEXT = By.className("complete-text");
}
