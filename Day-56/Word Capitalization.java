import java.util.Scanner;
public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String modString = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(modString);
    }
}
