class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums=[x*x for x in nums]
        l=list()
        l=sorted(nums)
        return l
        