import java.util.*;

public class Graph {
    protected Map<String, List<String>> adjList;

    Graph(int v){
        adjList = new HashMap<>();
    }

    void addedges(String src, String dst){
        adjList.computeIfAbsent(src, k-> new ArrayList<>()).add(dst);
        adjList.computeIfAbsent(dst, k-> new ArrayList<>()).add(src);
    }
}
