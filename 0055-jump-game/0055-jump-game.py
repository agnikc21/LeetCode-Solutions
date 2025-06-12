class Solution(object):
    def canJump(self, nums):
        n=len(nums)-1
        for i in range(len(nums)-2,-1,-1):
            if (i+nums[i]>=n):
                n=i
        return n==0
        