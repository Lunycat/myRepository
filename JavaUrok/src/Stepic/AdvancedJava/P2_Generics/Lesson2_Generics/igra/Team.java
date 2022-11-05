package Stepic.AdvancedJava.P2_Generics.Lesson2_Generics.igra;

import java.util.ArrayList;
import java.util.Random;

public class Team <T> {
    private String name;
    private ArrayList<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    void addParticipants(T p) {
        participantList.add(p);
        System.out.println("Добавлен новый участник, имя: " + ((Participants)p).getName());
    }

    void playWitch(Team<T> team) {
        Random random = new Random();
        int result = random.nextInt(2);
        if (result == 0)
            System.out.println("Выйграла команда: " + this.name);
        else
            System.out.println("Выйграла команда: " + team.name);
    }
}
