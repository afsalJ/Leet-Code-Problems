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
    public int max(int a,int b){
        if(a>b) return a;
        else if(a<b) return b;
        else return a;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        else{
            return max(height(root.left),height(root.right))+1;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null||(root.left==null && root.right==null)) return true;
        else{
            if(root.left==null){
                int h=height(root.right);
                if(h>=-1 && h<=1) return true;
                else return false;
            }
            else if(root.right==null){
                int h=height(root.left);
                if(h>=1 && h<=1) return true;
                else return false;
            }
            else{
                if(Math.abs(height(root.left)-height(root.right))<=1){
                    return isBalanced(root.left) && isBalanced(root.right);
                }
                else return false;
            }
        }
    }
}