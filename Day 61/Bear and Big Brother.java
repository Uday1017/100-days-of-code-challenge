import java.util.Scanner;
public class Stonesontable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
        }
    }
}
