class Solution {
    public void leftRootRight(TreeNode root,ArrayList<Integer> List)
    {
        if(root==null){
            return;
        }
        leftRootRight(root.left,List);
        List.add(root.val);
        leftRootRight(root.right,List);
    }

    public List<Integer> inorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        leftRootRight(root,ans);
        return ans;
    }
}