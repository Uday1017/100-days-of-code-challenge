class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt1 = 0; 
        int cnt0 = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                cnt1++;
            }else{
                cnt0++;
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append("1".repeat(cnt1 - 1));
        ans.append("0".repeat(cnt0));
        ans.append("1");
        return ans.toString();
    }
}
