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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;

        if(isSameTree(root, subRoot))
         return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }


     public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(p);
        queue2.offer(q);

        while((!queue1.isEmpty()) && (!queue2.isEmpty()))
        {
            int n = queue1.size();
            int m = queue2.size();
            if(n!=m) return false;

            for(int i=0;i<n;i++)
            {
                TreeNode p1 = queue1.poll();
                TreeNode p2 = queue2.poll();

                if(p1 == null && p2 == null) continue;

                if(p1 == null) return false;

                if(p2== null) return false;
                if(p1.val!= p2.val)
                  return false;
                
                 queue1.offer(p1.left);
                 queue1.offer(p1.right);

                 queue2.offer(p2.left);
                 queue2.offer(p2.right);
            }
            
        }
        return true;
        
    }


}
