class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag=false;
        int length=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                length+=1;
                flag=true;
            }
            else if(s.charAt(i)==' ' && flag)
            {
                return length;
            }
        }
        return length;
    }
}