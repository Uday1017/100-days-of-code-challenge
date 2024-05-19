import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValeraTheHorse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shoe1 = scanner.nextInt();
        int shoe2 = scanner.nextInt();
        int shoe3 = scanner.nextInt();
        int shoe4 = scanner.nextInt();
        Set<Integer> uniqueShoes = new HashSet<>();
        uniqueShoes.add(shoe1);
        uniqueShoes.add(shoe2);
        uniqueShoes.add(shoe3);
        uniqueShoes.add(shoe4);
        int uniqueCount = uniqueShoes.size();

        int shoesToBuy = 4 - uniqueCount;

        System.out.println(shoesToBuy);
        
        scanner.close();
    }
}
