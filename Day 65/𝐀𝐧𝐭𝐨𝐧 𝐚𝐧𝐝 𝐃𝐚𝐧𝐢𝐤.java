import java.util.Scanner;
public class antonanddanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                count1++;
            }else{
                count2++;
            }
        }
        if(count1>count2){
            System.out.println("Anton");
        }else if(count2>count1){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }

    }
}
