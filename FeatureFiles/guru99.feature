
@EndToEndTesting
Feature: Test Guru99 application

  Scenario: Test register page of guru99
    Given User open register page url on "edge" browser
    Then User enter Firstname lastname phone email
      | abc | xyz | 9876543210 | abx@gmail.com |
    And user enters address city state pincode and country
      | pune | Pune | Maharashta | 444444 | INDIA |
    And User enter username and password and confirm password and click on submit button
      | abc123 | abc@123 | abc@123 |
