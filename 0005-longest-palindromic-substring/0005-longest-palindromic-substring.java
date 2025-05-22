class Solution {
    public Boolean pali(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if (s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s=="") return "";
        if (s.length()==1) return s;
        String max="";
        for(int i=0; i<s.length(); i++){
            for(int j=s.length()-1; j>=i;j--){
                String substr = s.substring(i,j+1);
                if (pali(substr)){
                    max=substr.length()>max.length()?substr:max;

                }
            }
        }
        return max;
    }
}