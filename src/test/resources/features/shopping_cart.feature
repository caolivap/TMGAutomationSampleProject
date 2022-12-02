Feature: Add little girl tennis to shopping cart
  As an Amazon potential buyer
  I want to add little girl's tennis to shopping cart
  For buying them later

  Scenario Outline: Add little girl's tennis to shopping cart
    Given Carlos is on Amazon official homepage
    When he looks for little girl's tennis
    And he adds the <tennis> to the shopping cart
    Then tennis should be added to shopping cart successfully
    Examples:
      | tennis                         |
      | Skechers Litebeams-Gleam       |
      | Skechers Tenis deportivos      |
      | DREAM PAIRS Zapatos deportivos |