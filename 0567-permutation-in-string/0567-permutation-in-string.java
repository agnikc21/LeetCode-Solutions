class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0;
        int r= l+s1.length()-1;
        char[] c = s1.toCharArray();
        Arrays.sort(c);
        while (r<s2.length()){
            char[] c1= s2.substring(l,r+1).toCharArray();
            Arrays.sort(c1);
            if (Arrays.equals(c1,c)) return true;
            l++;
            r++;
        }
        return false;
    }
}