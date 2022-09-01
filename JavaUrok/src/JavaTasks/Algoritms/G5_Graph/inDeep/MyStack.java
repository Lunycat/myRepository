package JavaTasks.Algoritms.G5_Graph.inDeep;

public class MyStack {
    private int size = 10; // максимальное количество вершин
    private int top; // верхний элемент в стеке
    private int[] array; // сам стек

    public MyStack() {
        array = new int[size]; // инициализация массива(стека) с размером 10
        top = -1;
    }

    public void push(int v) {
        array[++top] = v;
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }
}
