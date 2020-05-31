Feature: As a user I want to know temperatures of various cities in India
  so that I can take appropriate precautions

  Scenario: To check the service returns temperature of a given city
    When call temperature service for city Hyderabad
    Then temperature of Hyderabad should be returned
