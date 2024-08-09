class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        visited=[]
        k=0
        for i in range(len(nums)):
            if (nums[i] not in visited):
                visited.append(nums[i])
                nums[k]=nums[i]
                k+=1
            else:
                continue
        

        return k
        