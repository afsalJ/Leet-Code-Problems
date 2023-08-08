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
    public int Depth(TreeNode a,int ans){
        if(!(a==null)){
            ans++;
            ans=Math.max(Depth(a.left,ans) ,Depth(a.right,ans));
        }
        return ans;
    }
    public int maxDepth(TreeNode root) {
        return Depth(root,0);
    }
}