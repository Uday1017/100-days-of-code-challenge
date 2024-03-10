class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maximum = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                maximum = Math.max(maximum, count);

            }else{
                count = 0;
            }
        }
        return maximum;
    }
}
