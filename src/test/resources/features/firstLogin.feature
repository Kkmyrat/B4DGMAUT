Feature: Login Functionality

  @wip
  Scenario: I should be able to first login
    Given The user is on the first login page
    When The user enters first username "ders@dgmarkt.com" and first password "2574dGlogin"
    Then The user should be on the main page and can see the "Your Store" text as title
    When The user clicks the "Login" link under "My Account" menu
    And The user enters the personal username and password
    Then The user should be on the dashboard page and can see the " Congratulation! Login Successfully" success message
