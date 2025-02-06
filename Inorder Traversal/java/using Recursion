class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
         ArrayList<Integer> ans = new ArrayList();
         solve(root, ans);
         return ans;
    }
    void solve(Node root, ArrayList<Integer> ans) {
        if(root == null)
            return;
        solve(root.left, ans);
        ans.add(root.data);
        solve(root.right, ans);
    }
}