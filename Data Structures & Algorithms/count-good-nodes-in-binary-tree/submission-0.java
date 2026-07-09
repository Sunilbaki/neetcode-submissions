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
    public int goodNodes(TreeNode root) {
        return count(root.val, root);
    }

    public int count(int max, TreeNode node){

        int ans = 0;

        if(node == null) return ans;

        if(node.val >= max)
        {
            max = node.val;
            ans = 1;
        }

        return ans+count(max, node.left)+ count(max, node.right);
         
    }
}
