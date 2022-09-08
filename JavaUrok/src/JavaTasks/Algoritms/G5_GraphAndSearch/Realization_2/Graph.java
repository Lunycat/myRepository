package JavaTasks.Algoritms.G5_GraphAndSearch.Realization_2;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer>[] adjList; // создаём массив типа LinkedList<Integer>
    private boolean[] isVisited; // создаём массив типа boolean

    public Graph(int size) {
        adjList = new LinkedList[size];
        isVisited = new boolean[size]; // данный массив имеет в каждой ячейке false

        for (int i = 0; i < size; i++) {
            adjList[i] = new LinkedList<>(); // заполняем массив линкедлистами
        }
    }

    public void addEdge(int i, int j) {
        adjList[i].add(j); // заполняем массив смежностями
    }

    public void DFS(int vertex) {
        System.out.print(vertex + " ");
        isVisited[vertex] = true;
        Iterator<Integer> iterator = adjList[vertex].listIterator();

        while (iterator.hasNext()) { // проверяем есть ли следующий элемент
            int adj = iterator.next(); // выбираем следующий элемент
            if (!isVisited[adj]) {
                DFS(adj);
            }
        }
    }
}
