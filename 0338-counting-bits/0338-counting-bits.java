class Solution {
    static int counter(int n)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i=0;i<=n;i++){
            ans[i]=counter(i);
        }
        return ans;
    }
}