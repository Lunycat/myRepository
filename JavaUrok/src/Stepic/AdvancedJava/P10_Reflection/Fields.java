package Stepic.AdvancedJava.P10_Reflection;

import java.lang.reflect.Field;

public class Fields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        Field someName = studentClass.getField("name");
        System.out.println(someName.getType());
        System.out.println("---------------------------------------");

        Field[] fields = studentClass.getFields();
        for (Field f : fields)
            System.out.printf("Тип %s, значение %s\n", f.getType(), f.getName());
        System.out.println("---------------------------------------");

        Field[] fieldsAll = studentClass.getDeclaredFields();
        for (Field f : fieldsAll)
            System.out.printf("Тип %s, значение %s\n", f.getType(), f.getName());
        System.out.println("---------------------------------------");
    }
}