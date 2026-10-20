class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len=strs.length;
        String d=strs[0];
        String k=strs[len-1];
        int l1=d.length();
        int l2=k.length();
        int ll=Math.min(l1,l2);
        String j="";
        for(int i=0;i<ll;i++)
        {
            if(d.charAt(i)==k.charAt(i))
                j=j+d.charAt(i);
            else
                break;
        }
        return j;
    }
}