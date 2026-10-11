class Solution {
    public int dayOfYear(String date) {
        int y=Integer.valueOf(date.substring(0,4));
        int m=Integer.valueOf(date.substring(5,7));
        int d=Integer.valueOf(date.substring(8));
        int a[]={0,31,59,90,120,151,181,212,243,273,304,334,365};
        if ((y % 400 == 0 && m>2) || (y % 4 == 0 && y % 100 != 0 && m>2))
            return a[m-1]+d+1;
        
        return a[m-1]+d;
    }
}