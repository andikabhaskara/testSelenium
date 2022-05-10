package pages_imp_web;

import base.WebBasePageObject;
import pages_web.GuestHomePageWeb;

public class GuestHomeImpWeb extends WebBasePageObject implements GuestHomePageWeb {

    @Override
    public void openPage() {
        getDriver().get("https://www.saucedemo.com");
    }

}
