package utilities.depthFirstTest;

import org.junit.Test;
import utilities.graph.Graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import static org.junit.Assert.*;


public class DepthFirstTest {

    @Test
    public void depthFirstTraversalTest() throws Exception {
        Graph graph = new Graph();
        Graph.Vertex denver = graph.addVertex("Denver");
        Graph.Vertex fountain = graph.addVertex("Fountain");
        Graph.Vertex eugene = graph.addVertex("Eugene");
        Graph.Vertex dallas = graph.addVertex("Dallas");
        Graph.Vertex tulsa = graph.addVertex("Tulsa");
        Graph.Vertex chattanooga = graph.addVertex("Chattanooga");

        graph.addEdge(denver, fountain, "50");
        graph.addEdge(denver, eugene, "200");
        graph.addEdge(denver, dallas, "200");
        graph.addEdge(dallas, tulsa, "150");
        graph.addEdge(dallas, chattanooga, "400");
        graph.addEdge(tulsa, denver, "300");

        DepthFirst depthFirst = new DepthFirst();
        Set<Object> traversal = depthFirst.depthFirstTraversalRecursive(graph);
        for(Graph.Vertex vertex : graph.getVertexes()){
            System.out.println(vertex.value);
        }
        System.out.println(traversal);
        Set<Object> expected = new HashSet<>(Arrays.asList("Denver", "Dallas", "Chattanooga", "Tulsa", "Eugene", "Fountain"));
        assertEquals(expected, traversal);


        Graph graph1 = new Graph();
        Graph.Vertex a = graph1.addVertex("A");
        Graph.Vertex b = graph1.addVertex("B");
        Graph.Vertex c = graph1.addVertex("C");
        Graph.Vertex d = graph1.addVertex("D");
        Graph.Vertex e = graph1.addVertex("E");
        Graph.Vertex f = graph1.addVertex("F");
        Graph.Vertex g = graph1.addVertex("G");
        Graph.Vertex h = graph1.addVertex("H");

        graph1.addEdge(a, b);
        graph1.addEdge(b, c);
        graph1.addEdge(c, g);
        graph1.addEdge(a, d);
        graph1.addEdge(b, d);
        graph1.addEdge(d, e);
        graph1.addEdge(d, h);
        graph1.addEdge(d, f);
        graph1.addEdge(h, f);

        Set<Object> traversal1 = depthFirst.depthFirstTraversalRecursive(graph1);
        for(Graph.Vertex vertex : graph1.getVertexes()){
            System.out.println(vertex.value);
        }
        System.out.println(traversal1);
        Set<Object> expected1 = new HashSet<>(Arrays.asList("A", "B", "D", "E", "F", "H", "C", "G"));
        assertEquals(traversal1, expected1);


    }
}
