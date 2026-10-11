class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0;
        int s=0;
        int t=0;
        for(int i=0;i<gas.length;i++)
        {
            int net=gas[i]-cost[i];
            t+=net;
            tank+=net;
            if(tank<0)
            {
                s=i+1;
                tank=0;
            }
        }
        return t>=0?s:-1;
    }
}