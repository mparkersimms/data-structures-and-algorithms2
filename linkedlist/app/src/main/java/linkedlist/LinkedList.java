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

    public int counter(){
        Node currentNode = this.head;
        int counter = 0;
        while(currentNode != null) {
            counter ++;
            currentNode = currentNode.next;
        }
        return counter;
    }

    public Object kthFromEnd(int k){
        int count = counter();
        int newCount = (count - k - 1);
        Node currentNode = this.head;
        while(currentNode != null) {
            if(newCount < 0) {
                return "Sorry that is not possible";
            }else if (newCount == 0){
                return currentNode.value;
            }
            currentNode = currentNode.next;
            newCount --;
        }
        return currentNode.value;
    }

    public static LinkedList zipLists(LinkedList listOne, LinkedList listTwo){
        Node currentNode1 = listOne.head;
        Node currentNode2 = listTwo.head;
        LinkedList newLinkedList = new LinkedList();
        while (currentNode1 != null || currentNode2 != null) {
            if (newLinkedList.head == null) {
                if(currentNode1 != null) {
                    newLinkedList.insert(currentNode1.value);
                    currentNode1 = currentNode1.next;
                }else {
                    newLinkedList.insert(currentNode2.value);
                    currentNode2 = currentNode2.next;
                }
            }else if(currentNode1 != null) {
                newLinkedList.append(currentNode1.value);
                currentNode1 = currentNode1.next;
            }
            if (currentNode2 != null) {
                newLinkedList.append(currentNode2.value);
                currentNode2 = currentNode2.next;
            }
        }

        return newLinkedList;
    }
}


