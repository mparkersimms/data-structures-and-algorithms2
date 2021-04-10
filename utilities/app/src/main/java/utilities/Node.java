package utilities;

public class Node {

    Object value;
    Node next;

    Node(Object data, Node node){
        value = data;
        next = node;

    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
