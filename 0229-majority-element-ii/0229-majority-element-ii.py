class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        d={}
        n=len(nums)
        for i in nums:
            d[i]=d.get(i,0)+1
        l=[]
        for i,j in d.items():
            if j>(n//3):
                l.append(i)
        return l