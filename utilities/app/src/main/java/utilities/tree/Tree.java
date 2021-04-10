package utilities.tree;


import java.util.ArrayList;
import java.util.Stack;

public class Tree {
    public Node root = null;

    public Tree() {

    }

    public ArrayList preOrderTraverseIterative() throws Exception {
        ArrayList<Object> resultList = new ArrayList<>();
        if (this.root == null) throw new Exception("The stack is empty");
        Stack<Node> stack = new Stack<>();
        stack.push(this.root);
        while (!stack.isEmpty()) {
            Node listItem = stack.pop();
            resultList.add(listItem.value);
            if (listItem.right != null) stack.push(listItem.right);
            if (listItem.left != null) stack.push(listItem.left);
        }
        return resultList;
    }

    ArrayList<Object> resultList = new ArrayList<>();

    public ArrayList preOrderTraverseRecursive() throws Exception {
        resultList.clear();
        this._preOrderTraverseRecursive(this.root);
        return resultList;
    }

    public void _preOrderTraverseRecursive(Node node) throws Exception {
        if (node == null) throw new Exception("The list is empty");
        resultList.add(node.value);
        if (node.left != null) this._preOrderTraverseRecursive(node.left);
        if (node.right != null) this._preOrderTraverseRecursive(node.right);
    }



//    public ArrayList inOrderTraverseIterative() throws Exception {
//        ArrayList<Object> resultList = new ArrayList<>();
//        if (this.root == null) throw new Exception("The stack is empty");
//        Stack<Node> stack = new Stack<>();
//        Node currentNode = this.root;
//        stack.push(currentNode);
//        while (currentNode.left != null) {
//            stack.push(currentNode.left);
//            currentNode = currentNode.left;
//        }
//        while (!stack.isEmpty()){
//            Node listItem = stack.pop();
//            resultList.add(listItem.value);
//            if (listItem.right != null) stack.push(listItem.right);
////            if (listItem.left != null) stack.push(listItem.left);
//        }
//        while (currentNode.left != null){
//            stack.push(currentNode.left);
//            currentNode = currentNode.left;
//        }
//        while (!stack.isEmpty()){
//            Node listItem = stack.pop();
//            resultList.add(listItem.value);
//            if (listItem.right != null) stack.push(listItem.right);
//    }
//        return resultList;
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
    public ArrayList postOrderTraverseRecursive() throws Exception {
        resultList.clear();
        this._postOrderTraverseRecursive(this.root);
        return resultList;
    }
    public void _postOrderTraverseRecursive(Node node) throws Exception {
        if (node == null) throw new Exception("The list is empty");
        if (node.left != null) this._postOrderTraverseRecursive(node.left);
        if (node.right != null) this._postOrderTraverseRecursive(node.right);
        resultList.add(node.value);
    }

}
//}


