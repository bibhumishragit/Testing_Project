Feature:Login feature
  Background:
    Given user is in Login page
  Scenario:Valid login
    When user lands in Login page
    Then user enters correct username
      And user enters correct password
    Then clicks on submit button
    Then user redirected to home page
  Scenario:Invalid login
    When user lands in Login page
    Then user enters incorrect username
      And user enters incorrect password
    Then clicks on submit button
    Then error displayed

