Feature: Sample App Login Functionality

  Background:
    Given Laura is on the sample app login page

  Scenario: Successful Login
    When She logs in with "TestUser" as the username and "pwd" as the password
    Then should see the message "Welcome, TestUser!"


  Scenario: Failed Login with Invalid Credentials
    When She logs in with "TestUser" as the username and "wrongpwd" as the password
    Then should see the message "Invalid username/password"


  Scenario Outline: Failed Login with Missing Credentials
    When She logs in with "<username>" as the username and "<password>" as the password
    Then should see the message "Invalid username/password"
    Examples:
      | username  | password |
      |           |          |
      | TestUser  |          |
      |           | pwd      |

  Scenario: Logout After Successful Login
    When She logs in with "Admin" as the username and "pwd" as the password
    When She clicks the Log Out button
    Then should see the message "User logged out."