class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<=1){
            return 0;
        }

        Arrays.sort(nums);

        int max=0;
        for(int i=1;i<nums.length;i++){
            int diff=nums[i]-nums[i-1];
            max= Math.max(max, diff);
        }
        return max;

    }
}