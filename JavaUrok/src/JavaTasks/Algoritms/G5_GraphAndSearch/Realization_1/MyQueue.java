package JavaTasks.Algoritms.G5_GraphAndSearch.Realization_1;

public class MyQueue {
    private int[] array;
    private int size = 10;
    private int head;
    private int tail;
    private int count;

    public MyQueue() {
        array = new int[size];
        head = 0;
        tail = -1;
        count = 0;
    }

    public void insert(int v) {
        if (tail == size - 1) { // если хвост находится в последнем элементе, то сбрасывается до начального состояния
            tail = -1;
        }
        array[++tail] = v; // добавление элемента в хвост, то есть в конец массива
        count++;
    }

    public int remove() {
        if (head == size) { // если последний элемент равен размеру массива, сбрасывается до начального состояния
            head = 0;
        }

        count--;
        return array[head++]; // вывести первый элемент в массиве(очереди), только потом перейти к новому
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
