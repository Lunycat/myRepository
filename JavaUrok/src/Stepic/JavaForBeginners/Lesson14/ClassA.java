package Stepic.JavaForBeginners.Lesson14;

public class ClassA {
    static void time() {
        for (int hour = 0; hour < 6; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1) break;

                for (int second = 0; second < 60; second++) {
                    if (second * hour > minute) continue;

                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
