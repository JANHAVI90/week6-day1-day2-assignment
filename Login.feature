Feature: Login functionality of Leaftaps.application.
#Background:
#Given open the chromebrowser
#And  Load the application url 'http://leaftaps.com/opentaps/control/main'
@functional 
Scenario Outline: TC001_Login test using positive credential.
And Enter the Username as <username>
And Enter the password as <password>

When  Click on the login Button.
Then Homepage should be displayed.
Examples:
|username|password|
|'demoCSR'|'crmsfa'|

@functional
Scenario Outline: TC002_Create Lead test using positive credential.
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home'should be displayed
When Click on 'Leads' link	
Then 'My Leads'should be displayed
When Click on 'Create Lead' link
Then 'Create Lead'should be displayed
Given Enter the companyName as <coName>
Given Enter the FirstName as <fName>
Given Enter the LastName as <LName>
When Click on 'submitButton' 
Then 'View Lead'should be displayed
Examples:
|username|password|coName|fName|LName|
|'demoCSR'|'crmsfa'|'TestLeaf'|'Jan'|'N'|

@functional @regression
Scenario Outline: TC003_Edit Lead test using positive credential.
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home'should be displayed
When Click on 'Leads' link
When Click on 'Find Leads' link
Given Enter the firstName as<FName>
When Click on FindLeads Button
When Click on LeadId button
Then Enter companyName as TCS
When Click on 'Edit' link
When Click on 'submitButton'
Examples:
|username|password|FName|
|'demoCSR'|'crmsfa'|'Jan'|



 @functional 
Scenario Outline: TC004_Delete Lead test using positive credential.
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home'should be displayed
When Click on 'Leads' link	
Then 'My Leads'should be displayed
Given Click on Phone number and enter the <phNo>
When Click on FindLeads Button
When Click on LeadId button
Then Click on 'Delete' link

Examples:
|username|password|phNo|
|'demoCSR'|'crmsfa'|'1234567'|


Scenario Outline: TC005_Duplicate Lead test using positive credential.
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home'should be displayed
When Click on 'Leads' link	
Then 'My Leads'should be displayed
Given Click on Phone number and enter the <phNo>
When Click on FindLeads Button
When Click on LeadId button
Then Click on 'Duplicate Lead'link

Examples:
|username|password|phNo|
|'demoCSR'|'crmsfa'|'99'|


Scenario Outline: TC006_Merging Leads using positive credential  
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home'should be displayed
Given Click_on 'Merge Leads' link
And Click on the Lookup icon '1' child window opens
And Enter first name as <FName1> and click on Find Leads button
And Select the first row and save the lead id
And Click on the Lookup icon '2' child window opens
And Enter first name as <FName2> and click on Find Leads button
And Select the first row
And Click on Merge button and click ok on the popup
When Click on 'Find Leads' link
When Enter lead id and click Find leads
Then Verify whether the Lead ID is still available

Examples:
|username|password|FName1|FName2|
|'demosalesmanager'|'crmsfa'|'Hari'|'R'|'R'|'Hari'|


#Scenario: Click login without credential
#When Click on Login button
#But Error message should be displayed


