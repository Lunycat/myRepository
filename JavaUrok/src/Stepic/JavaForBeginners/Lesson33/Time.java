package Stepic.JavaForBeginners.Lesson33;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.*;

public class Time {
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");

    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.print("Отдыхаем с: " + ldt1.format(format1) + " ");
            ldt1 = ldt1.plus(p);
            System.out.println("До: " + ldt1.format(format1));

            System.out.print("Отдыхаем с: " + ldt1.format(format2) + " ");
            ldt1 = ldt1.plus(d);
            System.out.println("До: " + ldt1.format(format2) + "\n");
        }
    }

    public static void main(String[] args) {
        Time time = new Time();
        LocalDateTime ldt1 = LocalDateTime.of(2021, 6, 5, 9, 40);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 1, 1, 10, 0);
        Period p = Period.ofMonths(3);
        Duration d = Duration.ofHours(3);

        time.smena(ldt1, ldt2, p, d);
    }
}
