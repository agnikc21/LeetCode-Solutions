class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        for (var a:s.toCharArray()){
            if (a=='1') count++;
        }
        return count;
    }
}