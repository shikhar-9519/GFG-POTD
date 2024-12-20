class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                swap(mat, i, j);
            }
        }
        
        for(int i=0;i<(n/2);i++){
            for(int j=0;j<n;j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[n-1-i][j];
                mat[n-1-i][j] = tmp;
            }
        }
    }
    static void swap(int mat[][], int i, int j){
        int tmp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = tmp;
    }
}