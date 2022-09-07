package JavaTasks.Algoritms.G5_Graph.inDeep.Realization_2;
import java.util.*;

public class Runner {
    public static void main(String args[]) {
        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 5);
        g.addEdge(3, 6);

        System.out.println("Following is Depth First Traversal");

        g.DFS(0);
    }
}