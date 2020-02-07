Feature: Pixel store

  Background: 
    Given App is opened

  # And OR Not tags are used
  @Regression @Smoke
  Scenario: Executive login
    When Executive enter their userid as "Alice999"
    Then system should accept her id

  @Functional
  Scenario Outline: Refund of product
    Given Alice purchased microwave for <price> dollers
    And Alice has a receipt
    When Alice returns the microwave
    Then Alice should get refund of <price> dollers

    Examples: 
      | price |
      |   100 |
      |   200 |

  @datadriven
  Scenario: Data regression
    Given user is at the registration page
    When user enters the credentials
      | TOGO   | John   | Piper | Piper |
      | ISRAEL | Jane   | Mary  | Mary  |
      | INDIA  | Parker | Peter | Peter |
    Then user registration success
    

  @Smoke
  Scenario: Signup
    When new executive uses their ids
    Then Registration is success
