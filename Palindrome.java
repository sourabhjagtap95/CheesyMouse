import java.util.Scanner;

public class CheesyMouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        // 1 way of doing it
        stringBuilder.reverse();
        System.out.println("Is Palindrome? : " + str.equalsIgnoreCase(stringBuilder.toString()));
        // 2nd way
        String cleanString = str.replaceAll("\\s+", "").toLowerCase();
        boolean flag = true;
        int length = cleanString.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = cleanString.charAt(forward++);
            char backwardChar = cleanString.charAt(backward--);
            if (forwardChar != backwardChar) {
                flag = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + flag);
    }

}
