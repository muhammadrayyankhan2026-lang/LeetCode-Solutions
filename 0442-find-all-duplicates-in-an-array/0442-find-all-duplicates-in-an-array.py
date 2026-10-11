class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n=len(nums)
        for i in range(n):
            x=(nums[i]-1)%n
            nums[x]+=n
        r=0
        
        for i in range(n):
            if nums[i]>2*n:
                nums[r]=i+1
                r+=1
        
        return nums[:r]