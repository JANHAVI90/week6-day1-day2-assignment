Feature: Login  functionality of ServiceNow application.
Scenario Outline:  Creating incident using positive credential
Given  Click on Create New  and save the Incident number
And Enter <caller> and <descrp>
And Click on Submit button

Examples:
|caller|descrp|
|'Abel Tuter'|'short description'|

@functionality
Scenario: TC002_Assign Incident for positive functionality test

Given Select the No option from the dropdown and enter the IncidentNo
And Click the Incident number link
And Click on the Assignment group Lookup
And Enter 'Software' in the search box of the child window and select the group
And Click on Work Notes and enter 'Work Notes'
When Click on Update button



@functionality	
Scenario: TC003_Update Incident for positive functionality test

Given Select the No option from the dropdown and enter the IncidentNo
And Click on the Incident number link
And Click on lookup and select the 'urgency' as '1'
And Click on lookup and select the 'state' as '2'
And Click on Update button


@functionality		@regression
Scenario: TC004_Delete Incident for positive functionality test

Given Select Number from the dropdown
And Enter the Incident number
And Click on the Incident Number link
When Click delete button
Then Verify the Incident is deleted