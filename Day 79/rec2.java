public class sumofnnumbers {
    public static int sum(int n){
        if(n == 1){
            return 1;
        } 
        int nm1 = sum(n-1);
        int n1 = n + nm1;
        return n1;

    }
        public static int Fact(int n){
            if(n == 0){
                return 1;
            }
            int fnm1 = Fact(n-1);
            int fn = n*Fact(n-1);
            return fn;
        }
        public static void printInc(int n){
            if(n == 1){
                System.out.print(n+" ");
                return;
            }
            printInc(n-1);
            System.out.print(n+"  ");
        }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
        System.out.println(Fact(n));
    }
}
