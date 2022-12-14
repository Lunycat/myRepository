package JavaTasks.Algoritms.G5_GraphAndSearch.Realization_1;

public class Graph {
    private Vertex vertexList[]; // создаём массив типа Vertex
    private int curN; // текущий номер графа
    private int[][] mas; // матрица смежности
    private MyStack stack = new MyStack();;
    private MyQueue queue = new MyQueue();

    public Graph() {
        vertexList = new Vertex[10]; // создание массива типа Vertex размером 10
        mas = new int[10][10]; // инициализация смежного массива 10 на 10
        curN = 0; // текущее значение
    }

    public void addVertex(String name) { // метод добавляющий в текущее значение новый объект типа Vertex
        vertexList[curN++] = new Vertex(name);
    }

    public void addEdge(int i, int j) { // метод добавляющий смежность между вершинами
        mas[i][j] = 1;
    }

    public int check(int i) { // метод возвращающий непосещённую вершину
        for (int j = 0; j < curN; j++) {
            if (mas[i][j] == 1 && vertexList[j].getIsVisited() == false) return j;
        }
        return -1;
    }

    public void passInDeep(int index) { // алгоритм поиска в глубину
        System.out.println(vertexList[index].getName()); // вывести текущий элемент
        vertexList[index].setIsVisited(true); // установить на текущем элементе маячёк, что мы тут уже были
        stack.push(index); // занести данный элемент в стек

        while (!stack.isEmpty()) { // если стек не пустой, то идём дальше
            int neigh = check(stack.peek()); // сосед равен текущему элементу
            if (neigh == -1) { // если значение равен, то выводим элемент из стека
                neigh = stack.pop();
            } else {
                System.out.println(vertexList[neigh].getName());
                vertexList[neigh].setIsVisited(true);
                stack.push(neigh);
            }
        }
    }

    public void passInWidth(int index) {
        System.out.println(vertexList[index].getName()); // вывести текущий элемент
        vertexList[index].setIsVisited(true); // установить на текущем элементе маячёк, что мы тут уже были
        queue.insert(index); // занести данный элемент в очередь
        int vertex;

        while (!queue.isEmpty()) { // если очередь не пустая, то идём дальше
            int temp = queue.remove();

            while ((vertex = check(temp)) != -1) {
                System.out.println(vertexList[vertex].getName());
                vertexList[vertex].setIsVisited(true);
                queue.insert(vertex);
            }
        }
    }
}
