class Solution {
    public int maxSubArray(int[] nums) {
       int maxsum = Integer.MIN_VALUE;
       int currSum = 0;
       int count = 0;
       for(int i = 0; i<nums.length; i++){
           currSum += nums[i];
           if(currSum < 0){
               currSum = 0;
           }
           maxsum = Math.max(currSum, maxsum);
           
           }
        
       for(int num : nums){
           if(num < 0){
               count++;
           }

       }
       int largest = Integer.MIN_VALUE;
       if(count == nums.length){
           for(int i = 0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        return largest;
       }

       return maxsum;
        
    }
}
