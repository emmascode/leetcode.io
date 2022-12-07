class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 2
        for i in range(2, len(nums)):
            if not (nums[i] == nums[l-1] and nums[i] == nums[l-2]):
                nums[l] = nums[i]
                l += 1
        return l 