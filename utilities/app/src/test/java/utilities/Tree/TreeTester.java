package utilities.Tree;

import org.junit.Test;
import utilities.FizzBuzzTree;
import utilities.tree.BinarySearchTree;
import utilities.tree.Node;
import utilities.tree.Tree;
import org.junit.*;
import static org.junit.Assert.*;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeTester {

    @Test public void treeTest() throws Exception {
        Tree testTree = new Tree();
        testTree.root = new Node("First Value", null, null);
        testTree.root.left = new Node("Second Value", null, null);
        testTree.root.right = new Node("Third Value", null, null);
        testTree.root.left.left = new Node("Fourth Value", null, null);
        testTree.root.left.right = new Node("Fifth Value", null, null);
        testTree.root.right.left = new Node("Sixth Value", null, null);

        System.out.println(testTree.preOrderTraverseIterative());
        ArrayList<String> expected =new ArrayList<String>(Arrays.asList("First Value", "Second Value", "Fourth Value", "Fifth Value", "Third Value", "Sixth Value"));
        ArrayList actual = testTree.preOrderTraverseIterative();
        assertEquals(expected, actual);


        ArrayList<String> expected2 = new ArrayList<String>(Arrays.asList("Fourth Value", "Second Value", "Fifth Value", "First Value", "Sixth Value", "Third Value"));
        ArrayList actual2 = testTree.inOrderTraverseRecursive();
        assertEquals(expected2, actual2);

        ArrayList<String> expected3 = new ArrayList<String>(Arrays.asList("Fourth Value", "Fifth Value", "Second Value", "Sixth Value", "Third Value", "First Value"));
        ArrayList actual3 = testTree.postOrderTraverseRecursive();
        assertEquals(expected3, actual3);

        Tree testTree2 = new Tree();
        testTree2.root = new Node("Seventh Value", null, null);
        testTree2.root.left = new Node("Eighth Value", null, null);
        testTree2.root.right = new Node("Ninth Value", null, null);
        testTree2.root.left.left = new Node("Tenth Value", null, null);
        testTree2.root.left.right = new Node("Eleventh Value", null, null);
        testTree2.root.right.left = new Node("Twelfth Value", null, null);



        Tree testTree3 = new Tree();
        testTree3.root = new Node("a", null, null);
        testTree3.root.left = new Node("b", null, null);
        testTree3.root.right = new Node("c", null, null);
        testTree3.root.left.left = new Node("d", null, null);
        testTree3.root.left.right = new Node("e", null, null);
        testTree3.root.right.left = new Node("f", null, null);

        System.out.println(testTree3.inOrderTraverseRecursive());

        System.out.println(testTree3.postOrderTraverseRecursive());
    }

    @Test  public void binarySearchTreeTest() throws Exception {
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.addToTree("a");
        binaryTree.addToTree("b");
        binaryTree.addToTree("c");
        binaryTree.addToTree("d");
        binaryTree.addToTree("e");

        ArrayList<String> expected4 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
        ArrayList actual4 = binaryTree.inOrderTraverseRecursive();
        assertEquals(expected4, actual4);
        System.out.println(binaryTree.inOrderTraverseRecursive());

        assertFalse(binaryTree.contains("r"));
        assertTrue(binaryTree.contains("e"));


        System.out.println(binaryTree.contains("a"));
        System.out.println(binaryTree.contains("r"));
        System.out.println(binaryTree.contains("d"));
        System.out.println(binaryTree.contains("e"));

    }
    @Test public void maxValueTest() throws Exception {
        Tree testTree = new Tree();
        testTree.root = new Node(1, null, null);
        testTree.root.left = new Node(2, null, null);
        testTree.root.right = new Node(3, null, null);
        testTree.root.left.left = new Node(8, null, null);
        testTree.root.left.right = new Node(5, null, null);
        testTree.root.right.left = new Node(9, null, null);

        System.out.println(testTree.findMaximumValue());
        Object expected4 = 9;
        Object actual4 = testTree.findMaximumValue();
        assertEquals(expected4, actual4);
    }

    @Test public void breadthFirstTest() throws Exception {
        Tree testTree2 = new Tree();
        testTree2.root = new Node(1, null, null);
        testTree2.root.left = new Node(2, null, null);
        testTree2.root.right = new Node(3, null, null);
        testTree2.root.left.left = new Node(8, null, null);
        testTree2.root.left.right = new Node(5, null, null);
        testTree2.root.right.left = new Node(9, null, null);

        System.out.println(testTree2.breadthFirstTraversal());

    }

    @Test public void FizzBuzzTest() throws Exception {
        Tree testTree = new Tree();
        testTree.root = new Node(1, null, null);
        testTree.root.left = new Node(15, null, null);
        testTree.root.right = new Node(3, null, null);
        testTree.root.left.left = new Node(8, null, null);
        testTree.root.left.right = new Node(5, null, null);
        testTree.root.right.left = new Node(9, null, null);

        FizzBuzzTree.FizzBuzzTree(testTree);

        System.out.println(testTree.inOrderTraverseRecursive());
        ArrayList<String> Expected = new ArrayList<>(Arrays.asList("8", "FizzBuzz", "Buzz", "1", "Fizz", "Fizz"));
        ArrayList<String> Actual = testTree.inOrderTraverseRecursive();
        assertEquals(Expected, Actual);

        System.out.println(Math.random());

    }


}
