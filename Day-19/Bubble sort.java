
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int k = 0; k<n; k++){
            System.out.print(arr[k] + " ");
         }
        
    }

}
