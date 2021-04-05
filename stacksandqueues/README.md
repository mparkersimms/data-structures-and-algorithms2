# Stacks and Queues
This application is all about Stacks and Queues. Using nodes
and LinkedLists, Stacks are built using the first in last 
out methodology, while the queues are built using the 
first in first out methodology.

## Challenge
The challenge for this app was to design stack and queue
classes with methods that add nodes and remove nodes 
appropriately to given linkedlist (either a stack or a 
queue).

## Approach & Efficiency
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

## API
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