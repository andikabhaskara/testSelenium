package base;

import driver.WebDriverPool;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Base64;

public abstract class WebBasePageObject {

    public WebDriver getDriver() {
        return WebDriverPool.driver;
    }

    public WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void type(By locator, CharSequence...text) {
        WebElement el = find(locator);
        el.clear();
        el.sendKeys(text);
    }

    public String getText(By locator) {
        return find(locator).getText();
    }

    public WebElement waitElement(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement waitElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public String decodeString(String text) {
        byte[] decodeString= Base64.getDecoder().decode(text);
        return(new String(decodeString));
    }

    public String getValue(By locator) {
        return find(locator).getAttribute("value");
    }

    public void selectByVisibilityText(By locators, String text) {
        Select select = new Select(find(locators));
        select.selectByVisibleText(text);
    }

    public void scrollDownUntilFound(By locators) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", locators);
    }

}
