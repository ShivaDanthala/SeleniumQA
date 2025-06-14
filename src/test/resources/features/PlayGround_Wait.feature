Feature: Launching the The Playground Page

  Background: User launched the application 'The Playground' URL
    Given User is navigated application The Playground URL

  Scenario: Verifying Wait Conditions Scenario
    When click on Wait Conditions View Page button
   	Then verify the Wait for element to be visible Header is displayed
   	Then verify the Show Alert button is displayed
    And click on Show Alert button
    Then verify Alert and Accept
    Then verify Alert handled successfully
    Then verify the Show Prompt button is displayed
    And click on Show Prompt button
    Then verify AlertPrompt handled successfully
