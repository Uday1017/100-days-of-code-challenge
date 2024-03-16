import java.util.ArrayList;

public class leadersinanarray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int n = arr.length;
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == n - i - 1) {
                li.add(arr[i]);
            }
        }
        System.out.println(li); 
    }
}
