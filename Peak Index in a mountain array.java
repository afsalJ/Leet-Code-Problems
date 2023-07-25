class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int[] temp=Arrays.copyOf(arr, arr.length);;
        Arrays.sort(temp);
        int max=temp[temp.length-1];
        for(int i=0;i<arr.length;i++)
        {
            if(max==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}