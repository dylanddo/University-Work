This project taught me about working with a data structure by creating my own and successfully creating methods to use the stack. For example the isInteger() method checks to see if the 
input is a operand or and operator. The evaluatePrefix() method meanwhile takes the operand and depending on the operation we will add, minus or multiply the two operands.

For example if the user were to input the following: + x 2 3 4 (result is 10)
The method will take the 2 first, then take the first operator which is +, then it takes the 3 and performs the function to get 6. 
Then it will take the operand 4 then perform 6 + 4 to get 10.


The stack follows the rules of Polish notation so essentially we take the operand first next we take the next operator.

Stack is a useful data structure with useful functions like pop() which removes elements so for example when we are getting the operand or operator we pop it meaning it is removed from the 
stack. Push() then moves the next element to the top of the stack.