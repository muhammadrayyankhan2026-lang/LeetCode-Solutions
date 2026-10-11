class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="",s2="";
        for(String l:word1)
            s1+=l;
        for(String j:word2)
            s2+=j;
        return s1.equals(s2);
    }
}