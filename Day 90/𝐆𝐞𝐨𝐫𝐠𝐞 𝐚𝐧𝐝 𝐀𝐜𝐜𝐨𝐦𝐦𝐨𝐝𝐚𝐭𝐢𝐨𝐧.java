import java.util.Scanner;

public class DormitoryRooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int pi = scanner.nextInt();
            int qi = scanner.nextInt();

            if (qi - pi >= 2) {
                count++;
            }
        }
        System.out.println(count);

        scanner.close();
    }
}
