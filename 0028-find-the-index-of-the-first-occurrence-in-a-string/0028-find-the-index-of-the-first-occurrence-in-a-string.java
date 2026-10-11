class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
        {
            int k=haystack.indexOf(needle);
            return k;
        }
        return -1;
    }
}