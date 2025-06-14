class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int lo = 1, hi = Arrays.stream(arr).max().getAsInt(), ans=0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(chec(arr, mid, k)){
                ans=mid;
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return ans;
    }
    static boolean chec(int[] arr, int possibleAns, int k){
        int sum=0;
        for(int i: arr){
            sum+=i%possibleAns == 0?i/possibleAns : i/possibleAns +1;
        }
        return sum<=k;
    }
}