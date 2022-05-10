@Saucedemo @Web
Feature: Checkout Product

  Scenario Outline: As a User, I can buy product on Swag Labs Website
    Given User open Swag Labs website
    Then User is on Login Page
    When User input valid login credential on Login Page
    And User click Login Button on Login Page
    Then User successfully login on Swag Labs website

    When User sort product from "<sortProduct>" on Home Page
    Then "<productName>" as the first product on Home Page
    When User click first product on Home Page
    Then User is on Product Detail Page
    And User will see "<productName>" as product detail on Product Detail Page
    And User will see "<productPrice>" as product price on Product Detail Page
    When User click Add To Cart button on Product Detail Page
    Then User can see product is added to cart on Product Detail Page
    When User click Checkout Cart button on Product Detail Page

    Then User is on Checkout Cart Page
    And User will see "<productName>" as product detail on Checkout Cart Page
    And User will see "<productPrice>" as product price on Checkout Cart Page
    When User click Checkout button on Checkout Cart Page
    Then User is on Checkout Page
    When User input "<firstName>" as First Name on Checkout Page
    And User input "<lastName>" as Last Name on Checkout Page
    And User input "<zipCode>" as Zip Code on Checkout Page
    And User click Continue button on Checkout Page

    Then User is on Checkout Overview Page
    And User can see "<productName>" and "<productPrice>" on Checkout Overview Page
    And User can see "<paymentInfo>" as Payment Information on Checkout Overview Page
    And User can see "<deliveryInfo>" as Delivery Information on Checkout Overview Page
    And User can see "<itemTotalPrice>" as Item Total Price on Checkout Overview Page
    And User can see "<taxPrice>" as Tax Price on Checkout Overview Page
    And User can see "<totalPrice>" as Total Price on Checkout Overview Page
    When User click Finish button on Checkout Overview Page

    Then User is on Result Page
    And User can see Complete Order Title on Result Page
    And User can see Complete Order Description on Result Page

    Examples:
      | sortProduct         | productName              | productPrice | firstName | lastName | zipCode | paymentInfo      | deliveryInfo                | itemTotalPrice     | taxPrice   | totalPrice    |  |
      | Price (high to low) | Sauce Labs Fleece Jacket | $49.99       | John      | Doodle   | 16710   | saucecard #31337 | free pony express delivery! | item total: $49.99 | tax: $4.00 | total: $53.99 |  |