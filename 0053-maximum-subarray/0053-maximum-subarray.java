class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0],sum=0;
        for (int num: nums){
            if (sum<0) sum=0;
            sum+=num;
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}