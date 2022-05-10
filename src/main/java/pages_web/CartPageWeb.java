package pages_web;

public interface CartPageWeb {

    boolean isOnPage();

    String checkOutText();

    String getProductName();

    String getProductPrice();

    void clickCheckoutButton();

}
