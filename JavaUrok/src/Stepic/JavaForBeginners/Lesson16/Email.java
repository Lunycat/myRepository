package Stepic.JavaForBeginners.Lesson16;

public class Email {
    static void emailPrint(String email) {
        int fV = 0, sV = 0, lV = 0;

        while (lV < email.length() - 1) {
            fV = email.indexOf("@", lV);
            sV = email.indexOf(".", lV);
            lV = email.indexOf(";", lV + 1);
            System.out.println(email.substring(fV + 1, sV));
        }
    }

    public static void main(String[] args) {
        emailPrint("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
