class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=len(nums)
        for x in nums:
            i=abs(x)-1
            nums[i]=-abs(nums[i])
        r=0
        for i in range(l):
            if nums[i]>0:
                nums[r]=i+1
                r+=1

        return nums[:r]