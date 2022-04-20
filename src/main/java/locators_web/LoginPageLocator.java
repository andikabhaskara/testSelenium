package locators_web;

import org.openqa.selenium.By;

public interface LoginPageLocator {
    By LOGIN_BUTTON = By.id("submit-id-submit");
    By EMAIL_TEXT_FIELD = By.id("email--1");
    By PASSWORD_TEXT_FIELD = By.id("id_password");
    By LOGIN_PAGE_TEXT = By.id("auth-to-udemy-title");
}
