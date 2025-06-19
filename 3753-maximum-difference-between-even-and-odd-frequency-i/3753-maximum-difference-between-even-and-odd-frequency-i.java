class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        
        for (var c: s.toCharArray()){
            freq[c-'a']++;
        }
        int min=Integer.MAX_VALUE , max=0;
        for (int i=0;i<26;i++){
            if (freq[i]%2!=0){
                max = Math.max(max,freq[i]);
            }
            if (freq[i]%2==0 && freq[i]!=0){
                min = Math.min(min,freq[i]);
            }
        }

        return max-min;

    }
}