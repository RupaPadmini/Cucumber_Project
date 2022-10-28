#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@regression
Feature: Login Button Testing
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Clicking on Login button on homepage
    Given User must be on homepage by clicking on url "https://demoblaze.com/"
    When click on Login button
    And Enter valid <username> and <password>
    And User clicks on Login button
    Then User account should be opened

    Examples: 
      | username    | password |
      | RupaPadmini | seetha   |
      | RaviChandra | Rama     |
