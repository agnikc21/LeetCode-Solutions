class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int a=nums[0], b=nums[0];
        for (int i=1; i<nums.length; i++){
            int num=nums[i];
            int temp =a;
            a = Math.max(num,Math.max(a*num,b*num));
            b=Math.min(num,Math.min(temp*num,b*num));
            max = Math.max(max,a);
        }
        return max;
    }
}