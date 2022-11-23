package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task3;

import java.io.Serializable;

public class UserList implements Serializable {
    private static final long serialVersionUID = 1L;
    final private User[] users;
    final private int size;

    public UserList(int size) {
        this.users = new User[this.size = size];
    }

    public void add(User user) {
        for (int i = 0; i < size; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }

    public void print() {
        for (User u : users)
            System.out.println(u + " ");
    }
}
