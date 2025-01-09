class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList();
        Map<Integer, Integer> mp = new HashMap();
        k--;
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
            if(i<k){
                continue;
            }
            ans.add(mp.size());
            if(mp.get(arr[i-k]) == 1){
                mp.remove(arr[i-k]);
            }
            else {
                mp.put(arr[i-k], mp.get(arr[i-k])-1);
            }
        }
        return ans;
    }
}