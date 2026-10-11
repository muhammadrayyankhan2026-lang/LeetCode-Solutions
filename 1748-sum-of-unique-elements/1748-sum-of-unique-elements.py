class Solution(object):
    def sumOfUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d={}
        for num in nums:
            d[num]=d.get(num,0)+1
        
        s=0
        for t in d:
            if d[t]==1:
                s+=t

        return s