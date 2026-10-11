class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()))
            return  true;
        else if(word.equals(word.toLowerCase()))
            return true;
        char ch=word.charAt(0);
        String sst=word.substring(1,word.length());
        if(Character.isUpperCase(ch)&&sst.equals(sst.toLowerCase()))
        {
           
                return true;
        }
        
        return false;
    }
}