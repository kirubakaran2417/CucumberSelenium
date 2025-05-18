Feature: validation of login functionality
#used for unique flows and edge cases
#it used to run once with hardcoded data
  @valid
  Scenario: login with valid credentials
    Given user is on login page
    When user enters username "standard_user" and password "secret_sauce"
    And user clicks on login button
    #Then user should be on products page

  Scenario Outline: login with invalid credentials
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    #Then user should be on products page

    Examples:
    | username | password |
    | standard_user | secret_sauce |
    | problem_user | secret_sauce2 |
