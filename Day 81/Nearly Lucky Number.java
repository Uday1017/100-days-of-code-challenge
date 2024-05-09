import java.util.Scanner;

public class luckynumber {

    public static boolean isNearlyLucky(long num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '7' && str.charAt(i) != '4') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (isNearlyLucky(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
