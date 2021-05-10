package utilities.graphTests;

import org.junit.Test;
import static org.junit.Assert.*;


import utilities.graph.Graph;

import java.util.Arrays;
import java.util.List;

public class GraphTests {

    @Test
    public void graphTester(){
        Graph testGraph = new Graph();
        Graph testGraph1 = new Graph();
        Graph testGraph2 = new Graph();

        assertTrue(testGraph.getVertexes().isEmpty());

        Graph.Vertex coffee = testGraph.addVertex("Coffee");
        assertNotNull(testGraph.getVertexes());

        Graph.Vertex house = testGraph.addVertex("House");
        assertTrue(testGraph.getNeighbors(house).isEmpty());

        testGraph.addEdge(coffee, house);
        assertNotNull(testGraph.getNeighbors(house));

        Graph.Vertex cherry = testGraph.addVertex("Cherry");
        Graph.Vertex street = testGraph.addVertex("Street");

        List vertexes = testGraph.getVertexes();
        List listOfVertexes = Arrays.asList("Coffee","House", "Cherry", "Street");
        System.out.println("Vertexes: " + testGraph.getVertexes());
        assertTrue("True if the list of vertexes contains all the added vertexes",
                vertexes.containsAll(listOfVertexes));

        testGraph.addEdge(coffee, cherry, "strong");
        testGraph.addEdge(coffee, street, "very strong");
        testGraph.addEdge(house, cherry, "kinda strong");


        Graph.Vertex fun = testGraph1.addVertex("Fun");

//      ==== this should NOT add an edge to these vertexes because they do not belong to the same Graph

        testGraph.addEdge(house, fun);
        assertFalse(testGraph.getNeighbors(house).contains("Fun"));

//      ==== testing the edge lists =====

        System.out.println("testGraph.getNeighbors(coffee) = " + testGraph.getNeighbors(coffee));
        System.out.println("testGraph.getNeighbors(house) = " + testGraph.getNeighbors(house));
        System.out.println("testGraph.getNeighbors(cherry) = " + testGraph.getNeighbors(cherry));
        System.out.println("testGraph.getNeighbors(street) = " + testGraph.getNeighbors(street));

        assertTrue(testGraph.getNeighbors(coffee).contains(Arrays.asList("Street", "very strong")));
        assertTrue(testGraph.getNeighbors(coffee).contains(Arrays.asList("Cherry", "strong")));
        assertTrue(testGraph.getNeighbors(coffee).contains(Arrays.asList("House", "Null")));

        assertTrue(testGraph.getNeighbors(house).contains(Arrays.asList("Coffee", "Null")));
        assertTrue(testGraph.getNeighbors(house).contains(Arrays.asList("Cherry", "kinda strong")));

        assertTrue(testGraph.getNeighbors(cherry).contains(Arrays.asList("Coffee", "strong")));
        assertTrue(testGraph.getNeighbors(cherry).contains(Arrays.asList("House", "kinda strong")));

        assertTrue(testGraph.getNeighbors(street).contains(Arrays.asList("Coffee", "very strong")));

        System.out.println("testGraph1 neighbors = " + testGraph1.getNeighbors(fun));


//      ==== testing the size of the graphs ====

        assertEquals(4, testGraph.getSize());
        assertEquals(1, testGraph1.getSize());
        assertEquals(0, testGraph2.getSize());

    }
}
