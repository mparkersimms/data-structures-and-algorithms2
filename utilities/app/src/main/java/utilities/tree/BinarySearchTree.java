package utilities.tree;

import java.util.ArrayList;

public class BinarySearchTree {
    public Node root = null;

    public BinarySearchTree() {

    }

    public void addToTree(Object value) {
        if (this.root == null) this.root = new Node(value, null, null);
        Node currentNode = this.root;
        while (true) {
            if (value.toString().compareTo(currentNode.value.toString()) < 0) {
                if (currentNode.left == null) {
                    currentNode.left = new Node(value, null, null);
                    return;
                }
                currentNode = currentNode.left;
            } else if (value == currentNode.value) {
                return;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = new Node(value, null, null);
                    return;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
    }
    ArrayList<Object> resultList = new ArrayList<>();

    public ArrayList inOrderTraverseRecursive() throws Exception {
        resultList.clear();
        this._inOrderTraverseRecursive(this.root);
        return resultList;
    }
    public void _inOrderTraverseRecursive(Node node) throws Exception {
        if (node == null) throw new Exception("The list is empty");
        if (node.left != null) this._inOrderTraverseRecursive(node.left);
        resultList.add(node.value);
        if (node.right != null) this._inOrderTraverseRecursive(node.right);
    }
    public boolean contains(Object value) throws Exception {
        if (this.root == null) throw new Exception("The tree is empty");
        Node currentNode = this.root;
        while (value != currentNode.value) {
            if (currentNode.left != null && value.toString().compareTo(currentNode.value.toString()) < 0) {
                currentNode = currentNode.left;
            }else if(currentNode.right != null && value.toString().compareTo(currentNode.value.toString()) > 0){
                currentNode = currentNode.right;
            }else{
                return false;
            }
        }
            return true;
    }

}
