package Hexlet.CoreJava.isBalanced;

public class Main {
    public static void main(String[] args) {
        System.out.println(isBalanced("()()()"));
    }

    public static boolean isBalanced(String str) {
        // Превращаем строку в массив для дальнейшего сравнения символов между собой
        String[] array = str.split("");

        // Если строчка пустая ИЛИ не чётная И первый символ не равен "(" И последний символ не равен ")" - это не сбалансированные скобки
        if (str.equals("") || array.length % 2 != 0 && array[0] != "(" && array[array.length - 1] != ")") return false;
        // Индекс последнего символа
        int last = str.length()-1;

        // Сравниваем первый и последний символ, так как мы проверили, что количество скобок чётное, можем
        // с уверенностью делить длину массива на 2, наша проверка не уйдёт за края массива
        for (int first = 0; first < array.length/2; first++) {
            // Если символы зеркальны (не в одну сторону), то отнимаем от последнего индекса единицу
            if (!(array[first]).equals(array[last])) last--;
            // Если все символы прошли проверку на зеркальность, то индекс начального и последнего символа равняются
            if (first == last) return true;
        }
        return false;
    }
}
