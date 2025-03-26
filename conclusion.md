# TICKET-101 | Conclusion
## Backend implementation

### DecisionEngine
The class for calculating the maximum approved loan amount at its current place works as intended, however
credit score calculation is not yet implemented, which makes the ticket remain unresolved.

I've added a method `getCreditScore` as well as refactored the `calculateApprovedLoan` for the `DecisionEngine` class to resolve the problem.

Overall the solution is clean and comfortable to built on top of, but with the next rendition of the class, perhaps, not using an instance variable for the credit modifier would be better, since it is only calculated when the `calculateApprovedLoan` method is called and other methods that use it can just get it as an argument, as opposed to accessing it as an instance variable.

### DecisionEngineController
It works overall, again, but here the shared `DecisionResponse` is not ideal for threads, because at some point multiple threads can use the same instance and the service may end up not working as intended. That I had fixed with a simple refactor, now the `DecisionResponse` is created on demand.

## Frontend implementation

The maximum loan sum approved is being sent to the frontend app correctly, but for some reason the highest amount possible for the given loan period is only shown when the amount slider is maxed out. That is handy when the customer wants to just know whether the current amount is approved or not, but for the next rendition having a maximum approved amount displayed somewhere near the approved loan amount would be more ideal, than not.