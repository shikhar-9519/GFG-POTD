class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int lo=0, hi = arr.length-1;
        int ans = arr.length + k;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > mid + k){
                hi = mid - 1;
                ans = mid + k;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}