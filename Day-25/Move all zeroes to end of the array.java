class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
       int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                a[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
        
    }
}
