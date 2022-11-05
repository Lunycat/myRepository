package Stepic.AdvancedJava.P2_Generics.Lesson2_Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<>("Стринг");
        MyClass<Integer> mc2 = new MyClass<>(3);
        MyClass<Float> mc3 = new MyClass<>(3.12f);

        System.out.println(mc1.getValue() + "\n" + mc2.getValue() + "\n" + mc3.getValue());
    }
}

class MyClass<T> {
    private T value;

    MyClass (T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}
