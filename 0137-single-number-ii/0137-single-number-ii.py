class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        di={}
        for h in nums:
            di[h]=di.get(h,0)+1
        for l,m in di.items():
            if m==1:
                return l
        return 0
        