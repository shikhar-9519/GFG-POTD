class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int currSum=0, ans=0;
        Map<Integer,Integer> mp = new HashMap();
        mp.put(0, -1);
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(mp.containsKey(currSum-k)){
                ans=Math.max(ans, i-mp.get(currSum-k));
            }
            mp.putIfAbsent(currSum, i);
        }
        return ans;
    }
}