Feature: Launching the Internet.herokuapp Page

  Background: User launched the application URL
    Given User is navigated application URL

  Scenario: Verifying Add-Remove elements Page Scenario
    When click on Add-Remove elements link
    Then verify the Add-Remove elements page is open
    And click on ADD ELEMENT button
    Then verify DELETE button is displayed
    Then click on DELETE button
    Then verify for DELETE button is disappeared
    Then close the browser
