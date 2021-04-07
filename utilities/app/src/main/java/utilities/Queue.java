package utilities;

import java.util.NoSuchElementException;

public class Queue {
    Node front, rear;


    public void enQueue(Object value) {
        Node newNode = new Node(value, null);
        if(this.front == null){
            this.front = newNode;
        }else{
            this.rear.next = newNode;
        }
        this.rear = newNode;
    }


    public Object deQueue(){
        if(this.front == null) throw new NoSuchElementException();
        Object value = this.front.value;
        this.front = this.front.next;
        return value;
    }
    public Object peek(){
        if(isEmpty()) throw new NoSuchElementException();
        return this.front.value;
    }

    public boolean isEmpty(){
        return this.front == null;
    }




    public String toString() {
        String resultString = "";
        Node currentNode = this.front;
        while (currentNode != null) {
            resultString += "{" + currentNode.value + "}" + "->";
            currentNode = currentNode.next;
        }

        return resultString;
    }
}

