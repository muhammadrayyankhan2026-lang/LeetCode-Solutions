class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        boolean j=false;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                c++;
                j=true;
            }
            else if(!Character.isAlphabetic(s.charAt(i))&&j)
                break;
        }
        return c;
    }
}