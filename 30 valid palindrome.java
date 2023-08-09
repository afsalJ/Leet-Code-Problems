class Solution {
    public String getString(String s){
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char temp=Character.toLowerCase(s.charAt(i));
            int ascii=temp;
            if((ascii>=97 && ascii<=122)||(ascii>=48 && ascii<=57)){
                ans+=""+temp;
            }
        }
        return ans;
    }
    public boolean isPalindrome(String s) {
        String check=getString(s);
        System.out.println(check);
        if(check=="")return true;
        else{
            if(check.length()==1)return true;
            else{
                for(int i=0,j=check.length()-1;i<=j;i++,j--){
                    if(check.charAt(i)!=check.charAt(j))return false;
                }
            }
        }
        return true;
    }
}