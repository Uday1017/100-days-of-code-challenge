import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count1++;
            }else{
                count2++;
            }
        }
        if(count1 > count2){
            System.out.println(str.toUpperCase());
        }else{
            System.out.println(str.toLowerCase());
        }
    }
}
