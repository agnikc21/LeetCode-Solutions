class Solution {
    public int characterReplacement(String s, int k) {
        int[] res = new int[26];
        int l=0, maxC=0, maxL=0;
        for (int r=0;r<s.length();r++){
            char c = s.charAt(r);
            maxC = Math.max(maxC,++res[c-'A']);
            while (r-l+1-maxC>k){
                res[s.charAt(l)-'A']--;
                l++;
            }
            maxL = Math.max(maxL,r-l+1);
        }
        return maxL;
    }
}