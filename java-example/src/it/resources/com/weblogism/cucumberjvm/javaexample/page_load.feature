Feature: Page Loading
  As a user,
  I want to load the page
  So that the dazoodling can be splookified.

  Scenario: Simple page loading
    
    Given I am a user with the splookifying module 
    When I load the page
    Then I should see a greeting

