class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> series=new HashMap<>();
        return climbStairs(n,series);
    }
    public int climbStairs(int n, HashMap<Integer, Integer> series){
        if(n==0 || n==1)
        {
            return 1;
        }
        else if(!series.containsKey(n)){
            series.put(n,climbStairs(n-1,series)+climbStairs(n-2,series));
        }
        return series.get(n);
    }
}