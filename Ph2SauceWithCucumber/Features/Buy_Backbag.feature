Feature: Order a Backbag

Scenario: A user should be able to order a Backbag successfully on Sauce
Given a user is on the landing page of Sauce
When Clicks the Username field 
And Enter the UserName standarduser
And Clicks the Password field 
And Enter the Password  secretsauce
And He clicks Login Button
And He clicks on first Sauce Labs Backpack
And He clicks Add to Cart button
And He clicks on Cart symbol
And He clicks on the Checkout button
And He clicks on FirstName field
And He Enters the FirstName on field
And He clicks on LastName field
And He Enters the LastName on field
And He clicks on PostalCode field
And He Enters the PostalCode on field
And He clicks Continue button
And He clicks the Finish button
Then he must able to order Backbag successfully