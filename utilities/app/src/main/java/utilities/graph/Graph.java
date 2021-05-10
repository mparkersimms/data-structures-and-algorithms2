package utilities.graph;

import java.util.*;


public class Graph {
    Set<Vertex> vertexes = new HashSet<>();
    List<Edge> edges = new ArrayList<>();

    public Graph() {
    }

    public Vertex addVertex(Object value){
        System.out.println("addVortex with value = " + value);
        Vertex newVertex = new Vertex(value);
        this.vertexes.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Object weight){
        Edge newEdge = new Edge(vertex1, vertex2);
        newEdge.weight = weight;
        this.edges.add(newEdge);
        vertex1.edges.add(newEdge);
        vertex2.edges.add(newEdge);
    }

    public void addEdge(Vertex vertex1, Vertex vertex2) {
        List<Vertex> vertexList = Arrays.asList(vertex1, vertex2);
        if (this.vertexes.containsAll(vertexList)) {
            Edge newEdge = new Edge(vertex1, vertex2);
            newEdge.weight = "Null";
            this.edges.add(newEdge);
            vertex1.edges.add(newEdge);
            vertex2.edges.add(newEdge);
        }
    }

    public List getVertexes(){
        List<Object> vertexNames = new ArrayList<>();
        for(Vertex vertex : this.vertexes){
            vertexNames.add(vertex.value);
        }
        return vertexNames;
    }
    public Set getNeighbors(Vertex vertex){
        Set neighbors = new HashSet<>();
        for(int i = 0; i < vertex.edges.size(); i ++){
            List<Object> neighbor = new ArrayList<>();
            Object value1 = vertex.edges.get(i).vertex1.value;
            Object weight1 = vertex.edges.get(i).weight;
            Object value2 = vertex.edges.get(i).vertex2.value;
            Object weight2 = vertex.edges.get(i).weight;
            if(vertex.value != value1){
                neighbor.add(value1);
                neighbor.add(weight1);

            }if(vertex.value != value2){
                neighbor.add(value2);
                neighbor.add(weight2);

            }
        neighbors.add(neighbor);

        }
        return neighbors;
    }

    public int getSize(){
        return this.vertexes.size();
    }

    public static class Vertex{
        Object value;
        public List<Edge> edges = new ArrayList<>();

        public Vertex(Object value) {
            this.value = value;

        }
    }

    public static class Edge{
        Vertex vertex1;
        Vertex vertex2;
        Object weight;

        public Edge(Vertex vertex1, Vertex vertex2) {
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;

        }
    }


}

