import java.util.Scanner;
import java.util.HashMap;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[2 * N];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < 2 * N; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            boolean isValid = true;
            for (int count : map.values()) {
                if (count > 2) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
