@Profile_legal_page
Feature: Validate profile legal page in customer application

  @profile_legal_page_elements
  Scenario: Validate legal page in the profile page
    Given Verify that user is on the profile legal page of the customer application
    Then Verify that legal title text should be displayed in the profile legal page
    Then Verify that back button should be displayed in the profile legal page
    Then Verify that back button should be clickable in the profile legal page
    Then Verify that FAQ link should be dislayed in the profile legal page
    Then Verify that FAQ link should be clickable in the profile legal page
    Then Verify that privacy policy link should be displayed in the profile legal page
    Then Verify that privacy policy link should be clickable in the profile legal page
    Then Verify that term and conditions link should be displayed in the profile legal page
    Then Verify that term and conditions link should be clickable in the profile legal page
