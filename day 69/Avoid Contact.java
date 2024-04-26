import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int minN;
            if (y <= x / 2) {
                minN = 2 * y + 1;
            } else {
                minN = x - y;
            }
            System.out.println(minN);
        }
        scanner.close();
    }
}
