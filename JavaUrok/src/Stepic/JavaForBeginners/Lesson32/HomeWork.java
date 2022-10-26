package Stepic.JavaForBeginners.Lesson32;

public class HomeWork {
    public static void main(String[] args) {
        Tigr tigr = new Tigr();
        try {
            tigr.eat("мясо");
            tigr.drink("вода");
            try {
                tigr.drink("пиво");
            } catch (NotWatterException e) {
                System.out.println(e.getMessage());
            }
        } catch (NotWatterException e) {
            System.out.println(e.getMessage());
        } catch (NotMeatException e) {
            System.out.println(e.getMessage());
        }
    }
}

class NotMeatException extends RuntimeException {
    NotMeatException(String s) {
        super(s);
    }
}

class NotWatterException extends Exception {
    NotWatterException(String s) {
        super(s);
    }
}

class Tigr {
    void eat(String food) {
        if (!food.equals("мясо"))
            throw new NotMeatException("Тигр не ест " + food);
        System.out.println("Тигр ест " + food);
    }

    void drink(String watter) throws NotWatterException {
        if (!watter.equals("вода"))
            throw new NotWatterException("Тигр не пьёт " + watter);
        System.out.println("Тигр пьёт " + watter);
    }
}