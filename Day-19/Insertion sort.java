public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i = 1; i<size; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
}
