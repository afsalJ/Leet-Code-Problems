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
    public boolean check(TreeNode a,TreeNode b){
        if(a==null && b==null) return true;
        else if(a==null || b==null) return false;
        else if(a.val==b.val){
            // System.out.println(a.val +" "+b.val);
            // System.out.println(a.left+" "+b.left);
            // System.out.println(a.right+" "+b.right);
            return check(a.left,b.right) && check(a.right,b.left);
        }
        else return false;
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
}