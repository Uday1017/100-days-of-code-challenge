class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
     long totalsum = 0;
        long leftsum = 0;
        
        for(int i = 0; i<n; i++){
            totalsum+= arr[i];
        }
        
        for(int i = 0; i<n; i++){
            totalsum -= arr[i];
            
            if(totalsum == leftsum){
                return i + 1;
            }
            leftsum += arr[i];
        }
        return -1;
       
    }
}
