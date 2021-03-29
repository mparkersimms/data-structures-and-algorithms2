package linkedlist;

public class LinkedList {
    Node head;


    public void insert(Object value){
           Node newNode = new Node(value);
           newNode.next = this.head;
           this.head = newNode;

    }
    public boolean includes(Object value) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                System.out.println("true");
                return true;
            }
            currentNode = currentNode.next;
        }
        System.out.println("false");
        return false;
        }



    public String toString(){
        String resultString ="";
        Node currentNode = this.head;
        while(currentNode != null){
            resultString += "{" + currentNode.value +  "}" + ",";
            currentNode = currentNode.next;
        }

        return resultString;
    }

    public void append(Object value){
        Node currentNode = this.head;

        while(currentNode != null){
            if(currentNode.next == null) {
                Node newNode = new Node(value);
                newNode.next = null;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
            }
        }

    public void insertBefore(Object value, Object newValue){
        Node currentNode = this.head;

        while(currentNode != null){
            if(currentNode.next.value == value) {
                Node newNode = new Node(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }
    public void insertAfter(Object value, Object newValue){
        Node currentNode = this.head;

        while(currentNode != null){
            if(currentNode.value == value) {
                Node newNode = new Node(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }

}


