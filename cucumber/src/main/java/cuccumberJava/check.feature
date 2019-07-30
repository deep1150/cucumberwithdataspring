Feature: check 

Scenario: check_data 

	Given I navigate to "http://localhost:3031/" 
	And I enter "6" into input field having id "empid" 
	And I enter "ram" into input field having id "fname" 
	And I enter "kumar" into input field having id "lname" 
	And I enter "23000" into input field having id "sal" 
	And I enter "07/02/2019" into input field having id "date" 
	
	When I click on element having id "submit" 
	And I wait for 10 sec 
	
	Then I should get Data added