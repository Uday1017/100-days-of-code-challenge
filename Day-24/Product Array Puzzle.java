class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] P = new long[n];
        for(int i = 0; i<n; i++){
            long product = 1;
            for(int j = 0; j<n; j++){
               if(i != j){
                   product *= nums[j];
               }
            }
            P[i] = product;
        }
        return P;
        
        
	}
} 
