class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 0, high = stalls[n-1]-stalls[0], ans =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(mid, k, stalls)){
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
    static boolean isPossible(int mid, int k, int[] stalls){
        int count = 1, lastCow = stalls[0];
        for(int i=1;i< stalls.length;i++){
            if(stalls[i]-lastCow>=mid){
                count++;
                lastCow = stalls[i];
                if(count >= k){
                    return true;
                }
            }
        }
        return false;
    }
}