package Stepic.AdvancedJava.P2_Generics.Lesson2_Generics.igra;

public class Game {
    public static void main(String[] args) {
        Team<SchoolBoy> schoolTeam1 = new Team<>("Драконы");
        Team<SchoolBoy> schoolTeam2 = new Team<>("Пузырьки");
        Team<Student> studentTeam1 = new Team<>("Победа");
        Team<Employee> employeeTeam1 = new Team<>("Работяги");

        SchoolBoy schoolBoy1 = new SchoolBoy("Егор");
        SchoolBoy schoolBoy2 = new SchoolBoy("Дима");

        Student student1 = new Student("Ваня");
        Student student2 = new Student("Евгений");

        Employee employee1 = new Employee("Геннадий");
        Employee employee2 = new Employee("Сергей");

        schoolTeam1.addParticipants(schoolBoy1);
        schoolTeam1.addParticipants(schoolBoy2);

        studentTeam1.addParticipants(student1);
        studentTeam1.addParticipants(student2);

        employeeTeam1.addParticipants(employee1);
        employeeTeam1.addParticipants(employee2);

        System.out.println("--------------------------------");

        schoolTeam1.playWitch(schoolTeam2);
    }
}
