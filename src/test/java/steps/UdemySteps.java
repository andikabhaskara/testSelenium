package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import tests.BaseTest;

public class UdemySteps extends BaseTest {
    @Given("User open Udemy website")
    public void userOpenUdemyWebsite() {
        guestHomePage.openPage();
    }

    @When("User click Login Button on Home Page")
    public void userClickLoginButtonOnHomePage() {
        guestHomePage.clickLoginButton();
    }

    @Then("User is on Login Page")
    public void userIsOnLoginPage() {
        String actual = loginPage.getTitlePage();
        Assertions.assertTrue(loginPage.isOnPage());
        Assertions.assertEquals("Log In to Your Udemy Account", actual, "Failed on assertion Login Title Page");
    }

    @When("User input valid login credential on Login Page")
    public void userInputValidLoginCredentialOnLoginPage() {
        loginPage.loginToUdemy();
    }

    @And("User click Login Button on Login Page")
    public void userClickLoginButtonOnLoginPage() {
        loginPage.clickLoginButton();
    }

    @Then("User successfully login on Udemy website")
    public void userSuccessfullyLoginOnUdemyWebsite() {
        String actual = userHomePage.myLearningText();
        Assertions.assertTrue(userHomePage.isOnPage());
        Assertions.assertEquals("Pembelajaran saya", actual, "Failed on assertion User Home Page");
    }

    @When("User input {string} on search bar Home Page")
    public void userInputOnSearchBarHomePage(String productName) {
        userHomePage.searchProduct(productName);
    }

    @Then("{string} is inputted on search bar Home Page")
    public void isInputtedOnSearchBarHomePage(String productName) {
        String actual = userHomePage.productIsInputted();
        Assertions.assertEquals(productName, actual);
    }


    @When("User click search on search bar Home Page")
    public void userClickSearchOnSearchBarHomePage() {
        userHomePage.clickSearch();
    }

    @Then("product will appears on first result")
    public void productWillAppearsOnFirstResult() {
        Assertions.assertTrue(searchResultPage.isOnPage());
    }


    @When("User click on the first result on the product")
    public void userClickOnTheFirstResultOnTheProduct() {
        searchResultPage.clickFirstProduct();
    }

    @Then("User is on product detail page")
    public void userIsOnProductDetailPage() {
        String actual = productDetailPage.getProductName();
        Assertions.assertTrue(productDetailPage.isOnPage());
        Assertions.assertEquals(CoreMatchers.containsString("Selenium WebDriver"), actual);
    }

    @When("User click Buy Product on product detail page")
    public void userClickBuyProductOnProductDetailPage() {
        productDetailPage.clickBuyNow();
    }

    @Then("User is on Checkout Page")
    public void userIsOnCheckoutPage() {
        String actual = checkoutPage.checkOutText();
        Assertions.assertTrue(checkoutPage.isOnPage());
        Assertions.assertEquals("Checkout", actual);
    }

    @When("User choose billing {string} on Checkout Page")
    public void userChooseBillingOnCheckoutPage(String country) {
        checkoutPage.selectIndonesiaCountry(country);
    }

    @When("User input {string} {string} {string} {string} credentials on Checkout Page")
    public void userInputCredentialsOnCheckoutPage(String cardName, String cardNo, String cvvNo, String expCard) {
        checkoutPage.inputDetailCard(cardName,cardNo,cvvNo,expCard);

        String actualCardName = checkoutPage.getCardName();
        String actualCardNo = checkoutPage.getCardNumber();
        String actualCvvNo = checkoutPage.getCvvNo();
        String actualExpCard = checkoutPage.getExpCard();

        Assertions.assertEquals(cardName,actualCardName);
        Assertions.assertEquals(cardNo,actualCardNo);
        Assertions.assertEquals(cvvNo,actualCvvNo);
        Assertions.assertEquals(expCard,actualExpCard);
    }

    @When("User choose Credit or Debit Card Payment on Checkout Page")
    public void userChooseCreditOrDebitCardPaymentOnCheckoutPage() {
        checkoutPage.selectCreditDebitCardPayment();
    }

    @When("User uncheck to save card on Checkout Page")
    public void userUncheckToSaveCardOnCheckoutPage() {
        checkoutPage.uncheckSaveCard();
    }

    @When("User click Pay button on Checkout Page")
    public void userClickPayButtonOnCheckoutPage() {
        checkoutPage.clickFinishCheckout();
    }

    @Then("User can see {string} as error message on Checkout Page")
    public void userCanSeeAsErrorMessageOnCheckoutPage(String errorMsg) {
        String actualMsg = checkoutPage.getErrorMessageCheckout();
        Assertions.assertEquals(errorMsg, actualMsg);
    }
}
