class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        h=sum(nums)
        k=len(nums)
        n=k*(k+1)//2
        l=n-h
        return l