package utilities.breadthFirstGraphTests;

import org.junit.Test;
import utilities.breadthFirst.BreadthFirst;
import utilities.graph.Graph;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

import static org.junit.Assert.*;


public class BreathFirstGraphTests {

    @Test
    public void breadthFirstGraphTest(){
//        ===== create new graph and add vertexes ====
        Graph graph = new Graph();
        Graph.Vertex phone = graph.addVertex("Phone");
        Graph.Vertex keys = graph.addVertex("Keys");
        Graph.Vertex wallet = graph.addVertex("Wallet");
        Graph.Vertex computer = graph.addVertex("Computer");
        Graph.Vertex passport = graph.addVertex("Passport");
        Graph.Vertex glasses = graph.addVertex("Glasses");

//        ===== create new breadthFirst class =====
        BreadthFirst breadthFirst = new BreadthFirst();

//        ===== testing size of graph before adding edges =====
        assertEquals(1, breadthFirst.breathFirstTraversal(phone).size());
        assertEquals(1, breadthFirst.breathFirstTraversal(wallet).size());
        assertEquals(1, breadthFirst.breathFirstTraversal(keys).size());

//        ===== add all the appropriate edges to the graph =====
        graph.addEdge(passport, phone);
        graph.addEdge(passport, computer);
        graph.addEdge(phone, computer);
        graph.addEdge(phone, wallet);
        graph.addEdge(wallet, keys);
        graph.addEdge(wallet, glasses);


//        ===== testing size of set returned from traversal =====
        System.out.println("breadthFirst = " + breadthFirst.breathFirstTraversal(glasses));
        assertEquals(6,breadthFirst.breathFirstTraversal(glasses).size());
        LinkedHashSet<String> expected = new LinkedHashSet<String>(Arrays.asList("Glasses", "Wallet", "Phone", "Keys", "Passport", "Computer"));
        assertEquals(expected, breadthFirst.breathFirstTraversal(glasses));

    }
}
