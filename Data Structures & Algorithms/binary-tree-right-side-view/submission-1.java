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
    public List<Integer> rightSideView(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> output = new ArrayList<>();

            if(root == null) return output;
            queue.offer(root);

             while(!queue.isEmpty())
             {
                int n = queue.size();
                for(int i=0; i<n; i++)
                {
                    TreeNode node = queue.poll();
                    if(i == n-1)
                     output.add(node.val);
                    
                    if(node.left != null)
                        queue.offer(node.left);
                    if(node.right!= null)
                        queue.offer(node.right);
                }
             }
             return output;     
    }
}
