class Solution {
public String addBinary(String a, String b) {

        //Finding large and small strings in order to add;

        String stringLarge="";
        String stringSmall="";
        if(a.length()>=b.length())
        {
            stringLarge+=a;
            stringSmall+=b;
        }
        else 
        {
            stringLarge+=b;
            stringSmall+=a;
        }

        //Addition

        int carry=0;
        String result=""+stringLarge;
        for(int i=stringLarge.length()-1,j=stringSmall.length()-1;i>=0 || j>=0;i--,j--)
        {
            if(j<0 && carry==1)
            {
                if(stringLarge.charAt(i)=='0')
                {
                    // result.charAt(i)='1';
                    result=result.substring(0,i)+'1'+result.substring(i+1);
                    carry=0;
                }
                else
                {
                    // result.charAt(i)='0';
                    result=result.substring(0,i)+'0'+result.substring(i+1);
                    carry=1;
                }
            }
            else if(carry==0 && j<0)
            {
                return result;
            }
            else
            {
                if((stringLarge.charAt(i)=='0' && stringSmall.charAt(j)=='1') || (stringLarge.charAt(i)=='1' && stringSmall.charAt(j)=='0'))
                {
                    if(carry==1)
                    {
                        // result.charAt(i)='0';
                        result=result.substring(0,i)+'0'+result.substring(i+1);
                    }
                    else
                    {
                        // result.charAt(i)='1';
                        result=result.substring(0,i)+'1'+result.substring(i+1);
                    }
                }
                // else if(stringLarge.charAt(i)=='1' && stringSmall.charAt(j)=='0')
                // {
                //     if(carry==1)
                //     {
                //         result.charAt(i)='0';
                //         carry=1;
                //     }
                //     else
                //     {
                //         result.charAt(i)='1';
                //     }
                // }
                else if(stringLarge.charAt(i)=='0' && stringSmall.charAt(j)=='0')
                {
                    if(carry==1)
                    {
                        // result.charAt(i)='1';
                        result=result.substring(0,i)+'1'+result.substring(i+1);
                        carry=0;
                    }
                    else
                    {
                        // result.charAt(i)='0';
                        result=result.substring(0,i)+'0'+result.substring(i+1);
                    }
                }
                else
                {
                    if(carry==1)
                    {
                        // result.charAt(i)='1';
                        result=result.substring(0,i)+'1'+result.substring(i+1);
                    }
                    else
                    {
                        // result.charAt(i)='0';
                        result=result.substring(0,i)+'0'+result.substring(i+1);
                        carry=1;
                    }
                }
            } 
        }
        if(carry==1)
        {
            return "1"+result;
        }
        return result;
    }
};