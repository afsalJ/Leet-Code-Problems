class Solution 
{
    public String addBinary(String a, String b) 
    {
        int j=0;
        int decimal1=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            decimal1+=(Integer.parseInt(""+a.charAt(i))*(Math.pow(2,j)));
            j++;
        }
        int decimal2=0;
        j=0;
        for(int i=b.length()-1;i>=0;i--)
        {
            decimal2+=(Integer.parseInt(""+b.charAt(i))*(Math.pow(2,j)));
            j++;
        }
        int finalBin=decimal1+decimal2;
        String binary="";
        while(final!=0 || final!=1)
        {
            binary+=""+final%2;
            final=final/2;
        }
        if(final==1)
        {
            binary+="1";
        }
        return binary;
    }
}