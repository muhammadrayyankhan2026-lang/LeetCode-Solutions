class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        d={}
        for i in nums:
            d[i]=d.get(i,0)+1
        l=[]
        
        for i,j in d.items():
            if j==1:
                l.append(i)
        return l