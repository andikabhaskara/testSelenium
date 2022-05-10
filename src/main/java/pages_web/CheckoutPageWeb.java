package pages_web;

public interface CheckoutPageWeb {

    boolean isOnPage();

    String getCheckoutInfoText();

    void inputFirstName(String firstName);

    void inputLastName(String lastName);

    void inputZipCode(String zipCode);

    void clickContinueButton();
}
