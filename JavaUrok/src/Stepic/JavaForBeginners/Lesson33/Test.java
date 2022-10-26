package Stepic.JavaForBeginners.Lesson33;

import java.time.*;


public class Test {
    public static void main(String[] args) {
        LocalTime ldt1 = LocalTime.of(9, 40);
        LocalTime ldt2 = LocalTime.of(20, 00);
        Duration d = Duration.ofHours(3);

        while (ldt1.isBefore(ldt2)) {
            System.out.println(ldt1);
            ldt1 = ldt1.plus(d);
        }
    }
}
