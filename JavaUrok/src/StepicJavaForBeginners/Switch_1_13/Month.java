package StepicJavaForBeginners.Switch_1_13;

import java.util.Scanner;

public class Month {
    static void dayQuantity(int i) {
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 2:
                System.out.println("В этом месяце 28 дней");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        dayQuantity(8);
    }
}
