class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans=0
        nums=sorted(nums)
        print(nums)
        for h in nums:
            ans=ans^h
        return ans
        