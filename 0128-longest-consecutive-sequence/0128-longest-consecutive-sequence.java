class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if (n==0 || n==1) return n;
        Arrays.sort(nums);
        int count = 1, max=1;
        for (int i=1; i<nums.length;i++){
            if (nums[i-1]==(nums[i]-1)) count++;
            else if(nums[i]==nums[i-1]) continue;
            else {
                max=Math.max(max,count);
                count=1;
            }
        }
        return Math.max(max,count);
    }
}