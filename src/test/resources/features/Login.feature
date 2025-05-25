Feature: validation of login functionality
#used for unique flows and edge cases
#it used to run once with hardcoded data
  Background:
    Given user is on login page

  @valid
  Scenario: login with valid credentials

    When user enters following credentials
        | username | password |
        | standard_user | secret_sauce |
        | problem_user | secret_sauce2 |
    And user clicks on login button
    #Then user should be on products page

  Scenario Outline: login with invalid credentials
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    #Then user should be on products page

    Examples:
    | username | password |
    | standard_user | secret_sauce |
    | problem_user | secret_sauce2 |
