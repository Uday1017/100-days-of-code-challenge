class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = s.length();
        int lastwordlength = 0;
        for(int i = length - 1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(lastwordlength != 0){
                    return lastwordlength;
                }
            }else{
                lastwordlength++;
            }
        }
        return lastwordlength;
    }
}
