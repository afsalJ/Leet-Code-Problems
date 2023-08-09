class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0){
            List<Integer> ans=new ArrayList<>();
            ans.add(1);
            return ans;
        }
        else{
            List<Integer> prev=getRow(rowIndex-1);
            if(prev.size()<2){
                prev.add(1);
                return prev;
            }
            else{
                List<Integer> ans=new ArrayList<>();
                ans.add(1);
                for(int i=0;i<prev.size()-1;i++){
                    ans.add(prev.get(i)+prev.get(i+1));
                }
                ans.add(1);
                return ans;
            }
        }
    }
}