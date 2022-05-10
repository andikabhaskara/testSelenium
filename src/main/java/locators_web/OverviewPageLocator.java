package locators_web;

import org.openqa.selenium.By;

public interface OverviewPageLocator {

    By OVERVIEW_TEXT = By.className("title");
    By PRODUCT_NAME = By.className("inventory_item_name");
    By PRODUCT_PRICE = By.className("inventory_item_price");
    By PAYMENT_INFORMATION = By.cssSelector("div.summary_value_label:nth-child(2)");
    By DELIVERY_INFORMATION = By.cssSelector("div.summary_value_label:nth-child(4)");
    By ITEM_TOTAL_PRICE = By.className("summary_subtotal_label");
    By TAX_PRICE = By.className("summary_tax_label");
    By TOTAL_PRICE = By.className("summary_total_label");
    By FINISH_BUTTON = By.id("finish");
}
