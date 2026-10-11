class Solution(object):
    def findMiddleIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(len(nums)):
            h=nums[:i]
            k=nums[i+1:]
            if sum(h)==sum(k):
                return i
        return -1