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

}
