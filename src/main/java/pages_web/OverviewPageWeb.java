package pages_web;

public interface OverviewPageWeb {

    boolean isOnPage();

    String getProductName();

    String getProductPrice();

    String getPaymentInfo();

    String getDeliveryInfo();

    String getItemTotalPrice();

    String getTaxPrice();

    String getTotalPrice();

    void clickFinishButton();

}
