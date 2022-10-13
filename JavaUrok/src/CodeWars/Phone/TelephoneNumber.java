package CodeWars.Phone;

public class TelephoneNumber {
    static String createPhoneNumber(int[] array) {
        String phone = "(xxx) xxx-xxxx";
        for (int n : array) {
            phone = phone.replaceFirst("x", n + "");
        }
        return phone;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}