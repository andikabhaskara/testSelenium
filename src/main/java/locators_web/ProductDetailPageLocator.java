package locators_web;

import org.openqa.selenium.By;

public interface ProductDetailPageLocator {
    By PRODUCT_TITLE_NAME = By.cssSelector("[data-purpose=\"lead-title\"]");
    By BUY_NOW_BUTTON = By.xpath("(//*[@data-purpose=\"buy-this-course-button\"])[1]");
}
