class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==1) {
            List<Integer> ans=new ArrayList<>();
            ans.add(1);
            List<List<Integer>> prev=new ArrayList<>();
            prev.add(ans);
            return prev;
        }
        else{
            List<Integer> ans =new ArrayList<>();
            ans.add(1);
            List<List<Integer>> prev=generate(numRows-1);
            if(prev.get(prev.size()-1).size()==1){
                ans.clear();
                ans.add(1);
                ans.add(1);
                prev.add(ans);
                return prev;
            }
            for(int i=0;i<prev.get(prev.size()-1).size()-1;i++){
                ans.add(prev.get(prev.size()-1).get(i)+prev.get(prev.size()-1).get(i+1));
            }
            ans.add(1);
            prev.add(ans);
            return prev;
        }
    }
}