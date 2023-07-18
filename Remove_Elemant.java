class Solution
{
    public int removeElement(int[] nums, int val) 
    {
        int length=nums.length;
        if(val>50)
        {
            return nums.length;
        }
        for(int i=0;i<nums.length && nums[i]!=51;i++)
        {
            if(nums[i]==val)
            {
                if(i==nums.length-1){
                    nums[i]=51;
                }
                else
                {
                    for(int j=i;j<nums.length-1;j++)
                    {
                        nums[j]=nums[j+1];
                    }
                    nums[nums.length-1]=51;
                    if(nums[i]==val)
                    {
                        i-=1;
                    }
                }
                length-=1;

            }
        }
        return length;
    }
}