class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        int mid=0;
        while (l<=r){
            mid=(l+r)/2;
            if (l==r) return nums[l];
            if (nums[mid]>nums[r]) l=mid+1;
            else r=mid;
        }
        return -1;
    }
}