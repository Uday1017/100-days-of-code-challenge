class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j =0, k=0;
        int m = n1+n2;
        int a[] = new int[n1 + n2]; 
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                a[k] = nums1[i];
                i++;
            }else{
               a[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            a[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n2){
            a[k] = nums2[j];
            j++;
            k++;
        }

        
        if(m % 2 == 0){
            int x = (n1+n2)/2;
            double p = a[x];
            double q = a[x-1];
            return (p+q)/2;
        }else{
            double med = a[(n1+n2)/2];
            return med;
        }
        
    }
}
