Feature: upgenix.net - login functionality
  As a user, I should be able to log in so that I can land on homepage with
  valid usernames and valid passwords.

  Background:For the scenario in the feature file ,user is expected to be on the login page
    Given user is on the upgnix login web page

  @ScenarioOutline:
  Scenario Outline:
    When user enter the "<username>" in email field
    And  user enter the "<password>" in password field
    And  user click the login button and login
    Then user should see the inbox page

    @salesmanager
    Examples: We are going to use these valid salesmanager usernames and passwords to login as below
    |        username       |  password  |
    |salesmanager5@info.com |salesmanager|
    |salesmanager6@info.com |salesmanager|
    |salesmanager7@info.com |salesmanager|
    |salesmanager8@info.com |salesmanager|
    |salesmanager9@info.com |salesmanager|
    |salesmanager10@info.com|salesmanager|
    |salesmanager11@info.com|salesmanager|
    |salesmanager12@info.com|salesmanager|
    |salesmanager13@info.com|salesmanager|
    |salesmanager14@info.com|salesmanager|
    |salesmanager15@info.com|salesmanager|
    |salesmanager16@info.com|salesmanager|
    |salesmanager17@info.com|salesmanager|
    |salesmanager18@info.com|salesmanager|
    |salesmanager19@info.com|salesmanager|
    |salesmanager20@info.com|salesmanager|

    @posmanager
    Examples: We are going to use these valid posmanager usernames and passwords to login as below
      |        username      |  password  |
      |posmanager5@info.com  | posmanager |
      |posmanager6@info.com  | posmanager |
      |posmanager7@info.com  | posmanager |
      |posmanager8@info.com  | posmanager |
      |posmanager9@info.com  | posmanager |
      |posmanager10@info.com | posmanager |
      |posmanager11@info.com | posmanager |
      |posmanager12@info.com | posmanager |
      |posmanager13@info.com | posmanager |
      |posmanager14@info.com | posmanager |
      |posmanager15@info.com | posmanager |
      |posmanager16@info.com | posmanager |
      |posmanager17@info.com | posmanager |
      |posmanager18@info.com | posmanager |
      |posmanager19@info.com | posmanager |
      |posmanager20@info.com | posmanager |

