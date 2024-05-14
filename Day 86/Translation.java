import java.util.Scanner;
public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String s = sc.nextLine();
        int n = t.length();
        boolean checkcond = true;
        if(t.length() != s.length()){
            System.out.println("NO");
            return;
        }
        int m = s.length();
        boolean isReverse = true;
        for(int i = 0; i<m; i++){
             if(s.charAt(i) != t.charAt(n - 1 -i)){
                isReverse = false;
                break;
             }
        }
        if(isReverse){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
