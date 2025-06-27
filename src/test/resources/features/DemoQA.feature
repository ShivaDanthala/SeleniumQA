#Feature: Filling Form Feature
#
#Scenario: Verifying the DemoQA Login functionality
    #Given user navigates to the website
    #When verify the title of login page
    #Then user enters Username
    #Then user enters Password
    #And click on Login button
    #Then verify successful login page
#
  #Scenario: Verifying the DemoQA Logout functionality
    #When user loggedin successfully
    #Then verify the user details
    #Then verify the logout button
    #And click on logout button
    #Then verify the succesful logout
    #
  #Scenario: Displaying the Form
    #Given user navigates to the Home page URL
    #When user selects the FORMS section
    #Then verify the FORM page is displayed
    #Then click on Forms section
    #And verify the Practice Form section is displayed
    #Then click on Practice Form section
    #Then verify the FORM is displayed
    #
   #Scenario Outline: Filling the FORM with basic details
    #When Form Page is displayed
    #Then enter the First Name: "<FirstName>"
    #Then enter the Last Name: "<LastName>"
    #Then enter the Email address:	"<Email>"
    #
     #Examples: 
      #| FirstName|LastName|Email  |
      #| Mr.Xyz 	|Kumar | testing9666@gmail.com |
      #
    #Scenario: Filling the FORM with extra details
      #When Geneder Radio buttons are displayed and enabled
      #Then select the required Gender
      #Then enter the Mobile number
      #Then enter the Date of Birth
      #Then enter the Subjects
      #Then verify the Hobbies checkboxes are displayed and enabled
      #Then select the required Hobbies
       #
      #
     