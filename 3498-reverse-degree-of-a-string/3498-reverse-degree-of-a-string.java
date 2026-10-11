class Solution {
    public int reverseDegree(String s) {
        int v=0;
        for (int i=0;i<s.length();i++)
        {
            int h='z'-s.charAt(i)+1;
            
            v+=(h*(i+1));
        }
        return v;
    }
}