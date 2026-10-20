class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len=strs.length;
        String d=strs[0];
        String k=strs[len-1];
        int i=0;
        while(i<d.length()&&i<k.length())
        {
            if(d.charAt(i)==k.charAt(i))
                i++;
            else
                break;
        }
        return d.substring(0,i);
    }
}