class Solution 
{
    public int[] copy(int source[],int destination[])
    {
        destination[0]=1;
        for(int i=0;i<source.length;i++)
        {
            destination[i+1]=source[i];
        }
        return destination;
    }
    public int[] plusOne(int[] digits) 
    {
        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]+=1;
            return digits;
        }
        else
        {
            int newDigits[]=new int[digits.length+1];
            int tempDigits[]=digits;
            newDigits[0]=0;
            for(int i=1;i<=digits.length;i++)
            {
                if(digits[digits.length-i]==9)
                {
                    digits[digits.length-i]=0;
                    if(i==digits.length)
                    {
                        return copy(digits,newDigits);
                    }
                }
                else
                {
                    digits[digits.length-i]+=1;
                    return digits;
                }
            }
            if(newDigits[0]==0)
            {
                return tempDigits;
            }
            else
            {
                return newDigits;
            }
        }
    }
}