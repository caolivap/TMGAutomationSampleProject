Feature: Add little girl tennis to shopping cart
  As an Amazon user
  I want to add little girl's tennis to shopping cart
  For buying them later

  Scenario: Add little girl's tennis to shopping cart
    Given Carlos is on Amazon official homepage
    When he looks for little girl's tennis
    And he adds the Skechers Litebeams-Gleam to the shopping cart
    Then tennis should be added to shopping cart successfully
