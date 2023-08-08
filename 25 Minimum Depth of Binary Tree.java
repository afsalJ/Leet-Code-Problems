lass Solution {
    public int min(int a,int b){
        if(a<b) return a;
        else if(a>b) return b;
        else return a;
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0; // false.. r9->false rnull->true..r20->false
        // else if(root.left==null || root.right==null) return 1;
        else{
            if(root.left!=null && root.right!=null){
                return min(minDepth(root.left), minDepth(root.right))+1;
            }
            else if(root.left==null){
                return minDepth(root.right)+1;
            }
            else if(root.right==null){
                return minDepth(root.left)+1;
            }
            else{
                return 1;
            }
            /*min(r9,r20)+1
            r9->min(rnull,rnull)+1->1
            r20->min(r15,r7)+1->  
                r15->min(rnull,rnull)+1->1;
                r7->min(rnull,rnull)+1->1;
                -------------> min(1,1)+1 ->2
                -------------------->min(1,2)+1
            */
        }
    }
}