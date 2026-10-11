class Solution(object):
    def smallestIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        for i in range(len(nums)):
            s=0
            x=nums[i]
            while x>0:
                g=x%10
                s+=g
                x=x/10
            if s==i:
                return i
        return -1