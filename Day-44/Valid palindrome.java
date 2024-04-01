class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String str1 = str.replaceAll(" ", "");
        String str2 = str1.toLowerCase();
        int n = str2.length();
        for(int i = 0; i<n/2; i++){
                if(str2.charAt(i) != str2.charAt(n-1-i)){
                    return false;
                }
            
        }
        return true;
            
    }
}
