public static int intToString(int number){
         static String digits[] = {'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'};
         if(number == 0){
             return;
         }
         int lastdigit = number%10;
         intToString(number/10);
         System.out.println(digits[lastdigit]);
     }
