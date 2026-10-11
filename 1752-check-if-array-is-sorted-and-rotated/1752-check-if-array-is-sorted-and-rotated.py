class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        k=sorted(nums)
        if(k==nums):
            return True

        h=nums
        for i in range(len(nums)):
            
            h=h[1:]+[h[0]]
            if(h==k):
                return True
        return False
        