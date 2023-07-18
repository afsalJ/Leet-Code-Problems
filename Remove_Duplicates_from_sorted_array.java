class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int length=nums.length;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==101)
            {
                return length;
            }
            if(nums[i]==nums[i+1])
            {
                for(int j=i+1;j<nums.length-1;j++)
                {   
                    nums[j]=nums[j+1];
                }
                nums[nums.length-1]=101;
                length-=1;
                if(nums[i]==nums[i+1])
                {
                    i-=1;
                }
            }
        }
        return length;
    }
}