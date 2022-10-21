package StepicJavaForBeginners.Lesson32;



public class MyExceptions {
    public static void main(String[] args) {
        MyExceptions me = new MyExceptions();
        try {
            me.abcd(1, 60);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void abcd(int temp, int speed) throws MyException{
        if (temp > 30)
            throw new MyRuntimeException("Высокая температура = " + temp);
        if (speed > 10)
            throw new MyException("Высокая скорость бега = " + speed);
    }
}

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class MyRuntimeException extends RuntimeException {
    MyRuntimeException(String message) {
        super(message);
    }
}