class Solution(object):
    def maxAlternatingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        g=[x*x for x in nums]
        g.sort()
        l=len(g)
        s,d=0,0
        for i in range(l/2):
            d+=g[i]
        for i in range(l/2,l):
            s+=g[i]
        return s-d