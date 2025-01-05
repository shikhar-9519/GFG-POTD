class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int cn=0, st=0, end=arr.length-1;
        while(st<end){
            if(arr[st]+arr[end]<target){
                cn+=end-st;
                st++;
            }
            else{
                end--;
            }
        }
        return cn;
    }
}