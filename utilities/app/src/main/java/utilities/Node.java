package utilities;

public class Node {

    public Object value;
    public Node next;

    Node(Object data, Node node){
        value = data;
        next = node;

    }

    public Node(Object value) {
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
