package utilities.getEdgesTests;

import org.junit.Test;
import utilities.getEdge.GetEdge;
import utilities.graph.Graph;
import static org.junit.Assert.*;

public class GetEdgeTests {

    @Test
    public void getEdgeTest(){
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

//        String[] cities = {"Denver", "Fountain", "Eugene", "Dallas", "Tulsa", "Chattanooga"};
        String[] cities = {"Denver", "Fountain"};
        String[] cities1 = {"Denver", "Fountain","Eugene"};
        String[] cities2 = {"Eugene", "Denver","Fountain"};
        String[] cities3 = {"Fountain", "Dallas"};

        GetEdge getEdge = new GetEdge();
        assertEquals("True, $50", getEdge.getEdge(graph, cities));
        assertEquals("False, $0", getEdge.getEdge(graph, cities1));
        assertEquals("True, $250", getEdge.getEdge(graph, cities2));
        assertEquals("False, $0", getEdge.getEdge(graph, cities3));

    }
}
