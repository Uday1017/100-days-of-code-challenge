class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        int count = 0;
        for(int i = 0; i<N; i++){
            if(A[i] == 0){
                count++;
            }
        }
        for(int i = 0; i<count; i++){
            A[i] = 0;
        }
        for(int i = count; i<N; i++){
            A[i] = 1;
        }
        
        /**************
        * No need to print the array
        * ************/
    }
}

