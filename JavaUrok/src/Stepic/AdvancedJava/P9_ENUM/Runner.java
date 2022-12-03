package Stepic.AdvancedJava.P9_ENUM;

public class Runner {
    public static void main(String[] args) {
        Today today = new Today(DaysOfWeek.Saturday);
        today.printDay();
    }
}

enum DaysOfWeek {
    Monday("bad"),
    Tuesday("bad"),
    Wednesday("so-so"),
    Thursday("so-so"),
    Friday("good"),
    Saturday("great"),
    Sunday("good");

    private final String mood;

    DaysOfWeek(String mood) {
        this.mood = mood;
    }

    String getMood() {
        return mood;
    }
}

class Today {
    private final DaysOfWeek day;

    Today(DaysOfWeek day) {
        this.day = day;
    }

    void printDay() {
        switch (day) {
            case Monday, Tuesday, Wednesday, Thursday, Friday ->
                    System.out.println("Работа, настроение " + day.getMood());
            case Saturday, Sunday ->
                    System.out.println("Отдых, настроение " + day.getMood());
        }
    }
}