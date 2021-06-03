package stacksandqueues;

import java.util.EmptyStackException;

public class Stack {
    Node top;



    public void push(Object value) {
        this.top = new Node(value, this.top);
    }

    public Object pop() {
        if(this.top == null) throw new EmptyStackException();
        Object value = this.top.value;
        this.top = this.top.next;
        return value;
    }

    public Object peek(){
        if(this.top == null) throw new EmptyStackException();
        return this.top.value;
    }
    public boolean isEmpty(){
        return this.top == null;
    }


    public String toString() {
        String resultString = "";
        Node currentNode = this.top;
        while (currentNode != null) {
            resultString += "{" + currentNode.value + "}" + "->";
            currentNode = currentNode.next;
        }

        return resultString;
    }
}
