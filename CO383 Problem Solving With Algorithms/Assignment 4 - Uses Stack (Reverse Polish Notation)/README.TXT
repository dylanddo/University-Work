This is similar to my assignment 3 except that the stack now follows the rules of Reverse Polish Notation. So the operators follow the operands.


So for example if we were to input the following: 2 3 + 2 2 + x 

We look to take the first operand which would be 2, then we take the next operand which is 3. The operator next to it means that we perform 2 + 3 which gives us 5.
Next we have two 2's followed by a + meaning we do 2+2 which gives us 4. Lastly we have the x which means we do 5x4 to give us a result of 20.

The stack methods pop() removes elements from the stack so for example when we are getting the operand or operator we pop it and push() then moves the next element to the top of the stack.