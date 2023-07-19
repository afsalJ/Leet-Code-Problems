class Solution {
    public int strStr(String haystack, String needle) {
        int needleIndex=0;
        int startedIndex=0;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(needleIndex)){
                if(needleIndex==0){
                    startedIndex=i;
                }
                needleIndex++;
                if(needleIndex==needle.length())
                {
                    return (i+1)-needleIndex;
                }
            }
            else
            {
                if(needleIndex>0)
                {
                    i=startedIndex;
                }
                needleIndex=0;
            }
        }
        return -1;
    }
}