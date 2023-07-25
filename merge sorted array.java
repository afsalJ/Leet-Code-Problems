class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[]=new int[m+n];
        merged=nums1;
        int j=m;
        for(int i=0;i<n;i++)
        {
            merged[m++]=nums2[i];
        }
        for(int i:merged){
            System.out.print(i+" ");
        }

        Arrays.sort(merged);
        nums1=merged;
    }
}