class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        String ans="";
        int smallestIndex=0;
        int size=200;
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<size)
            {
                size=strs[i].length();
                smallestIndex=i;
            }
        }
        // System.out.println(smallestIndex);
        for(int i=0;i<strs[smallestIndex].length();i++)
        {
            String check=""+strs[0].charAt(i);
            // System.out.println(check);
            for(int j=1;j<strs.length;j++)
            {
                String check1=""+strs[j].charAt(i);
                if(!check.equals(check1))
                {
                    System.out.println(ans);
                    return ans;
                }
            }
            ans=ans+""+check;
        }
        return ans;
    }
}