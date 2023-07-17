class Solution {
    public boolean isPalindrome(int x) 
    {
        int palindrome=0;
        int temp=x;
        while(x>0)
        {
            int remainder=x%10;
            x=x/10;
            palindrome=(palindrome*10)+remainder;
            System.out.println(palindrome);
        }
        if(palindrome==temp){
            return true;
        }
        else{
            return false;
        }
    }
}