class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i =0 , j =0, n = a.length, m =b.length, ans,c =0;
        
        while(true){
            int x1 = i<n ? a[i] : Integer.MAX_VALUE;
            int x2 = j<m ? b[j] : Integer.MAX_VALUE;
            
            if(x1 < x2){
                i++;
                ans = x1;
            }
            else {
                j++;
                ans = x2;
            }
            c++;
            if(c == k){
                return ans;
            }
        }
    
    }
}