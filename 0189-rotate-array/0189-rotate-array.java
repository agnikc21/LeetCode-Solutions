class Solution {
    private void reverse(int[] nums, int l, int r){
        while (l<r){
            int temp = nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k%=n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
}