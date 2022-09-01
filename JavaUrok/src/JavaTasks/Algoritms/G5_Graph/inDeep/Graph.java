package JavaTasks.Algoritms.G5_Graph.inDeep;

public class Graph {
    private int maxN = 10; // количество вершин максимум
    private int curN; // текущая вершина
    private int[][] mas; // матрица смежности
    private Vertex[] vertexList; // массив типа Vertex
    private MyStack stack = new MyStack(); // инициализация стека

    public Graph() {
        vertexList = new Vertex[maxN]; // инициализация массива с количество элементов 10
        curN = 0; // инициализация текущей вершины
        mas = new int[maxN][maxN]; // инициализация двумерного массива 10 на 10
    }

    public void addVertex(char name) { // добавление вершины
        vertexList[curN++] = new Vertex(name); // заполнение листа вершинами
    }

    public void addEdge(int start, int end) { // добавление ребра
        mas[start][end] = 1;
    }

    public int check(int v) { // возвращает непосещённую вершину
        for (int i = 0; i < curN; i++) {
            if (mas[v][i] == 1 && vertexList[i].isVision == false) return i;
        }
        return -1;
    }

    public void passInDeep(int index) {
        System.out.println(vertexList[index].getName());
        vertexList[index].isVision = true;
        stack.push(index);

        while (!stack.isEmpty()) {
            int neigh = check(stack.peek());
            if (neigh == -1) {
                neigh = stack.pop();
            } else {
                System.out.println(vertexList[neigh].getName());
                vertexList[neigh].isVision = true;
                stack.push(neigh);
            }
        }

        for (int i = 0; i < curN; i++) {
            vertexList[i].isVision = false;
        }
    }
}
