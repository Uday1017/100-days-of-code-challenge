class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
       int[] ans= new int[q];
        int count=0;
        int j=0;
        
        while(j<q)
        {
            int ind=query[j];
        
        for(int i=0;i<n;i++){
            if(b[i]<=a[ind]){
                count++;
            }
        }
        ans[j]=count;
        j++;
        count=0;
        }
        return ans;
    }
}
