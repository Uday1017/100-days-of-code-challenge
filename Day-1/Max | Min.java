class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<N; i++){
            if(largest < A[i]){
                largest = A[i];
            }
        }
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<N; i++){
            if(smallest > A[i]){
                smallest = A[i];
            }
        }
        int sum = largest + smallest;
        return sum;
        
    }
}
