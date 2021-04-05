package stacksandqueues;

import java.util.NoSuchElementException;

public class PsuedoQueue {
    Stack stackOne;
    Stack stackTwo;

    public PsuedoQueue() {
        stackOne = new Stack();
        stackTwo = new Stack();
    }
    public void enQueue(Object value){
        if(stackOne.top == null){
            if(stackTwo.top == null){
                stackOne.push(value);
            }else{
                while(stackTwo.top != null){
                    stackOne.push(stackTwo.pop());
                }
                stackOne.push(value);
            }
        }else{
            stackOne.push(value);
        }
    }
    public Object deQueue(){
        Object value;
        if(stackTwo.top == null){
            if(stackOne.top == null){
                throw new NoSuchElementException();
            }else{
                while(stackOne.top != null){
                    stackTwo.push(stackOne.pop());
                }value = stackTwo.pop();
            }
        }else{
            value = stackTwo.pop();
        } return value;
    }
}
