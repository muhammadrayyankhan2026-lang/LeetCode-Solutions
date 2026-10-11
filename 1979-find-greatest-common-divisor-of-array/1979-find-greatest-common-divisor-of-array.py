
class Solution(object):
    def findGCD(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=sorted(nums)
        a=l[0]
        b=l[len(nums)-1]
        while(b!=0):
            a,b=b,a%b
        return a        