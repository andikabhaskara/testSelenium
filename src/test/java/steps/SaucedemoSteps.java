package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import tests.BaseTest;

public class SaucedemoSteps extends BaseTest {
    @Given("User open Swag Labs website")
    public void userOpenSwagLabsWebsite() {
        guestHomePage.openPage();
    }

    @Then("User is on Login Page")
    public void userIsOnLoginPage() {
        String actual = loginPage.getTitlePage();
        Assertions.assertTrue(loginPage.isOnPage());
        Assertions.assertEquals("swag labs", actual.toLowerCase(), "Failed on assertion Login Title Tab");
    }

    @When("User input valid login credential on Login Page")
    public void userInputValidLoginCredentialOnLoginPage() {
        loginPage.loginToWebsite();
    }

    @And("User click Login Button on Login Page")
    public void userClickLoginButtonOnLoginPage() {
        loginPage.clickLoginButton();
    }

    @Then("User successfully login on Swag Labs website")
    public void userSuccessfullyLoginOnSwagLabsWebsite() {
        String actual = userHomePage.shoppingTitleText();
        Assertions.assertTrue(userHomePage.isOnPage());
        Assertions.assertEquals("products", actual.toLowerCase(), "Failed on assertion User Home Page");
    }

    @When("User sort product from {string} on Home Page")
    public void userSortProductFromOnHomePage(String productName) {
        userHomePage.sortProduct(productName);
    }

    @Then("{string} as the first product on Home Page")
    public void asTheFirstProductOnHomePage(String productName) {
        String actual = userHomePage.productResult();
        Assertions.assertEquals(productName, actual);
    }


    @When("User click first product on Home Page")
    public void userClickFirstProductOnHomePage() {
        userHomePage.clickFirstProduct();
    }

    @Then("User is on Product Detail Page")
    public void userIsOnProductDetailPage() {
        Assertions.assertTrue(productDetailPage.isOnPage());
    }

    @Then("User will see {string} as product detail on Product Detail Page")
    public void userWillSeeAsProductDetailOnProductDetailPage(String productName) {
        String actual = productDetailPage.getProductName();
        Assertions.assertEquals(productName, actual);

    }

    @Then("User will see {string} as product price on Product Detail Page")
    public void userWillSeeAsProductPriceOnProductDetailPage(String productPrice) {
        String actual = productDetailPage.getProductPrice();
        Assertions.assertEquals(productPrice, actual);
    }

    @When("User click Add To Cart button on Product Detail Page")
    public void userClickAddToCartButtonOnProductDetailPage() {
        productDetailPage.clickAddToCard();
    }

    @Then("User can see product is added to cart on Product Detail Page")
    public void userCanSeeProductIsAddedToCartOnProductDetailPage() {
        String actual = productDetailPage.isProductAdded();
        Assertions.assertEquals("1", actual);
    }

    @When("User click Checkout Cart button on Product Detail Page")
    public void userClickCheckoutCartButtonOnProductDetailPage() {
        productDetailPage.clickCheckoutCart();
    }

    @Then("User is on Checkout Cart Page")
    public void userIsOnCheckoutCartPage() {
        String actual = cartPage.checkOutText();
        Assertions.assertTrue(cartPage.isOnPage());
        Assertions.assertEquals("your cart", actual.toLowerCase());
    }

    @And("User will see {string} as product detail on Checkout Cart Page")
    public void userWillSeeAsProductDetailOnCheckoutCartPage(String productName) {
        String actual = cartPage.getProductName();
        Assertions.assertEquals(productName, actual);
    }

    @And("User will see {string} as product price on Checkout Cart Page")
    public void userWillSeeAsProductPriceOnCheckoutCartPage(String productPrice) {
        String actual = cartPage.getProductPrice();
        Assertions.assertEquals(productPrice, actual);
    }

    @When("User click Checkout button on Checkout Cart Page")
    public void userClickCheckoutButtonOnCheckoutCartPage() {
        cartPage.clickCheckoutButton();
    }

