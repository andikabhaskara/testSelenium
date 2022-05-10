package pages_web;

public interface ProductDetailPageWeb {

    boolean isOnPage();
    String getProductName();
    String getProductPrice();
    void clickAddToCard();
    String isProductAdded();
    void clickCheckoutCart();
}
