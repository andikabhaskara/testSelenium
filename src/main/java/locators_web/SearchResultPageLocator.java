package locators_web;

import org.openqa.selenium.By;

public interface SearchResultPageLocator {
    By FIRST_RESULT_PRODUCT_NAME = By.xpath("(//h3[contains(@class, \"udlite-heading-md\")])[1]");
}
