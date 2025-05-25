class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arrsum=0;
        int sum= (n*(n+1))/2;
        for (int c:nums){
            arrsum+=c;
        }
        return sum-arrsum;
    }
}