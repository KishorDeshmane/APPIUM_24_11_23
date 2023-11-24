@Profile_add_a_tenant_page
Feature: Validate profile add a tenant page in customer application

  @add_a_tenant_page_elements
  Scenario: Validate add a tenant page in the profile add a tenant page
    Given Verify that user is on the profile add a tenant page of the customer application
    Then Verify that manage tenants title text should be displayed in the add a tenant page
    Then Verify that back button should be displayed in the add a tenant page
    Then Verify that back button should be clickable in the add a tenant page
    Then Verify that plus add new tenant button should be displayed in the add a tenant page
    Then Verify that plus add new tenant button should be clickable in the add a tenant page
