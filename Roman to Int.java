class Solution 
{
    public int romanToInt(String s) 
    {
        char[] roman={'M','D','C','L','X','V','I'};
        int[] romanInt={1000,500,100,50,10,5,1};
        int integer=0;
        boolean flag=true;
        for(int i=0;i<s.length()-1;i++)
        {
            char a=s.charAt(i);
            // System.out.println(a);
            char b=s.charAt(i+1);
            // System.out.println(b);
            int index_a=new String(roman).indexOf(a);
            // System.out.println(index_a);
            int index_b=new String(roman).indexOf(b);
            // System.out.println(index_b);
            if(romanInt[index_a]<romanInt[index_b])
            {
                integer+=(romanInt[index_b]-romanInt[index_a]);
                // System.out.println(integer);
                if(i==s.length()-2)
                {
                    flag=false;
                }
                i+=1;
            }
            else
            {
                integer+=romanInt[index_a];
                // System.out.println(integer);
            }
        }
        if(flag){
            integer+=romanInt[new String(roman).indexOf(s.charAt(s.length()-1))];
            // System.out.println(integer);
        }
        return integer;
    }
}