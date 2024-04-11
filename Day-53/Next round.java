import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int j = 0; j<n; j++){
            if(arr[j] > 0){
                if(arr[j] >= arr[k-1]){
                    count++;
                }
            }
            }
        System.out.println(count);
    }
}
