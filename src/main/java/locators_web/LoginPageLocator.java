package locators_web;

import org.openqa.selenium.By;

public interface LoginPageLocator {
    By LOGIN_BUTTON = By.id("login-button");
    By EMAIL_TEXT_FIELD = By.id("user-name");
    By PASSWORD_TEXT_FIELD = By.id("password");
}