    @Then("User is on Checkout Page")
    public void userIsOnCheckoutPage() {
        String actual = checkoutPage.getCheckoutInfoText();
        Assertions.assertTrue(checkoutPage.isOnPage());
        Assertions.assertEquals("checkout: your information", actual.toLowerCase());
    }

    @When("User input {string} as First Name on Checkout Page")
    public void userInputAsFirstNameOnCheckoutPage(String firstName) {
        checkoutPage.inputFirstName(firstName);
    }

    @When("User input {string} as Last Name on Checkout Page")
    public void userInputAsLastNameOnCheckoutPage(String lastName) {
        checkoutPage.inputLastName(lastName);
    }

    @When("User input {string} as Zip Code on Checkout Page")
    public void userInputAsZipCodeOnCheckoutPage(String zipCode) {
        checkoutPage.inputZipCode(zipCode);
    }

    @When("User click Continue button on Checkout Page")
    public void userClickContinueButtonOnCheckoutPage() {
        checkoutPage.clickContinueButton();

    }

    @Then("User is on Checkout Overview Page")
    public void userIsOnCheckoutOverviewPage() {
        overviewPage.isOnPage();
    }

    @Then("User can see {string} and {string} on Checkout Overview Page")
    public void userCanSeeAndOnCheckoutOverviewPage(String productName, String productPrice) {
        String actual1 = overviewPage.getProductName();
        String actual2 = overviewPage.getProductPrice();
        Assertions.assertEquals(productName, actual1);
        Assertions.assertEquals(productPrice, actual2);
    }

    @And("User can see {string} as Payment Information on Checkout Overview Page")
    public void userCanSeeAsPaymentInformationOnCheckoutOverviewPage(String paymentInfo) {
        String actual = overviewPage.getPaymentInfo();
        Assertions.assertEquals(paymentInfo, actual.toLowerCase());
    }

    @And("User can see {string} as Delivery Information on Checkout Overview Page")
    public void userCanSeeAsDeliveryInformationOnCheckoutOverviewPage(String deliveryInfo) {
        String actual = overviewPage.getDeliveryInfo();
        Assertions.assertEquals(deliveryInfo, actual.toLowerCase());
    }

    @And("User can see {string} as Item Total Price on Checkout Overview Page")
    public void userCanSeeAsItemTotalPriceOnCheckoutOverviewPage(String itemTotalPrice) {
        String actual = overviewPage.getItemTotalPrice();
        Assertions.assertEquals(itemTotalPrice, actual.toLowerCase());
    }

    @And("User can see {string} as Tax Price on Checkout Overview Page")
    public void userCanSeeAsTaxPriceOnCheckoutOverviewPage(String taxPrice) {
        String actual = overviewPage.getTaxPrice();
        Assertions.assertEquals(taxPrice, actual.toLowerCase());
    }

    @And("User can see {string} as Total Price on Checkout Overview Page")
    public void userCanSeeAsTotalPriceOnCheckoutOverviewPage(String totalPrice) {
        String actual = overviewPage.getTotalPrice();
        Assertions.assertEquals(totalPrice, actual.toLowerCase());
    }

    @When("User click Finish button on Checkout Overview Page")
    public void userClickFinishButtonOnCheckoutOverviewPage() {
        overviewPage.clickFinishButton();
    }

    @Then("User is on Result Page")
    public void userIsOnResultPage() {
        Assertions.assertTrue(resultPage.isOnPage());
    }

    @And("User can see Complete Order Title on Result Page")
    public void userCanSeeCompleteOrderTitleOnResultPage() {
        String actual = resultPage.getCompleteOrderText();
        Assertions.assertEquals("thank you for your order", actual.toLowerCase());
    }

    @And("User can see Complete Order Description on Result Page")
    public void userCanSeeCompleteOrderDescriptionOnResultPage() {
        String actual = resultPage.getCompleteDescText();
        Assertions.assertEquals("your order has been dispatched, and will arrive just as fast as the pony can get there!", actual.toLowerCase());
    }
}
