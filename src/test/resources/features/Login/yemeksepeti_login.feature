@yemeksepetiLogin
Feature: Yemeksepeti.com kullanıcı girişi
  Scenario: Kullanıcı yemeksepeti.com’a girip login olur
    Given Kullanıcı yemeksepeti.com ana sayfasına gider
    When  "Giriş Yap" butonuna tıklar
    And   email kutusuna "otomasyon@yemekpay.com" yazar
    And   şifre kutusuna "123456" yazar
    And   giriş butonuna tıklar
    Then  ana sayfa yüklenir