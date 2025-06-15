Feature: Launching the The Playground Page

  Background: User launched the application 'The Playground' URL
    Given User is navigated application The Playground URL

  Scenario: Wait Conditions - Verifying the Alert Scenarios
    When click on Wait Conditions View Page button
   	Then verify the Wait for Alert To Be Present Header is displayed
   	Then verify the Show Alert button is displayed
    And click on Show Alert button
    Then verify Alert and Accept
    Then verify Alert handled successfully
    Then verify the Show Prompt button is displayed
    And click on Show Prompt button
    Then verify AlertPrompt handled successfully
    Then close the browser

   Scenario: Wait Conditions - Verifying the Element To Be Visible Scenarios
    When click on Wait Conditions View Page button
    Then verify the Wait for Element To Be Visible Header is displayed
    And Click on TRIGGER button in Element To Be Visible Header section
    Then Wait for visibilty of CLICK ME button
    Then click on CLICK ME button
    Then verify the Displayed Options
    Then close the browser
    
   Scenario: Wait Conditions - Verifying the Element To Be Visible Scenarios
    When click on Wait Conditions View Page button
    Then verify the Wait for Element To Be Invisible Header is displayed
    And Click on TRIGGER button in Element To Be Invisible Header section
    Then Wait for Invisibilty of spinner
    Then verify the text Thank God that spinner is gone!
    Then close the browser
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    