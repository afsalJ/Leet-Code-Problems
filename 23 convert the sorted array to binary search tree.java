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
    public TreeNode createBST(int[] nums,int l,int r){
        if(l>r) return null;
        int mid=l+(r-l)/2;
        TreeNode ans=new TreeNode(nums[mid]);
        ans.val=nums[mid];
        ans.left=createBST(nums,l,mid-1);
        ans.right=createBST(nums,mid+1,r);
        return ans;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }
}