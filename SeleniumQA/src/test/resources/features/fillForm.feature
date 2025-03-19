Feature: Filling Form Feature

  Scenario: Displaying the Form
    Given user navigates to the Home page URL
    When user selects the FORMS section
    Then verify the FORM page is displayed
    Then click on Forms section
    And verify the Practice Form section is displayed
    Then click on Practice Form section
    Then verify the FORM is displayed
    
    @Test
   Scenario Outline: Filling the FORM with basic details
    When Form Page is displayed
    Then enter the First Name: "<FirstName>"
    Then enter the Last Name: "<LastName>"
    Then enter the Email address:	"<Email>"
    
     Examples: 
      | FirstName|LastName|Email  |
      | Mr.Xyz 	|Kumar | testing9666@gmail.com |
      
    Scenario: Filling the FORM with extra details
      When Geneder Radio buttons are displayed and enabled
      Then select the required Gender
      Then enter the Mobile number
      Then enter the Date of Birth
      Then enter the Subjects
      Then verify the Hobbies checkboxes are displayed and enabled
      Then select the required Hobbies
       
      
     