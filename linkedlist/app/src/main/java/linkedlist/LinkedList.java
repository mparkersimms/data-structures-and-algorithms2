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

        boolean result = false;
        while (currentNode.value != null) {
            System.out.println("this is rediculous");
            if (currentNode.value == value) {
                result = true;
                System.out.println("true");
                return result;
            } else {
                System.out.println("this is the boolean answer2 " + currentNode.value + " " +  value);
                currentNode = currentNode.next;

            }
//        System.out.println("this is the boolean answer " + result);
//        return result;
        }
        return result;
        }



    public String toString(){
        String resultString ="";
        Node currentNode = this.head;
        while(currentNode != null){
            resultString += "{" + currentNode.value +  "}" + ",";
            currentNode = currentNode.next;
        }

        return "This is a test string " + resultString;
    }

}
