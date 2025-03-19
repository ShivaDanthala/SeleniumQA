Feature: DemoQA Login Feature

  Scenario: Verifying the DemoQA Login functionality
    Given user navigates to the website
    When verify the title of login page
    Then user enters Username
    Then user enters Password
    And click on Login button
    Then verify successful login page

  #Scenario: Verifying the DemoQA Logout functionality
    When user loggedin successfully
    Then verify the user details
    Then verify the logout button
    And click on logout button
    Then verify the succesful logout
