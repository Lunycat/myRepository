package JavaTasks.Algoritms.G5_Graph.inDeep.Realization_1;

public class Graph {
    private Vertex vertexList[]; // создаём массив типа Vertex
    private int maxN = 10; // максимальное количество графов
    private int curN; // текущий номер графа
    private int[][] mas; // матрица смежности
    private myStack stack = new myStack();

    public Graph() {
        vertexList = new Vertex[maxN]; // создание массива типа Vertex размером 10
        mas = new int[maxN][maxN]; // инициализация смежного массива 10 на 10
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
}
