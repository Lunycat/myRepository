package JavaTasks.Algoritms.G5_Graph.inDeep;

public class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A'); // curN = 0
        graph.addVertex('B'); // curN = 1
        graph.addVertex('C'); // curN = 2
        graph.addVertex('D'); // curN = 3
        graph.addVertex('E'); // curN = 4
        graph.addVertex('F'); // curN = 5

        graph.addEdge(0, 1); //AB
        graph.addEdge(1, 2); //BC
        graph.addEdge(1, 3); //BD
        graph.addEdge(3, 4); //DE
        graph.addEdge(3, 5); //DF

        graph.passInDeep(0);
    }
}
