Feature: Verifying the Popup Windows features

  Background: User launched the application 'The Playground' URL
    Given User is navigated application The Playground URL

  Scenario Outline: Popup Windows - Verifying the all available Window buttons
  When click on Popup Windows View Page button
  Then verify the "<title>" of the page
  	Then verify all the buttons for Popup Windows
  	Then navigate back to Home page
  
  	Examples:
  	|title|
  	|Multiple Windows|
  
  Scenario Outline: Popup Windows - Verifying Window1 functionality
    When click on Popup Windows View Page button
    Then click on Open New Window1 button and verify a new window is opened with title "<window1Title>"
    And verify ClickMe2 button is displayed
    Then click on ClickMe2 button
    Then verify the successful clicked
    Then close the current window

    Examples: 
      | window1Title       |
      | Frame2 (ID=frame2) |

   Scenario Outline: Popup Windows - Verifying Window2 functionality
    When click on Popup Windows View Page button
    Then click on Open New Window2 button and verify a new window is opened with title "<window2Title>"
    And verify ClickMe4 button is displayed
    #Then click on ClickMe4 button
    #Then verify the successful clicked
    #Then close the current window
    #Then navigate back to Home page
#
    #Examples: 
      #| window1Title       |
      #| Frame4 (ID=frame4) |   
      
      
      