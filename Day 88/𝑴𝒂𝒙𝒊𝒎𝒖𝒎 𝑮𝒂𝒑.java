class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int curr = 0;
        for(int i = 1; i<n; i++){
            if(nums[i] - nums[i-1] > curr){
                curr = nums[i] - nums[i-1];
            }
        }
        return curr;
    }
}
