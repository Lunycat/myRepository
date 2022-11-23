package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex3 {
    public static void main(String[] args) {
        UserList users = new UserList(3);
        User user1 = new User("Дима", "dragon", "sdsdsfsa");
        User user2 = new User("Евгений", "orel", "dsadsad");
        User user3 = new User("Сергей", "aboba", "sddsafa");
        users.add(user1);
        users.add(user2);
        users.add(user3);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.bat"))) {
            outputStream.writeObject(users);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
