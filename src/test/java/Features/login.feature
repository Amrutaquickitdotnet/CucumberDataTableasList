Feature: I want to perform login functionality
   Scenario Outline: Perform login functionality of orangeHRM
    Given I have valid url to be enter
    When I enter "<username>" details And I enter "<password>" Details
    And click on login button
   	Then I can able to login successfully
   	Examples:
  
   	|	username	| password	|
   	|	Admin	|	admin123	|
   	|	Amruta19	|	Amruta19	|