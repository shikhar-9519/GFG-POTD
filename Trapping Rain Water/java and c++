class Solution {
    public int maxWater(int arr[]) {
        // code here
        int ans=0, lmax=0, rmax=0, i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]<=arr[j]){
                if(lmax<arr[i]){
                    lmax=arr[i];
                }
                else {
                 ans+=lmax-arr[i];
                }
                i++;
            }
            else {
                if(rmax<arr[j]){
                    rmax=arr[j];
                }
                else {
                 ans+=rmax-arr[j];
                }
                j--;
            }
        }
        return ans;
    }
}