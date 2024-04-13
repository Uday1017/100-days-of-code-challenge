import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = (s.length() + 1) / 2; 
        int[] arr = new int[N];

        int index = 0;
        for (int i = 0; i < s.length(); i += 2) {
            arr[index++] = Character.getNumericValue(s.charAt(i));
        }

        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < N; k++) {
            result.append(arr[k]);
            if (k < N - 1) {
                result.append("+");
            }
        }

        System.out.println(result);
    }
}
