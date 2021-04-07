# Utilities
Code challenge 12 

Create an animal class and add animals of either class dog, or cat to the queue using first in first out approach. 
If the animal is not a dog or a cat, throw an exception. Be able to dequeue the dog or the cat that has been in the animal
shelter the longest. 

Code Challenge 13 

Create a method that takes in a string, and returns a boolean if the string contains balanced brackets or not. 

## Approach 
code challenge 12
create an enQueue method that takes in an animal and places it in the 
cue that corresponds with its type (dog or Cat); 
Create a deQueue method that takes a parameter either dog or cat, and 
returns the animal of said type that has been in the animal shelter the longest

code Challenge 13

Iterate through the string. If the character is a opening bracket, push it into a stack. if the character is a closing bracket
determine if  the top of the stack is the opening bracket of the same type. if it is, continue, if it is not, return false. 
once the entire string has been looped through, determine if the stack is empty. If it is, return true, if not return false. 


## Big O 
Challenge 12
Time: O(1);

space: O(1);

challenge 13

Time: O(n);
Space: O(1);