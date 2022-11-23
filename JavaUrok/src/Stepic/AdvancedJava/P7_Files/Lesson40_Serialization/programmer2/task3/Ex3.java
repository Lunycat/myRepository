package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer2.task3;

import Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task3.UserList;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex3 {
    public static void main(String[] args) {
        UserList users;

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("C:\\Users\\Артём\\Desktop\\Источник.txt"))) {
            users = (UserList) inputStream.readObject();
            users.print();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
