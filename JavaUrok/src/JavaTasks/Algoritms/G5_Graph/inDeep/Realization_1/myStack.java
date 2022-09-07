package JavaTasks.Algoritms.G5_Graph.inDeep.Realization_1;

public class myStack {
    private int index;
    private int array[];
    private int size = 10;

    public myStack() { // создаём стек в виде массива, имеющий размер 10, и индексом -1 (т.е. пустой)
        array = new int[size];
        index = -1;
    }

    public void push(int value) { // метод увеличивающий индекс на 1, а только затем добавляет значение
        array[++index] = value;
    }

    public int pop() { // метод выводит значение, только потом уменьшает индекс на 1
        return array[index--];
    }

    public int peek() { // метод выводит значение
        return array[index];
    }

    public boolean isEmpty() { // проверка стека на пустоту
        if (index == -1) return true;
        return false;
    }
}
