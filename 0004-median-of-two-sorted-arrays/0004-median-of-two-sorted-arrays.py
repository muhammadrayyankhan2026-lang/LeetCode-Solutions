class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        q=[]
        nums1.extend(nums2)
        q=nums1
        q=sorted(q)
        l=len(q)
        
        if(l%2!=0):
            k=l//2
            return q[k]
        else:
            g=(l//2)
            return float((q[g]+q[g-1])/2.0)
        return 0.0
        
                