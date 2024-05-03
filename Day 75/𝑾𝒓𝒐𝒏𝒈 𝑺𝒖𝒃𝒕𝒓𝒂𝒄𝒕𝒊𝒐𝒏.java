import java.util.Scanner;
public class wrongsubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int newnum = n;
        for(int i = 1; i<=k; i++){
            if(n%10 == 0){
                newnum = n/10;
            }else{
                newnum = n - 1;
            }
            n = newnum;
        }
        System.out.println(newnum);
    }
}
