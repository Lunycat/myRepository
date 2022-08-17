package Test.CoreJava.dnaToRna;

public class Main {
    public static void main(String[] args) {
        System.out.println(dnaToRna("ACGTD"));
    }
    // A->U; C->G; G->C; T->A
    public static String dnaToRna(String str) {
        if (str.equals("")) return str;
        // Создаём массив для просмотра каждоый буквы.
        String[] array = str.split("");
        // В переменную result будет записан результат.
        String result = "";
        // Цикл выделяет каждую букву из массива и ищет по вариантам, если находит нужную букву - заменяет её.
        // После всех замен возвращает результат.
        // Если же цикл не нашёл букву, то возвращает null.
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "A":
                    result = result + "U";
                    break;
                case "C":
                    result = result + "G";
                    break;
                case "G":
                    result = result + "C";
                    break;
                case "T":
                    result = result + "A";
                    break;
                default:
                    return null;
            }
        }
        return result;
    }
}
