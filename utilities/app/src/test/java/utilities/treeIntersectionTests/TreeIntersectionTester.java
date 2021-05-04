package utilities.treeIntersectionTests;

import org.junit.Test;
import utilities.tree.Node;
import utilities.tree.Tree;
import utilities.treeIntersection.TreeIntersection;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TreeIntersectionTester {

    @Test
    public void treeIntersectionTester() throws Exception {
        Tree testTree1 = new Tree();
        testTree1.root = new Node(42, null, null);
        testTree1.root.left = new Node(100, null, null);
        testTree1.root.right = new Node(600, null, null);
        testTree1.root.left.left = new Node(15, null, null);
        testTree1.root.left.right = new Node(160, null, null);
        testTree1.root.left.right.left = new Node(125, null, null);
        testTree1.root.left.right.right = new Node(175, null, null);
        testTree1.root.right.left = new Node(200, null, null);
        testTree1.root.right.right = new Node(350, null, null);
        testTree1.root.right.right.left = new Node(4, null, null);
        testTree1.root.right.right.right = new Node(500, null, null);

        Tree testTree2 = new Tree();
        testTree2.root = new Node(150, null, null);
        testTree2.root.left = new Node(100, null, null);
        testTree2.root.right = new Node(250, null, null);
        testTree2.root.left.left = new Node(75, null, null);
        testTree2.root.left.right = new Node(160, null, null);
        testTree2.root.left.right.left = new Node(125, null, null);
        testTree2.root.left.right.right = new Node(175, null, null);
        testTree2.root.right.left = new Node(200, null, null);
        testTree2.root.right.right = new Node(350, null, null);
        testTree2.root.right.right.left = new Node(300, null, null);
        testTree2.root.right.right.right = new Node(500, null, null);

        TreeIntersection treeIntersection = new TreeIntersection();
        ArrayList expected = new ArrayList(Arrays.asList(100,125,160,175,200,350,500));
        ArrayList actual = treeIntersection.TreeIntersection(testTree1,testTree2);
        System.out.println("actual = " + actual);
        assertEquals(expected, actual);

        Tree testTree3 = new Tree();
        testTree3.root = new Node(56, null, null);
        testTree3.root.left = new Node(900, null, null);
        testTree3.root.right = new Node(560, null, null);
        testTree3.root.left.left = new Node(230, null, null);
        testTree3.root.left.right = new Node(6, null, null);
        testTree3.root.left.right.left = new Node(9, null, null);
        testTree3.root.left.right.right = new Node(110, null, null);
        testTree3.root.right.left = new Node(1000, null, null);
        testTree3.root.right.right = new Node(470, null, null);
        testTree3.root.right.right.left = new Node(78, null, null);
        testTree3.root.right.right.right = new Node(790, null, null);

        Tree testTree4 = new Tree();
        testTree4.root = new Node(78, null, null);
        testTree4.root.left = new Node(100, null, null);
        testTree4.root.right = new Node(250, null, null);
        testTree4.root.left.left = new Node(75, null, null);
        testTree4.root.left.right = new Node(900, null, null);
        testTree4.root.left.right.left = new Node(125, null, null);
        testTree4.root.left.right.right = new Node(175, null, null);
        testTree4.root.right.left = new Node(230, null, null);
        testTree4.root.right.right = new Node(350, null, null);
        testTree4.root.right.right.left = new Node(470, null, null);
        testTree4.root.right.right.right = new Node(500, null, null);

        TreeIntersection treeIntersection2 = new TreeIntersection();
        ArrayList expected2 = new ArrayList(Arrays.asList(900,78,230,470));
        ArrayList actual2 = treeIntersection2.TreeIntersection(testTree3,testTree4);
        System.out.println("actual2 = " + actual2);
        assertEquals(expected2, actual2);


        Tree testTree5 = new Tree();
        testTree5.root = new Node(56, null, null);
        testTree5.root.left = new Node(900, null, null);
        testTree5.root.right = new Node(560, null, null);
        testTree5.root.left.left = new Node(230, null, null);
        testTree5.root.left.right = new Node(6, null, null);
        testTree5.root.left.right.left = new Node(9, null, null);
        testTree5.root.left.right.right = new Node(110, null, null);
        testTree5.root.right.left = new Node(1000, null, null);
        testTree5.root.right.right = new Node(470, null, null);
        testTree5.root.right.right.left = new Node(78, null, null);
        testTree5.root.right.right.right = new Node(790, null, null);

        Tree testTree6 = new Tree();
        testTree6.root = new Node(79, null, null);
        testTree6.root.left = new Node(100, null, null);
        testTree6.root.right = new Node(250, null, null);
        testTree6.root.left.left = new Node(75, null, null);
        testTree6.root.left.right = new Node(800, null, null);
        testTree6.root.left.right.left = new Node(125, null, null);
        testTree6.root.left.right.right = new Node(175, null, null);
        testTree6.root.right.left = new Node(233, null, null);
        testTree6.root.right.right = new Node(350, null, null);
        testTree6.root.right.right.left = new Node(479, null, null);
        testTree6.root.right.right.right = new Node(500, null, null);

        TreeIntersection treeIntersection3 = new TreeIntersection();
        ArrayList expected3 = new ArrayList(Collections.emptyList());
        ArrayList actual3 = treeIntersection3.TreeIntersection(testTree5,testTree6);
        System.out.println("actual3 = " + actual3);
        assertEquals(expected3, actual3);

    }
}
