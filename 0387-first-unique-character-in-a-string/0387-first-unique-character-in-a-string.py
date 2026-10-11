class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        g=dict()
        for st in s:
            g[st]=g.get(st,0)+1
        
        for i in range (len(s)):
            if g[s[i]]==1 :
                return i
        return -1


        