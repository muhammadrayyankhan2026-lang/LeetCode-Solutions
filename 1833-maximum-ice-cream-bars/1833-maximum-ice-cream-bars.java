class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int i:costs)
        {
            if(coins<i)
                break;
            c++;
            coins-=i;
        }
        return c;
    }
}