class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int lo =1, hi=0, ans=0;
        for(int i: arr){
            hi=Math.max(hi,i);
        }
        while(lo<=hi){
            int bananaPerHour = (lo+hi)/2;
            int totHr = 0;
            for(int i:arr){
                totHr+= i%bananaPerHour == 0 ? i/bananaPerHour : i/bananaPerHour +1;
            }
            if(totHr > k){
                lo=bananaPerHour+1;
            }
            else {
                ans=bananaPerHour;
                hi=bananaPerHour-1;
            }
        }
        return ans;
    }
}