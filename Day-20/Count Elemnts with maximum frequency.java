class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ans = 0;
        int maxFreq = Integer.MIN_VALUE;
        int[] count = new int[101];
        for(int i = 0; i<nums.length; i++){
            count[nums[i]]++;
        }
        for(int i =0; i<count.length; i++){
            maxFreq = Math.max(maxFreq, count[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (maxFreq == count[nums[i]]) {
        ans++;
    }
}
       return ans;
    }
}
