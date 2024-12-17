class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)
            return -1;
        int beg = 0, end = 0;
        
        for(int i: arr){
            beg = Math.max(beg, i);
            end+=i; 
        }
        int ans = beg;
        
        while(beg<=end){
            int mid = (beg+end)/2;
            if(isPossible(arr, k, mid)){
                ans=mid;
                end = mid-1;
            }
            else
                beg = mid+1;
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int k, int maxPages){
        int tot = 1, sum = 0;
        for(int i: arr){
            sum+=i;
            if(sum > maxPages){
                tot++;
                sum = i;
            }
        }
        return tot <= k;
    }
}