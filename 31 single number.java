import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

class Solution {
    public int singleNumber(int[] nums) {
        // int freq[]=new int[1000];
        Dictionary<Integer,Integer> countOfValues=new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(countOfValues.get(nums[i])==null)countOfValues.put(nums[i],1);
            else{
                countOfValues.put(nums[i],countOfValues.get(nums[i])+1);
            }
        }
        Enumeration<Integer> k=countOfValues.keys();
        while(k.hasMoreElements()){
            int key=k.nextElement();
            if(countOfValues.get(key)==1) return key;
        }
        return 0;
    }
}