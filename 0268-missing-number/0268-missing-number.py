class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        m=len(nums)
        expected= (m*(m+1))/2
        return int(expected-sum(nums))
        