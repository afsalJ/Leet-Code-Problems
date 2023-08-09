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
    public boolean path(TreeNode root,int target,int sum){
        if(root.left==null && root.right==null){
            if(target==sum+root.val)return true;
            else return false;
        }
        else{
            if(root.left==null && root.right!=null){
                return path(root.right,target,sum+root.val);
            }
            else if(root.right==null && root.left!=null){
                return path(root.left,target,sum+root.val);
            }
            else{
                return path(root.left,target,sum+root.val)||path(root.right,target,sum+root.val);
            }
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return path(root,targetSum,0);
    }
}