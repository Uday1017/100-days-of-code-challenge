import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int totalBill = n * x;
            boolean isValidPhoneNumber = isValidPhoneNumber(totalBill);
            if (isValidPhoneNumber) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
        public static boolean isValidPhoneNumber(int number) {
        String numberString = String.valueOf(number);
        if (numberString.length() != 5) {
            return false;
        }
        if (numberString.charAt(0) == '0') {
            return false;
        }
        return true;
    }
}
