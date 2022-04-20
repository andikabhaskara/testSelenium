package pages_imp_web;

import base.WebBasePageObject;
import helper.UserCredential;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import pages_web.LoginPageWeb;

import java.io.InputStream;

import static locators_web.LoginPageLocator.*;

public class LoginImpWeb extends WebBasePageObject implements LoginPageWeb {

    @Override
    public boolean isOnPage() {
        return waitElement(LOGIN_BUTTON, 30).isDisplayed();
    }

    @Override
    public String getTitlePage() {
        return getText(LOGIN_PAGE_TEXT);
    }

    @Override
    public void loginToUdemy() {

        Yaml yaml = new Yaml(new Constructor(UserCredential.class));
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("yaml/user_credentials_test.yaml");

        UserCredential userCredential = yaml.load(inputStream);

        type(EMAIL_TEXT_FIELD, decodeString(userCredential.getUserEmail()));
        type(PASSWORD_TEXT_FIELD, decodeString(userCredential.getUserPassword()));

    }

    @Override
    public void clickLoginButton() {
        click(LOGIN_BUTTON);
    }

}
