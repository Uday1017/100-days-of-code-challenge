import java.util.Scanner;
public class Stickogon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t<T; t++){
            int n  = sc.nextInt();
            int[] sticks = new int[n];
            for(int i = 0; i<n; i++){
                sticks[i] = sc.nextInt();
            }
            int[] frequency = new int[101];

            for (int stick : sticks) {
                frequency[stick]++;
            }
            int maxPolygons = 0;
            for (int i = 1; i <= 100; i++) {
                int polygonsWithLengthI = frequency[i] / i;
                maxPolygons += polygonsWithLengthI;
                frequency[i] %= i; 
                maxPolygons += frequency[i]; 
            }
            
            System.out.println(maxPolygons);
        }
    }
}
