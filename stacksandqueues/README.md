# Stacks and Queues
This application is all about Stacks and Queues. Using nodes
and LinkedLists, Stacks are built using the first in last 
out methodology, while the queues are built using the 
first in first out methodology.

## Challenges
### challenge 1 
The challenge for this app was to design stack and queue
classes with methods that add nodes and remove nodes 
appropriately to given linkedlist (either a stack or a 
queue).
### challenge 2
This challenge was about creating a queue that only uses two 
internal stacks to complete the appropriate "first in first out" approach. 
## Approach & Efficiency
### challenge 1
The approach I took was using a Nodes properties of a value
and a pointer to the next node, and use that effectively
to determine where a Node should be placed in the linked
list, and determine what that node, and existing nodes 
pointers should point at to combine to make the appropriate
linkedlist. 
The big O for the stack methods are as follows:
push: time - O(1); space - O(1);
pop: time - O(1); space - O(1);
peek: time - O(1); space - null;
isEmpty: time - O(1); space - O(1);
The Big O for the queue methods are as follows:
enQueue: time - O(n); space O(1);
deQueue: time - O(n); space O(1);
peek: time - O(1); space null;
isEmpty: time - O(1); space O(1);
### challenge 2
The approach I took to this challenge was to create two 
stacks inside the psuedoqueue class. 
The enque method checks to see if the first stack is empty, if it is, to 
check the second stack and see if it is empty. If both stacks are empty, 
push the input value into the first stack. If the first stack is empty, and the 
second stack is not empty, then move all the values from the second stack
to the first stack and then add the input value to the first stack. 
if the first stack is not empty, add the input value to the first stack. 
The dequeue method checks the second stack for values, and if it is empty, then checks
the first stack for a value. If both are empty, throws an error. If the second stack is empty,
and the first stack is not empty, move all the values from the first stack 
into the second stack and remove the top value of the second stack. 
if the second stack is not empty, remove the top value of the second stack. 
## API
### challenge 1
Stack Methods:
push: add a Node to the top of the stack
pop: remove a Node from the top of the stack
peek: return the value of the Node at the top of the 
stack if there is a Node there
isEmpty: return a boolean if the stack is empty or not
Queue methods:
enQueue: add a Node to the end of the queue
deQueue: remove a node from the front of the queue
peek: return the value of the Node at the front of the
queue if there is a Node there
isEmpty: return a boolean if the queue is empty or not

### challenge 2
enQueue: 
Time: O(n);
space: O(1);

deQueue:
Time: O(n);
space: O(1);

    