class Solution {
    public int findComplement(int num) {
        if(num==1)
            return 0;
        String b=Integer.toBinaryString(num);
        String j="";
        for(int i=0;i<b.length();i++)
        {
            char ch = b.charAt(i);
            if(ch=='1')
                j+="0";
            else
                j+="1";
        }
        return Integer.parseInt(j,2);
    }
}