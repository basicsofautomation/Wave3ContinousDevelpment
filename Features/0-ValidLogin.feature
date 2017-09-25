# Valid Login feature
# Is pre-requisite for execution of any Zephyr Test Plan 
# Feature is common for all applications EPC5, CNH, JD, Power etc. 
# Variations in different applications will be handled via properties or configuration settings
# No data is required in scenario 

Feature: Valid Login

@Execute
Scenario: Valid Application Login
Given Application Is Launched
When User Authenticate 
Then Application Available For Use