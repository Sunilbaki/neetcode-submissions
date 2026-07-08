/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
         height(root);
         return diameter;
    }

    public int height(TreeNode node)
    {
        if(node == null){
            return 0;
        }

        int n = height(node.left);
        int m = height(node.right);

        diameter = Math.max((n+m), diameter);

        return Math.max(n, m)+1;
    }
}
