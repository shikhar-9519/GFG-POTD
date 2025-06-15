class Solution {
    public int minCost(int[] heights, int[] cost) {
        // code here
        int lo = Arrays.stream(heights).min().getAsInt();
        int hi = Arrays.stream(heights).max().getAsInt();
        int ans = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid1 = lo+(hi-lo)/3;
            int mid2 = hi- (hi-lo)/3;
            
            int cost1 = getCost(heights, cost, mid1);
            int cost2 = getCost(heights, cost, mid2);
            
            ans=Math.min(ans, Math.min(cost1, cost2));
            if(cost1<cost2){
                hi = mid2-1;
            }
            else {
                lo = mid1+1;
            }
        }
        return ans;
    }
    static int getCost(int[] heights, int[] cost, int h){
        int totalCost = 0;
        for(int i=0;i<heights.length;i++){
            totalCost+=Math.abs(heights[i]-h)*cost[i];
        }
        return totalCost;
    }
}