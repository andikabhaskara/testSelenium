@Udemy @Web
  Feature: Checkout Product

    Scenario Outline: As a User, I can buy course using credit card on Udemy Website
      Given User open Udemy website
      When User click Login Button on Home Page
      Then User is on Login Page
      When User input valid login credential on Login Page
      And User click Login Button on Login Page
      Then User successfully login on Udemy website
      When User input "<productName>" on search bar Home Page
      Then "<productName>" is inputted on search bar Home Page
      When User click search on search bar Home Page
      Then product will appears on first result
      When User click on the first result on the product
      Then User is on product detail page
      When User click Buy Product on product detail page
      Then User is on Checkout Page
      When User choose billing "<country>" on Checkout Page
      When User choose Credit or Debit Card Payment on Checkout Page
      When User input "<cardName>" "<cardNo>" "<cvvNo>" "<expDateCard>" credentials on Checkout Page
      When User uncheck to save card on Checkout Page
      When User click Pay button on Checkout Page
      Then User can see "<errorMsg>" as error message on Checkout Page

      Examples:
        | productName        | country   | cardName | cardNo           | cvvNo | expDateCard | errorMsg                                                                                                                       |  |
        | Selenium Webdriver | Indonesia | Mandiri  | 1234567891011234 | 123   | 1230        | Detail kartu tidak valid. Anda belum ditagih. Masukkan detail kartu tepat seperti yang tertulis pada kartu Anda dan coba lagi. |  |