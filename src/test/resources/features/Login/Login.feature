@loginAndLogout
Feature: User can login the Yemekpay BO App
  As a user I want to login to Yemekpay Backoffice




  @login
  Scenario: Login to Yemeksepeti
    Given User opens Yemeksepeti URL
    And User see Yemeksepeti Text
    When User clicks Login Button
    And User sees "Giriş Yap" Button Popup
    And User sees "Kayıt Ol" Button Pop
    And User click "Giriş Yap" Button Popup
    And User enters email as "enesercebi15@gmail.com"
    And User clicks continue button
    And User enters password "Enes6761."
    And User clicks on login with password button

  Scenario: Add Product to cart
    Then User enters postal code "67500"
    Then User clicks Discover button
    Then User clicks on a restaurant
    Then User clicks the first product
    And User clicks Add to Cart button
    And User clicks confirm cart button

  Scenario: Fail Login to Yemeksepeti
    Given User opens Yemeksepeti URL
    And User see Yemeksepeti Text
    When User clicks Login Button
    And User sees "Giriş Yap" Button Popup
    And User sees "Kayıt Ol" Button Pop
    And User click "Giriş Yap" Button Popup
    And User enters email as "enesercebi15@gmail.com"
    And User clicks continue button
    And User enters password "Enes67."
    And User clicks on login with password button
    Then User sees error message "E-postanız veya şifreniz doğru değil. Tekrar deneyin veya şifrenizi sıfırlayın."


  Scenario: Login to Yemeksepeti with e-mail
    Given User opens Yemeksepeti URL
    And User see Yemeksepeti Text
    And User clicks Google button
    And the user selects an account from the login iframe
    Then the user is logged in successfully
