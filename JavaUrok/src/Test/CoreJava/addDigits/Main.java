package Test.CoreJava.addDigits;

public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(16));
    }

    public static int addDigits(int x) {
        // Преобразую в строку для подсчёта количества цифр
        String str = "" + x;

        // Если цифр больше 2 - цикл отрабатывает
        while (str.length() >=2) {
            x = 0;
            // Превращаем строку в массив для их разделения и сложения
            String[] strArray = str.split("");
            // Цикл складывает все цифры
            for (int i = 0; i < str.length(); i++) {
                x += Integer.parseInt(strArray[i]);
            }
            // Новый x приравниваем к новой строке
            str = "" + x;
        }
        return x;
    }
}
