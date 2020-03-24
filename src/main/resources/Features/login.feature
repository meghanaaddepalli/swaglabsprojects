@SwagLabs
Feature: SwagLabs Website
  I want to use this template for my feature file

  @SwagLabs_TS1
  Scenario: Login to the website
    Given user is launching the webapplication
    When the user opens the Swaglabs Home page
    Then the user enters the username
    And the user enters the password
    Then click on the login button user will navigate to the next page

  @SwagLabs_TS2
  Scenario: Login and click all the items
    Given user is launched the webapplication
    When user opens the Swaglabs Home page
    Then user enters the username
    And user enters the password
    Then click the login button user will navigate to the next page
    And user clicks the menu button
    And user clicks the AllItems button

  @SwagLabs_TS3
  Scenario: Login and click Add to Card
    Given user is launched the web application
    When user open the Swaglabs Home page
    Then user enter the username
    And user enter the password
    Then click the login button user will navigate the next page
    And user clicks addToCard button
    And user clicks card button
    And user clicks Checkout button
    And user enters FirstName
    And user enters LastName
    And user enters Zip/Postal Code
    And user clicks the continue button
    And user clicks the Finish button

  @SwagLabs_TS4
  Scenario: Login and dropdown
    Given user is launched the web applications
    When user open the Swaglab Home page
    Then users enter the username
    And users enter the password
    Then click the login buttons user will navigate the next page
    And user click the dropdown button

  @SwagLabs_TS5
  Scenario: Login and click CancelPage,
    Given user is launched the web application,
    When user open the Swaglabs Home page,
    Then user enter the username,
    And user enter the password,
    Then click the login button user will navigate the next page,
    And user clicks addToCard button,
    And user clicks card button,
    And user clicks Checkout button,
    And user enters FirstName,
    And user enters LastName,
    And user enters Zip/Postal Code,
    And user clicks the continue button,
    And user clicks the Cancel button,

  @SwagLabs_TS6
  Scenario: Login and click Add to Card Failure.
    Given user is launched the web application.
    When user open the Swaglabs Home page.
    Then user enter the username.
    And user enter the password.
    Then click the login button user will navigate the next page.
    And user clicks card button.

   @SwagLabs_TS7
    Scenario Outline: Login to the website with multiple users
    Given launching the webapplication
    When opens the Swaglabs Home page
    Then enters the <username> 
    And enter the pas <password>
    Then click on the login button it will navigate to the next page
    Then logout from the webapplication
    Examples:
|username||password|
|standard_user||secret_sauce|
|problem_user||secret_sauce|
|performance_glitch_user||secret_sauce|

@SwagLabs_TS8
  Scenario: Login and go to about page
    Given the web application will launch
    When the user opens the Swaglabs main page
    Then the user entered the uname
    And the user entered the pswrd
    Then clicks on the login button user will navigate to next page
    Then the user clicks on about buttons
    Then the user clicks on signin button to navigate to the next page
    
    @SwagLabs_TS9
    Scenario: Login to the website
    Given user is launching the webapplications
    When the user opens the Swaglabs Home
    Then the user enters username
    And the user enters password
    Then click on the login button user will not navigate to the next page
    