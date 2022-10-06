package StepicJavaForBeginners.Lesson16;

public class EmailRecursion {
    String emailPrint(String email) {
        if (email.length() <= 0) return email;

        int firstValue = email.indexOf("@"), secondValue = email.indexOf("."), lastValue = email.indexOf(";");
        String result = "", newEmail = email;

        result += newEmail.substring(firstValue + 1, secondValue);
        newEmail = email.substring(lastValue + 1, email.lastIndexOf(";") + 1).trim();

        return result + "\n" + emailPrint(newEmail);
    }

    public static void main(String[] args) {
        EmailRecursion em = new EmailRecursion();
        System.out.println(em.emailPrint("ya@yahoo.com; on@mail.ru; ona@gmail.com;"));
    }
}
