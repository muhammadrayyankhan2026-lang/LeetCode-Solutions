class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        sorted(nums)
        if target in nums:
            return nums.index(target)
        return -1