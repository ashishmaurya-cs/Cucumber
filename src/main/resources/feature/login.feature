Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given user navigates to the login page by opening chrome
    When user enters the correct username and password
    Then user is directed to the home page
