package utilities;



import utilities.tree.Node;
import utilities.tree.Tree;

public class FizzBuzzTree {


    Tree newTree = new Tree();
    public static Tree FizzBuzzTree(Tree tree) throws Exception {
        _FizzBuzzTree(tree.root);
        return tree;
    }
    public static void _FizzBuzzTree(Node node) throws Exception {
        if(node == null) throw new Exception("The tree is empty");
        String currentAsAString = node.value.toString();
        int i = Integer.parseInt(currentAsAString);
        if(i % 3 == 0 && i % 5 == 0){
            node.value = "FizzBuzz";
            System.out.println("node.value = " + node.value);

        }else if(i % 5 == 0){
            node.value = "Buzz";
            System.out.println("node.value = " + node.value);
        }else if(i % 3 == 0){
            node.value = "Fizz";
            System.out.println("node.value = " + node.value);

        }else{
             node.value = currentAsAString;
            System.out.println("node.value = " + node.value);

        }
        if (node.left != null) _FizzBuzzTree(node.left);
        if (node.right != null) _FizzBuzzTree(node.right);
    }

}
