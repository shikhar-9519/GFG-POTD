//TOP DOWN APPROACH TO MIRROR THE ELEMENTS OF THE BINARY TREE
class Solution {
    
    void mirror(Node node) {
        if (node == null) return;

        //swapping left and right children of current parent
        Node temp = node.right;
        node.right = node.left;
        node.left = temp;

        mirror(node.right);
        mirror(node.left);
    }
}
