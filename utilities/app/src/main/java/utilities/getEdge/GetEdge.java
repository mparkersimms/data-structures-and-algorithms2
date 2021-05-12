package utilities.getEdge;

import utilities.graph.Graph;

import java.util.*;


public class GetEdge {

    public GetEdge(){

    }

    public String getEdge(Graph graph, String[] arr){
        String result = "";
        int cost = 0;
        int counter = arr.length;
        Queue<String> arrayQ= new LinkedList<>(Arrays.asList(arr));
        Queue<Graph.Vertex> q = new LinkedList<>();
        Set<Object> visitedCities = new LinkedHashSet<>();
        Graph.Vertex departure = stringToVertex(graph, arr[0]);
        System.out.println("departure neighbors = " + graph.getNeighbors(departure));

        q.add(departure);
        String polledCity = arrayQ.poll();
        while(!q.isEmpty()) {
            counter --;
            Graph.Vertex nextCity = q.poll();
            String polledCity2 = arrayQ.poll();
            System.out.println("polledCity = " + polledCity);
            visitedCities.add(nextCity.value);
            System.out.println("departure.value = " + nextCity.value);
            for (List<Object> cityInfo : graph.getNeighbors(nextCity)) {
                System.out.println(cityInfo);
                int travelCost = Integer.parseInt((String) cityInfo.get(1));
                System.out.println(travelCost);
//                for (String city : arr) {
                System.out.println("polledCity2 = " + polledCity2);
                    if (cityInfo.contains(polledCity2)) {
                        if(!visitedCities.contains(cityInfo.get(0))) {
                            q.add(stringToVertex(graph, cityInfo.get(0).toString()));
                            cost += travelCost;
                            System.out.println("cost = " + cost);
                        }

                    }

                }
            }
//        }
        System.out.println(arrayQ.isEmpty());
        System.out.println("cost: " + cost);
        if(counter == 0){
            result += "True, $" + cost;
        }
        else{
            result += "False, $0";
        }
        System.out.println("result = " + result);
        return result;
    }

    public static Graph.Vertex stringToVertex(Graph graph, String string){
        Graph.Vertex city = new Graph.Vertex("");
        List<Graph.Vertex> vertices = graph.getVertexes();
        for (Graph.Vertex v : vertices) {
            if (v.value == string) {
                city = v;
            }
        }
        return city;
    }
}
