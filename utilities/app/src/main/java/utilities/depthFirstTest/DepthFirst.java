package utilities.depthFirstTest;

import utilities.graph.Graph;

import java.util.*;

public class DepthFirst {
    Set<Object> resultList = new LinkedHashSet<>();
    public DepthFirst(){

    }
    public Set<Object> depthFirstTraversalRecursive(Graph graph) throws Exception {
        resultList.clear();
        Graph.Vertex vertex = graph.getVertexes().get(0);
        this.depthFirstTraversal(graph, vertex);
        System.out.println(graph.getVertexNeighbors(vertex));
        return resultList;
    }
    public void depthFirstTraversal(Graph graph, Graph.Vertex vertex) throws Exception {
        if(vertex == null) throw new Exception("no vertex");
        resultList.add(vertex.value);
        for(Graph.Vertex v1 : graph.getVertexNeighbors(vertex)){
            if(v1 != null && !resultList.contains(v1.value))this.depthFirstTraversal(graph,v1);
        }


    }

}
