package JavaTasks.Algoritms.G5_Graph.inDeep;

public class Vertex {
    private char name; // имя вершины
    public boolean isVision; // проверка была ли вершина в стеке

    public Vertex(char name) { // конструктор вершины
        this.name = name;
        isVision = false;
    }

    public char getName() {
        return name;
    }
}
