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
    public boolean check(TreeNode a,TreeNode b)
    {
        if(a==null && b==null) return true;
        else if(a==null || b==null)return false;
        if(a.val==b.val)
        {
            return check(a.left,b.left) && check(a.right,b.right);
        }
        return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        boolean ans=true;
        ans=check(p,q);
        return ans;
    }
}