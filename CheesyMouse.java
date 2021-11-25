import java.util.Scanner;

public class CheesyMouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases>0){
            int n = scanner.nextInt();
            int[] list = new int[n];
            for (int i = 0; i < n; i++) {
                list[i] = scanner.nextInt();
            }
            // Time and space complexities are O(n)
            computeMaxCheeseAmount(list);
            testCases--;
        }
    }

    private static void computeMaxCheeseAmount(int[] list) {
        int a = list[0];
        int b = 0;
        int c;
        for (int i = 1; i < list.length; i++) {
            c = Math.max(a, b);
            a = b + list[i];
            b = c;
        }
        System.out.println(Math.max(a,b));
    }
}
