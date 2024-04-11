import java.util.Scanner;
public class Bitpp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            int sum = 0;
            for(int i = 0; i<n; i++){
                String s = sc.nextLine();
                    if(s.contains("++")){
                        sum += 1;
                    }else{
                        sum -= 1;
                    }
                }
            System.out.println(sum);

        }
}
