package Stepic.AdvancedJava.P10_Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Student> studentClass = Student.class;
        Method someMethod = studentClass.getMethod("say");
        System.out.println(someMethod.getReturnType());
        System.out.println("---------------------------------------");

        Method[] methods = studentClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.printf("Возвращаемое значение %s, имя %s, количество параметров %d, параметры %s\n",
                    m.getReturnType(), m.getName(), m.getParameterCount(), Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("---------------------------------------");

        Method[] methodsAll = studentClass.getMethods();
        for (Method m : methodsAll) {
            System.out.printf("Возвращаемое значение %s, имя %s, количество параметров %d, параметры %s\n",
                    m.getReturnType(), m.getName(), m.getParameterCount(), Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("---------------------------------------");
    }
}
