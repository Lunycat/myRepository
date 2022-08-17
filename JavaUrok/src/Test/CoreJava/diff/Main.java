package Test.CoreJava.diff;

public class Main {
    public static void main(String[] args) {
        System.out.println(diff(0, 190));
    }

    public static int diff(int angleA, int angleB) {
        // Если второй угол больше или равен 180, то из 360 отнимаем второй угол, если же второй угол меньше, то из 2 угла отнимаем первый
        int result = angleB > 180 ? 360 - angleB : angleB - angleA;

        return result;
    }
}
