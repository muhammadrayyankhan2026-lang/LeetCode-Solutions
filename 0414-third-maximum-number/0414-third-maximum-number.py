class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        unique=[]
        for i in nums:
            if i not in unique:
                unique.append(i)
        k=sorted(unique)
        if(len(unique)<3):
            return k[len(unique)-1]
        
        return k[len(unique)-3]