package pages_web;

public interface CheckoutPageWeb {

    boolean isOnPage();

    String checkOutText();

    void selectIndonesiaCountry(String country);

    void selectCreditDebitCardPayment();

    void inputDetailCard(String cardName, String cardNo, String cvvNo, String expCard);

    String getCardName();

    String getCardNumber();

    String getCvvNo();

    String getExpCard();

    void uncheckSaveCard();

    void clickFinishCheckout();

    String getErrorMessageCheckout();
}
