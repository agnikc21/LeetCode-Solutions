class Solution {
    public String longestPrefix(String s) {
        for (int i= s.length()-1; i>0;i--){
            String str = s.substring(0,i);
            if (s.endsWith(str)){
                return str;
            }
        }
        return "";
    }
}